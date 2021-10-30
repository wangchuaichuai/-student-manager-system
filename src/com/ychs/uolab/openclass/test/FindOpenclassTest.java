/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.openclass.test;

import java.util.List;
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
public class FindOpenclassTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("公开课日期(yyyy-MM-dd的形式)：");
		String courseDate = sc.next();
		System.out.println("院系：");
		String dname = sc.next();
		System.out.println("年级：");
		String grade = sc.next();
		System.out.println("专业：");
		String major = sc.next();

		OpenclassService ocService = new OpenclassServiceImpl();
		List<Openclass> list = ocService.findOpenclass(courseDate, dname, grade, major);
		if (list.size() != 0) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		} else {
			System.out.println("查询失败");
		}
	}

}
