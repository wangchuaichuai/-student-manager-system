/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.department.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ychs.uolab.department.vo.Dept;
import com.ychs.uolab.department.vo.Major;
import com.ychs.uolab.util.DbUtil;

/**
 * @author 王欣
 * @version 1.0
 */
public class DeptDaoImpl implements DeptDao {
	

	@Override
	public int insertMajor(Major major) {
		int flag = 0;
		Connection conn = DbUtil.getConnection();
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO t_major VALUES(?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, major.getMajorid());
			pstmt.setString(3, major.getMajorName());
			pstmt.setInt(2, major.getDid());
			pstmt.setString(4, major.getRemark());
			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(null, pstmt, conn);
		}
		return flag;
	}

	@Override
	public int insertDept(Dept dept) {
		Connection conn = DbUtil.getConnection();
		PreparedStatement pstmt = null;
		int flag = 0;
		String sql = "INSERT INTO t_department VALUES(?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dept.getDid());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getRemark());
			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(null, pstmt, conn);
		}
		
		return flag;
	}
	
}
