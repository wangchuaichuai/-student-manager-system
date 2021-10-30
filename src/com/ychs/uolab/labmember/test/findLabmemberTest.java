/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.labmember.test;

import java.util.List;
import java.util.Scanner;

import com.ychs.uolab.labmember.service.LabmemberService;
import com.ychs.uolab.labmember.service.LabmemberServiceImpl;

import com.ychs.uolab.labmember.vo.Multitable;

/**
 * 单元测试
 * 
 * @author 王欣
 * @version 1.0
 */
public class findLabmemberTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入成员姓名：");
		String stuname = scanner.next();

		System.out.print("请输入班级：");
		String grade = null;

		System.out.print("请输入电话号：");
		String telephone = null;

		System.out.print("请输入学院名：");
		String dname = null;

		System.out.print("请输入专业名：");
		String majorname = null;

		System.out.print("请输入状态：");
		String status = null;

		System.out.print("请输入校园职务：");
		String campuspost = null;

		System.out.print("请输入实验室职务：");
		String labjob = null;

		LabmemberService ls = new LabmemberServiceImpl();
		List<Multitable> mList = ls.findLabmember(stuname, grade, telephone, dname, majorname, status, campuspost,
				labjob);
		for (int i = 0; i < mList.size(); i++) {
			Multitable labmember = mList.get(i);
			System.out.println(labmember);
		}
	}

}
