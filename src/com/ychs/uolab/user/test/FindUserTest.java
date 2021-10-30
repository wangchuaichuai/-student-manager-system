/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.user.test;

import java.util.List;
import java.util.Scanner;

import com.ychs.uolab.user.service.UserService;
import com.ychs.uolab.user.service.UserServiceImpl;
import com.ychs.uolab.user.vo.User;

/**
 *
 * @author 王欣
 * @version 1.0
 */
public class FindUserTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String uname = sc.next();

		System.out.println("请输入院系：");
		String dname = sc.next();

		System.out.println("请输入专业：");
		String major = sc.next();

		System.out.println("请输入班级：");
		String classes = sc.next();

		System.out.println("请输入年级：");
		String grade = sc.next();

		UserService us = new UserServiceImpl();
		List<User> ulist = us.findUser(uname, dname, major, classes, grade);
		// System.out.println(ulist.size());
		for (int i = 0; i < ulist.size(); i++) {
			User user = ulist.get(i);
			System.out.println(user);
		}
	}

}
