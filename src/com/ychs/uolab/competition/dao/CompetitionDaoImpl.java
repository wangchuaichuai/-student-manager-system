/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.competition.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ychs.uolab.competition.vo.Competition;
import com.ychs.uolab.util.DbUtil;

/**
 * 比赛接口实现类
 *
 * @author 王欣
 * @version 1.0
 */
public class CompetitionDaoImpl implements CompetitionDao {

	@Override
	public int insertCompetition(Competition competition) {
		
		/**
		 * @param cid         竟赛编号
		 * @param categories  竞赛类别
		 * @param year        年度
		 * @param topic       主题
		 * @param groupleader 组长
		 * @param groupmember 组员
		 * @param award       获奖等级
		 * @param adviser     指导老师
		 * @param remark      备注
		 */
		
		int count = 0;
		Connection conn = DbUtil.getConnection();
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO t_competition VALUES(?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, competition.getCid());
			pstmt.setString(2, competition.getCategories());
			pstmt.setString(3, competition.getYear());
			pstmt.setString(4, competition.getTopic());
			pstmt.setString(5, competition.getGroupleader());
			pstmt.setString(6, competition.getGroupmember());
			pstmt.setString(7, competition.getAward());
			pstmt.setString(8, competition.getAdviser());
			pstmt.setString(9, competition.getRemark());
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(null, pstmt, conn);
		}
		return count;
	}

	@Override
	public int updateCompetition(Competition competition) {
		int count = 0;
		Connection conn = DbUtil.getConnection();
		PreparedStatement pstmt = null;
		String sql = "UPDATE t_competition SET groupmember=?, award=? WHERE c_id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, competition.getGroupmember());
			pstmt.setString(2, competition.getAward());
			pstmt.setInt(3, competition.getCid());
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(null, pstmt, conn);
		}

		return count;
	}

	@Override
	public List<Competition> selectCompetition(String date) {
		List<Competition> clist = new ArrayList<Competition>();
		Connection conn = DbUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM t_competition WHERE year=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, date);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int cid = rs.getInt("c_id");
				String cateGories = rs.getString("categories");
				String year = rs.getString("year");
				String topic = rs.getString("topic");
				String groupLeader = rs.getString("groupleader");
				String groupMember = rs.getString("groupmember");
				String award = rs.getString("award");
				String adviser = rs.getString("adviser");
				String remark = rs.getString("remark");

				Competition competition = new Competition(cid, cateGories, year, topic, groupLeader, groupMember, award,
						adviser, remark);
				clist.add(competition);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.closeResource(rs, pstmt, conn);
		}
		return clist;
	}

}
