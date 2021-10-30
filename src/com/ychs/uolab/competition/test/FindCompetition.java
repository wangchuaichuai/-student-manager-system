/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.competition.test;

import java.util.List;
import java.util.Scanner;

import com.ychs.uolab.competition.service.CompetitionServiceImpl;
import com.ychs.uolab.competition.vo.Competition;
import com.ychs.uolab.competition.service.CompetitionService;

/**
 * 查询比赛信息测试
 * 
 * @author 王欣
 * @version 1.0
 */
public class FindCompetition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入比赛年度：");
		String year = sc.next();

		CompetitionService cService = new CompetitionServiceImpl();

		List<Competition> clist = cService.findCompetition(year);

		if (clist.size() != 0) {
			System.out.println("查询成功，信息如下：");
			for (int i = 0; i < clist.size(); i++) {
				System.out.println(clist.get(i));
			}
		} else {
			System.out.println("查询失败");
		}
	}

}
