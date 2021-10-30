/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.competition.test;

import java.util.Scanner;

import com.ychs.uolab.competition.service.CompetitionService;
import com.ychs.uolab.competition.service.CompetitionServiceImpl;
import com.ychs.uolab.competition.vo.Competition;

/**
 * 单元测试
 * 
 * @author 王欣
 * @version 1.0
 */
public class ModifyCompetition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入比赛编号：");
		int cid = sc.nextInt();
		System.out.println("组员：");
		String groupMember = sc.next();
		System.out.println("获奖等级：");
		String award = sc.next();

		Competition c = new Competition();
		c.setCid(cid);
		c.setGroupmember(groupMember);
		c.setAward(award);
		CompetitionService cService = new CompetitionServiceImpl();
		int count = cService.modifyCompetition(c);
		if (count != 0) {
			System.out.println("修改成功！");
		} else {
			System.out.println("修改失败！");
		}
	}
}
