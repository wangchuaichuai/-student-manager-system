/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.department.test;

import java.util.Scanner;

import com.ychs.uolab.department.service.DeptService;
import com.ychs.uolab.department.service.DeptServiceImpl;
import com.ychs.uolab.department.vo.Major;

/**
 * @author 王欣
 * @version 1.0
 */
public class AddMajorTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入院系编号：");
		int did = sc.nextInt();
		
		System.out.println("请输入专业名称：");
		String majorName = sc.next();
		
		System.out.println("请输入备注：");
		String remark = sc.next();
		
		int majorid = (int)(Math.random() * 10000);
		Major major = new Major(majorid, majorName, did, remark);
		
		DeptService deptService = new DeptServiceImpl();
		int flag = deptService.addMajor(major);
		System.out.println(flag);
	}
}
