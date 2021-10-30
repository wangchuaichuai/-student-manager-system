/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.competition.service;

import java.util.List;

import com.ychs.uolab.competition.dao.CompetitionDao;
import com.ychs.uolab.competition.dao.CompetitionDaoImpl;
import com.ychs.uolab.competition.vo.Competition;

/**
 * 比赛业务接口实现类
 *
 * @author 王欣
 * @version 1.0
 */
public class CompetitionServiceImpl implements CompetitionService {
	private CompetitionDao competitionDao = new CompetitionDaoImpl();

	@Override
	public int addCompetition(Competition competition) {
		int count = competitionDao.insertCompetition(competition);
		return count;
	}

	@Override
	public int modifyCompetition(Competition competition) {
		int count = competitionDao.updateCompetition(competition);
		return count;
	}

	@Override
	public List<Competition> findCompetition(String date) {
		return competitionDao.selectCompetition(date);
	}

}
