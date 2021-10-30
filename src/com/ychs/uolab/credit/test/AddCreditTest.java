/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.credit.test;

import java.util.Scanner;

import com.ychs.uolab.credit.service.CreditService;
import com.ychs.uolab.credit.service.CreditServiceImpl;
import com.ychs.uolab.credit.vo.Credit;

/**
 * 单元测试
 * @author 王欣
 * @version 1.0
 */
public class AddCreditTest {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("请输入学分编号：");
	int creditId = scanner.nextInt();
	
	System.out.println("实验室成员编号：");
	int memberId = scanner.nextInt();
	System.out.println("学生学号：");
	String stuId = scanner.next();
	System.out.println("姓名：");
	String sname = scanner.next();
	System.out.println("年级：");
	String grade = scanner.next();
	System.out.println("院系：");
	String dept = scanner.next();
	System.out.println("学分分值：");
	int creditPoints = scanner.nextInt();
	System.out.println("获得学分原因：");
	String subject = scanner.next();
	System.out.println("取得时间：");
	String gainDate = scanner.next();
	System.out.println("录入人：");
	String entryPerson = scanner.next();
	System.out.println("录入时间：");
	String entryDate = scanner.next();
	System.out.println("备注：");
	String remark = scanner.next();
	
	Credit credit = new Credit(creditId, memberId, stuId, sname, grade, dept, creditPoints, subject, gainDate, entryPerson, entryDate, remark);
	
	CreditService cService = new CreditServiceImpl();
	
	int count = cService.addCredit(credit);
	if (count != 0) {
		System.out.println("添加成功！");
	} else {
		System.out.println("添加失败！");
	}
}
}
