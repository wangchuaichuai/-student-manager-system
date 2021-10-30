/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.labmember.test;

import java.util.Scanner;

import com.ychs.uolab.labmember.service.LabmemberService;
import com.ychs.uolab.labmember.service.LabmemberServiceImpl;
import com.ychs.uolab.labmember.vo.Labmember;

/**
 * 单元测试
 * @author 王欣
 * @version 1.0
 */
public class AddLabmemberTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入成员编号：");
		int memberid = sc.nextInt();
		
		System.out.println("请输入班级编号: ");
		int cno = sc.nextInt();
		
		System.out.println("请输入学生姓名：");
		String stuname = sc.next();
		
		System.out.println("请输入学生学号");
		String stuid = sc.next();
		
		System.out.println("请输入学生性别：");
		String sex = sc.next();
		
		System.out.println("请输入年级：");
		String  grade = sc.next();
		
		System.out.println("请输入籍贯：");
		String  nativeplace = sc.next();
		
		System.out.println("请输入手机号：");
		String  telephone = sc.next();
	
		System.out.println("请输入邮箱：");
		String  email = sc.next();
		
		System.out.println("请输入校内职务：");
		String  campuspost = sc.next();
		
		System.out.println("请输入加入日期：");
		String  joiningdate = sc.next();
		
		System.out.println("请输入状态：");
		String  status = sc.next();
		
		System.out.println("请输入实验室职务：");
		String  labjob = sc.next();
		
		System.out.println("请输入备注：");
		String  remark = sc.next();
		
		LabmemberService labmember = new LabmemberServiceImpl();
		Labmember member = new Labmember(memberid, cno, stuname, stuid, sex, grade, nativeplace, telephone,
				email, campuspost, joiningdate, status, labjob, remark);
		boolean flag = labmember.addLabmember(member);
		if (flag) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
	}

}
