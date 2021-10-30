/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * （此处写的是下面这个类的功能）实现数据库的连接与关闭
 * 
 * @author 王欣
 * @version 1.0
 */
public class DbUtilJdbc {
	/***
	 * 获得数据库连接
	 * 
	 * @return 得到数据库的连接对象
	 */
	public static Connection getConnection() {
		// 声明连接变量
		Connection conn = null;
		// 注册数据库驱动，这里是MySQL5的驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 获取链接,第一参数是连接字符串;第二参数是数据库用户名;第三参数是数据库密码
			// uolabdb是数据库的名字
			// 3306是数据库端口
			// localhost本机,就是自己的计算机
			// jdbc 协议 mysql子协议
			String url = "jdbc:mysql://localhost:3306/uolabdb?useUnicode=true&charaterEncoding=utf8";
			// DriverManager 驱动程序管理类
			conn = DriverManager.getConnection(url, "root", "123456");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}

	/**
	 * 关闭指定数据库连接
	 * 
	 * @param conn 数据库连接对象
	 */
	public static void closeConnection(Connection conn) {
		// 防止空指针异常
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 单元测试,对两个方法做测试
	 * 
	 * @param args 外界传入的参数
	 */
	public static void main(String[] args) {
		Connection conn = DbUtilJdbc.getConnection();
		System.out.println(conn);
		// 内存泄漏
		DbUtilJdbc.closeConnection(conn);
		// 面试题:java语言中有没有可能产生内存泄漏
	}

}
