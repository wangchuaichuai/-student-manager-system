/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.credit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ychs.uolab.credit.vo.Credit;
import com.ychs.uolab.util.DbUtil;

/**
 * @author 王欣
 * @version 1.0
 */
public class CreditDaoImpl implements CreditDao {

	@Override
	public int insertCredit(Credit credit) {
		int count = 0;
		Connection conn = DbUtil.getConnection();
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO t_credit VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, credit.getCreditId());
			pstmt.setInt(2, credit.getMemberId());
			pstmt.setString(3, credit.getStuId());
			pstmt.setString(4, credit.getSname());
			pstmt.setString(5, credit.getGrade());
			pstmt.setString(6, credit.getDept());
			pstmt.setInt(7, credit.getCreditPoints());
			pstmt.setString(8, credit.getSubject());
			pstmt.setString(9, credit.getGainDate());
			pstmt.setString(10, credit.getEntryPerson());
			pstmt.setString(11, credit.getEntryDate());
			pstmt.setString(12, credit.getRemark());
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(null, pstmt, conn);
		}
		return count;
	}

	@Override
	public List<Credit> selectCredit(String stuId, String sname, String entrydate) {
		List<Credit> creditsList = new ArrayList<Credit>();

		Connection conn = DbUtil.getConnection();
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM t_credit WHERE 1=1 ";

		StringBuilder stringBuilder = new StringBuilder(sql);

		if (stuId != null) {
			stringBuilder.append(" AND stu_id='" + stuId + "'");
		}
		if (sname != null) {
			stringBuilder.append(" AND sname='" + sname + "'");
		}
		if (entrydate != null) {
			stringBuilder.append(" AND entrydate='" + entrydate + "'");
		}

		sql = stringBuilder.toString();

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Credit credit = new Credit();
				credit.setCreditId(rs.getInt("credit_id"));
				credit.setCreditPoints(rs.getInt("credit_points"));
				credit.setMemberId(rs.getInt("member_id"));
				credit.setStuId(rs.getString("stu_id"));
				credit.setGrade(rs.getString("grade"));
				credit.setSname(rs.getString("sname"));
				credit.setSubject(rs.getString("subject"));
				credit.setDept(rs.getString("dept"));
				credit.setEntryPerson(rs.getString("getdate"));
				credit.setEntryDate(rs.getString("entrydate"));
				credit.setRemark(rs.getString("remark"));
				credit.setEntryPerson(rs.getString("entryperson"));
				creditsList.add(credit);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(rs, null, conn);
		}

		return creditsList;
	}

}
