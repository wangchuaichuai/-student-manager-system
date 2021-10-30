/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.openclass.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ychs.uolab.openclass.vo.Openclass;
import com.ychs.uolab.util.DbUtil;

/**
 * 
 * @author 王欣
 * @version 1.0
 */

public class OpenclassDaoImpl implements OpenclassDao {

	@Override
	public int insertOpenclass(Openclass openclass) {
		int count = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;

		conn = DbUtil.getConnection();
		String sql = "INSERT INTO t_openclass VALUES(?,?,?,?,?,?,?,?,?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, openclass.getCid());
			pstmt.setString(2, openclass.getCourseDate());
			pstmt.setString(3, openclass.getSpecial());
			pstmt.setString(4, openclass.getSpeaker());
			pstmt.setString(5, openclass.getOrganizer());
			pstmt.setString(6, openclass.getSite());
			pstmt.setString(7, openclass.getGroupshow());
			pstmt.setString(8, openclass.getWay());
			pstmt.setInt(9, openclass.getCredit());
			pstmt.setInt(10, openclass.getNum());
			pstmt.setString(11, openclass.getRemark());
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(null, pstmt, conn);
		}

		return count;
	}

	@Override
	public List<Openclass> selectOpenClass(String courseDate, String dname, String grade, String major) {
		List<Openclass> list = new ArrayList<Openclass>();
		Connection conn = DbUtil.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			String sql = "select * "
					+ "from t_openclass, t_openclass_member, t_labmember, t_class, t_major, t_department "
					+ "where t_openclass.cid = t_openclass_member.cid "
					+ "and t_openclass_member.member_id = t_labmember.member_id " + "and t_labmember.cno = t_class.cno "
					+ "and t_class.major_id = t_major.major_id " + "and t_major.did = t_department.did ";
			StringBuilder sb = new StringBuilder(sql);
			if (courseDate != null) {
				sb.append("and course_date = '" + courseDate + "'");
			}
			if (dname != null) {
				sb.append("and dname = '" + dname + "'");
			}
			if (grade != null) {
				sb.append("and grade = '" + grade + "'");
			}
			if (major != null) {
				sb.append("and major_name = '" + major + "'");
			}
			sql = sb.toString();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int cid = rs.getInt("cid");
				String courseDate1 = rs.getString("course_date");
				String special = rs.getString("special");
				String speaker = rs.getString("speaker");
				String organizer = rs.getString("organizer");
				String site = rs.getString("site");
				String groupShow = rs.getString("group_show");
				String way = rs.getString("way");
				int credit = rs.getInt("credit");
				int num = rs.getInt("num");
				String remark = rs.getString("remark");
				Openclass oc = new Openclass(cid, courseDate1, special, speaker, organizer, site, groupShow, way,
						credit, num, remark);
				list.add(oc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(rs, null, conn);
		}
		return list;

	}

}
