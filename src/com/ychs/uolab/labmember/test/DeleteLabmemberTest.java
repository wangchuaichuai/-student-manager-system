/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.labmember.test;

import java.util.Scanner;

import com.ychs.uolab.labmember.service.LabmemberService;
import com.ychs.uolab.labmember.service.LabmemberServiceImpl;

/**
 * 单元测试
 * @author 王欣
 * @version 1.0
 */
public class DeleteLabmemberTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户编号：");
		int memberid = scanner.nextInt();
		LabmemberService us = new LabmemberServiceImpl();
		int count = us.deletemember(memberid);
		System.out.println(count);
	}

}
