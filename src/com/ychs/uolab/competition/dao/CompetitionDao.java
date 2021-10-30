/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.competition.dao;

import java.util.List;

import com.ychs.uolab.competition.vo.Competition;

/**
 * 比赛接口
 *
 * @author 王欣
 * @version 1.0
 */
public interface CompetitionDao {
	/**
	 * 比赛
	 * 
	 * @param competition 比赛对象
	 * @return 成功返回1，否则返回0
	 */
	public int insertCompetition(Competition competition);

	/**
	 * 修改比赛信息
	 * 
	 * @param competition 比赛编号
	 * @return 成功返回1，否则返回0
	 */
	public int updateCompetition(Competition competition);

	/**
	 * 查询参赛信息
	 * 
	 * @param date 参赛日期
	 * @return 返回结果集
	 */
	public List<Competition> selectCompetition(String date);
}
