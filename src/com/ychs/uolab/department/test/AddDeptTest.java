/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.department.test;

import java.util.Scanner;

import com.ychs.uolab.department.service.DeptService;
import com.ychs.uolab.department.service.DeptServiceImpl;
import com.ychs.uolab.department.vo.Dept;


/**
 * 添加院系测试类
 * @author 王欣
 * @version 1.0
 */
public class AddDeptTest {
	public static void main(String[]  args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入院系编号：");
		int did = scanner.nextInt();
		
		System.out.println("请输入院系名字：");
		String dname = scanner.next();
		
		System.out.println("请输入备注：");
		String remark = scanner.next();
		
		DeptService deptService = new DeptServiceImpl();
		Dept dept = new Dept(did, dname,remark);
		int flag = deptService.addDept(dept);
		if (flag == 0) {
			System.out.println("添加失败");
		} else {
			System.out.println("添加成功");
		}
	}
}
