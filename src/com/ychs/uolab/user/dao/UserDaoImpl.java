/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ychs.uolab.user.vo.User;
import com.ychs.uolab.util.DbUtil;
import com.ychs.uolab.util.DbUtilJdbc;
import com.ychs.uolab.util.Md5Util;

/**
 * 
 * @author 王欣
 * @version 1.0
 */
public class UserDaoImpl implements UserDao {

	@Override
	public List<User> selectUser(String uname, String dname, String major, String classes, String grade) {
		Connection conn = DbUtil.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		List<User> userList = new ArrayList<User>();
		// SQL语句是动态变化的
		String sql = "SELECT * FROM t_user WHERE 1=1";

		StringBuilder stringBuilder = new StringBuilder(sql);
		if (uname != null) {
			stringBuilder.append("AND username='" + uname + "'");
		}
		if (dname != null) {
			stringBuilder.append("AND dname='" + dname + "'");
		}
		if (major != null) {
			stringBuilder.append("AND major_name='" + major + "'");
		}
		if (classes != null) {
			stringBuilder.append("AND cname='" + classes + "'");
		}
		if (grade != null) {
			stringBuilder.append("AND grade='" + grade + "'");
		}
		sql = stringBuilder.toString();
		System.out.println("sql");

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			// 把rs结果集里面的数据转移到集合userList中

			while (rs.next()) {
				User user = new User();
				// rs.get里的username是表里的字段
				user.setUsername(rs.getString("username"));
				user.setDname(rs.getString("dname"));
				user.setMarjorname(rs.getString("major_name"));
				user.setCname(rs.getString("cname"));
				user.setGrade(rs.getString("grade"));
				user.setTelephone(rs.getString("telephone"));
				user.setQq(rs.getString("qq"));
				user.setDuty(rs.getString("duty"));
				user.setStatus(rs.getString("status"));
				userList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(rs, null, conn);
		}
		return null;
	}

	@Override
	public int deleteUser(String userid) {
		Connection conn = DbUtil.getConnection();
		PreparedStatement pstmt = null;
		int count = 0;

		String sql = "DELETE FROM t_user WHERE uid=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(userid));
			count = pstmt.executeUpdate();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(null, pstmt, conn);
		}
		return count;
	}

	@Override
	public int updateUser(User user) {
		Connection conn = DbUtil.getConnection();
		PreparedStatement pstmt = null;
		int count = 0;
		String sql = "UPDATE t_user SET telephone=?,qq=?,duty=?,remark=? WHERE uid=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getTelephone());
			pstmt.setString(2, user.getQq());
			pstmt.setString(3, user.getDuty());
			pstmt.setString(4, user.getRemark());
			pstmt.setInt(5, user.getUid());
			// count表示的是执行的SQL影响到的记录行数
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(null, pstmt, conn);
		}
		return count;
	}

	@Override
	public boolean insertUser(User user) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;

		conn = DbUtil.getConnection();
		String sql = "INSERT INTO t_user VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, user.getUid());
			pstmt.setString(2, user.getUsername());
			pstmt.setString(3, Md5Util.getMD5(user.getPassword()));
			pstmt.setString(4, user.getRealname());
			pstmt.setString(5, user.getSex());
			pstmt.setString(6, user.getTelephone());
			pstmt.setString(7, user.getDname());
			pstmt.setString(8, user.getMarjorname());
			pstmt.setString(9, user.getCname());
			pstmt.setString(10, user.getGrade());
			pstmt.setString(11, user.getDuty());
			pstmt.setString(12, user.getQq());
			pstmt.setString(13, user.getStatus());
			pstmt.setString(14, user.getRemark());
			// 这个方法执行的是insert，update，delete语句
			// 如果执行成功 则count非0 ，失败返回0
			int count = pstmt.executeUpdate();
			if (count != 0) {
				// 添加成功
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(null, pstmt, conn);
		}

		return flag;
	}

	@Override
	public boolean login(String userName, String userPsw) {
		// 数据库库连接
		Connection conn = null;
		// 结果集，查询得到结果
		ResultSet rs = null;
		// 准备并执行SQL语句的
		PreparedStatement pstmt = null;
		// 登陆是否成功的标志；false表示登陆失败
		boolean loginFlag = false;
		// 打开数据库连接
		conn = DbUtilJdbc.getConnection();
		// 准备select语句;？叫做占位符
		String sql = "SELECT * FROM t_user WHERE username=? AND password=?";
		// 准备SQL语句
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			// 给？赋值
			pstmt.setString(1, userName);
			pstmt.setString(2, userPsw);
			// 执行sql语句，下达执行指令；rs就是查到的结果
			rs = pstmt.executeQuery();
			// rs里有数据的话，next（）返回true；否则返回false
			if (rs.next()) {
				loginFlag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(rs, pstmt, conn);
		}
		return loginFlag;
	}

}
