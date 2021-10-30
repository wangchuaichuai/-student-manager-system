/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;


/**
 *数据库连接实用类，
 * @author 王欣
 * @version 1.0
 */
public class DbUtil {
	static DataSource ds;
	//static块在DbUtil类加载的时候就要执行；往JVM里加载
	//
	//在static块里，不能使用非static属性
	static {
		Properties pro = new Properties();
		//配置文件必须放在src目录下
		InputStream in = DbUtil.class.getClassLoader().getSystemResourceAsStream("druid.properties");
		//读取配置文件
		try {
			pro.load(in);
			//ds就是连接池，叫做：数据源
			ds = DruidDataSourceFactory.createDataSource(pro);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 获取数据库连接
	 * @return 数据库连接对象
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = ds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	/**
	 * 关闭数据库资源
	 * @param rs 结果
	 * @param pstmt 预编译对象
	 * @param conn 数据库连接
	 */
	public static void closeResource(ResultSet rs, java.sql.PreparedStatement pstmt,Connection conn) {
		try {
			if(rs != null) {
				rs.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Connection conn = DbUtilJdbc.getConnection();
		System.out.println(conn);
		//内存泄漏
		DbUtilJdbc.closeConnection(conn);
		//面试题:java语言中有没有可能产生内存泄漏
	}
}
