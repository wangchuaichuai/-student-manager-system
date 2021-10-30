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
 * 
 * @author 王欣
 * @version 1.0
 */
public class UpdateLabmemberTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入电话号码：");
		String telephone = scanner.next();

		System.out.println("请输入校内职务：");
		String campuspost = scanner.next();

		System.out.println("请输入状态：");
		String status = scanner.next();

		System.out.println("请输入担任实验室的职务：");
		String labjob = scanner.next();

		System.out.println("请输入实验室成员编号：");
		int memberid = scanner.nextInt();

		System.out.println("请输入备注:");
		String remark = scanner.next();

		Labmember labmember = new Labmember();
		labmember.setTelephone(telephone);
		labmember.setCampuspost(campuspost);
		labmember.setStatus(status);
		labmember.setLabjob(labjob);
		labmember.setRemark(remark);
		labmember.setMemberid(memberid);

		LabmemberService labmemberService = new LabmemberServiceImpl();
		int count = labmemberService.modifyLabmember(labmember);
		if (count != 0) {
			System.out.println("修改成功");
		} else {
			System.out.println("修改失败");
		}

	}
}
