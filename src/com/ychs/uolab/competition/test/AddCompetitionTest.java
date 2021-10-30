/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.competition.test;

import java.util.Scanner;

import com.ychs.uolab.competition.service.CompetitionService;
import com.ychs.uolab.competition.service.CompetitionServiceImpl;
import com.ychs.uolab.competition.vo.Competition;

/**
 * 添加比赛单元测试
 * 
 * @author 王欣
 * @version 1.0
 */
public class AddCompetitionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入比赛编号：");
		int cid = sc.nextInt();
		System.out.println("比赛类别：");
		String cateGories = sc.next();
		System.out.println("比赛年度：");
		String year = sc.next();
		System.out.println("比赛题目：");
		String topic = sc.next();
		System.out.println("组长姓名：");
		String groupLeader = sc.next();
		System.out.println("组员：");
		String groupMember = sc.next();
		System.out.println("获奖等级：");
		String award = sc.next();
		System.out.println("指导老师：");
		String adviser = sc.next();
		System.out.println("备注：");
		String remark = sc.next();

		Competition c = new Competition(cid, cateGories, year, topic, groupLeader, groupMember, award, adviser, remark);
		CompetitionService cService = new CompetitionServiceImpl();
		int count = cService.addCompetition(c);
		if (count != 0) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
	}

}
