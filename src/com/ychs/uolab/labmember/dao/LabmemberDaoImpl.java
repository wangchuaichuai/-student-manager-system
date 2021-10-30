/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.labmember.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ychs.uolab.labmember.vo.Labmember;
import com.ychs.uolab.labmember.vo.Multitable;
import com.ychs.uolab.util.DbUtil;

/**
 * 
 * @author 王欣
 * @version 1.0
 */
public class LabmemberDaoImpl implements LabmemberDao {

	@Override
	public boolean insertLabmember(Labmember labmember) {
		boolean flag = false;
		Connection conn = DbUtil.getConnection();
		PreparedStatement pstmt = null;

		String sql = "INSERT INTO t_labmember VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, labmember.getMemberid());
			pstmt.setInt(2, labmember.getCno());
			pstmt.setString(3, labmember.getStuname());
			pstmt.setString(4, labmember.getStuid());
			pstmt.setString(5, labmember.getSex());
			pstmt.setString(6, labmember.getGrade());
			pstmt.setString(7, labmember.getNativeplace());
			pstmt.setString(8, labmember.getTelephone());
			pstmt.setString(9, labmember.getEmail());
			pstmt.setString(10, labmember.getCampuspost());
			pstmt.setString(11, labmember.getJoiningdate());
			pstmt.setString(12, labmember.getStatus());
			pstmt.setString(13, labmember.getLabjob());
			pstmt.setString(14, labmember.getRemark());
			int count = pstmt.executeUpdate();
			if (count != 0) {
				flag = true;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(null, pstmt, conn);
		}

		return flag;
	}

	@Override
	public int updateLabmember(Labmember labmember) {
		int count = 0;
		Connection conn = DbUtil.getConnection();
		PreparedStatement pstmt = null;
		String sql = "UPDATE t_labmember SET telephone=?,campus_post=?,status=?,lab_job=?,remark=? WHERE member_id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, labmember.getTelephone());
			pstmt.setString(2, labmember.getCampuspost());
			pstmt.setString(3, labmember.getStatus());
			pstmt.setString(4, labmember.getLabjob());
			pstmt.setString(5, labmember.getRemark());
			pstmt.setInt(6, labmember.getMemberid());
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(null, pstmt, conn);
		}
		return count;
	}

	@Override
	public int deleteLabmember(int memberid) {
		int flag = 0;
		Connection conn = DbUtil.getConnection();
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM t_labmember WHERE member_id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, memberid);
			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(null, pstmt, conn);
		}
		return flag;
	}

	@Override
	public List<Multitable> selectLabmembers(String stuname, String grade, String telephone, String dname,
			String majorname, String status, String campuspost, String labjob) {
		Connection conn = DbUtil.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		List<Multitable> multitables = new ArrayList<Multitable>();
		// sql语句动态变化，多表查询，连接成员表，课程表，和专业表
		// 可变字符串
		String sql = "SELECT \r\n" + "t_labmember.stu_name,\r\n" + "t_major.major_name,\r\n" + "t_department.dname,\r\n"
				+ "t_labmember.grade,\r\n" + "t_labmember.telephone,\r\n" + "t_labmember.`status`,\r\n"
				+ "t_labmember.campus_post\r\n" + "t_labmember.lab_job\r\n" + "FROM\r\n" + "t_labmember\r\n"
				+ "INNER JOIN t_class ON t_labmember.cno = t_class.cno\r\n"
				+ "INNER JOIN t_major ON t_class.major_id = t_major.major_id\r\n"
				+ "INNER JOIN t_department ON t_major.did = t_department.did\r\n" + "WHERE 1=1";
		StringBuilder stringBuilder = new StringBuilder(sql);
		if (stuname != null) {
			stringBuilder.append("AND stu_name='" + stuname + "'");
		}
		if (grade != null) {
			stringBuilder.append("AND grade='" + grade + "'");
		}
		if (telephone != null) {
			stringBuilder.append("AND telephone='" + telephone + "'");
		}
		if (dname != null) {
			stringBuilder.append("AND dname='" + dname + "'");
		}
		if (majorname != null) {
			stringBuilder.append("AND major_name='" + majorname + "'");
		}
		if (status != null) {
			stringBuilder.append("AND status='" + status + "'");
		}
		if (campuspost != null) {
			stringBuilder.append("AND campus_post='" + campuspost + "'");
		}
		if (labjob != null) {
			stringBuilder.append("AND lab_job='" + labjob + "'");
		}
		sql = stringBuilder.toString();
		System.out.println("sql");

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			// 把rs结果集里面的数据转移到labmemberlist中
			while (rs.next()) {
				Multitable labmember = new Multitable();
				labmember.setStuname(rs.getString("stu_name"));
				labmember.setGrade(rs.getString("grade"));
				labmember.setTelephone(rs.getString("telephone"));
				labmember.setDname(rs.getString("dname"));
				labmember.setMajorname(rs.getString("major_name"));
				labmember.setStatus(rs.getString("status"));
				labmember.setCampuspost(rs.getString("campus_post"));
				labmember.setLabjob(rs.getString("lab_job"));
				multitables.add(labmember);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(rs, null, conn);
		}
		return multitables;
	}

}
