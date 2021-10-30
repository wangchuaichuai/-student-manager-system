/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.competition.service;

import java.util.List;

import com.ychs.uolab.competition.vo.Competition;

/**
 * 比赛业务接口
 *
 * @author 王欣
 * @version 1.0
 */
public interface CompetitionService {
	/**
	 * 添加比赛
	 * 
	 * @param competition 比赛对象
	 * @return 添加成功返回1，否则返回0
	 */
	public int addCompetition(Competition competition);

	/**
	 * 修改信息
	 * 
	 * @param competition 比赛对象
	 * @return 修改成功返回1，否则返回0
	 */
	public int modifyCompetition(Competition competition);

	/**
	 * 查询信息
	 * 
	 * @param date 比赛日期
	 * @return 返回及结果集
	 */
	public List<Competition> findCompetition(String date);
}
