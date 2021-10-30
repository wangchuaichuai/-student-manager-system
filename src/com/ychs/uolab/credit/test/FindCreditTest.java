/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.credit.test;

import java.util.List;
import java.util.Scanner;

import com.ychs.uolab.credit.service.CreditService;
import com.ychs.uolab.credit.service.CreditServiceImpl;
import com.ychs.uolab.credit.vo.Credit;

/**
 * 单元测试
 * @author 王欣
 * @version 1.0
 */
public class FindCreditTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学号");
		String stuId = scanner.next();
		System.out.println("请输入姓名");
		String sName = scanner.next();
		System.out.println("请输入时间段(年月)");
		String entryDate = scanner.next();
		
		CreditService creditService = new CreditServiceImpl();
		
		List<Credit> creditsList = creditService.findCredit(stuId, sName, entryDate);
		
		int creditNum = 0;
		
		for(int i = 0; i < creditsList.size(); i ++ )
		{
			Credit credit = creditsList.get(i);
			System.out.println(credit);
			creditNum += credit.getCreditPoints();
		}
		
		System.out.println("总分为" + creditNum);
		
	}
}
