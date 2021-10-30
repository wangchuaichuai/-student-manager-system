/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.openclass.test;

import java.util.Scanner;

import com.ychs.uolab.openclass.service.OpenclassService;
import com.ychs.uolab.openclass.service.OpenclassServiceImpl;
import com.ychs.uolab.openclass.vo.Openclass;

/**
 * 单元测试
 * 
 * @author 王欣
 * @version 1.0
 */
class AddOpenclassTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入公开课开课日期：");
		String courseDate = scanner.next();

		System.out.println("请输入公开课编号：");
		int cid = scanner.nextInt();

		System.out.println("请输入技术专题：");
		String special = scanner.next();

		System.out.println("请输入公开课主讲人：");
		String speaker = scanner.next();

		System.out.println("请输入公开课组织人：");
		String organizer = scanner.next();

		System.out.println("请输入公开课地点：");
		String site = scanner.next();

		System.out.println("请输入群体说明：");
		String groupshow = scanner.next();

		System.out.println("请输入公开课上课方式：");
		String way = scanner.next();

		System.out.println("请输入公开课创新学分：");
		int credit = scanner.nextInt();

		System.out.println("请输入参加人数：");
		int num = scanner.nextInt();

		System.out.println("请输入备注：");
		String remark = scanner.next();

		Openclass openclass = new Openclass(cid, courseDate, special, speaker, organizer, site, groupshow, way, credit,
				num, remark);
		OpenclassService os = new OpenclassServiceImpl();
		int count = os.addOpenclass(openclass);
		if (count != 0) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}

	}

}
