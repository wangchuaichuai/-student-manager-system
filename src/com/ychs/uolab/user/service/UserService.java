/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.user.service;

import java.util.List;

import com.ychs.uolab.user.vo.User;

/**
 * 用户业务接口：用户登录
 * 
 * @author 王欣
 * @version 1.0
 */
public interface UserService {
	/**
	 * 修改该用户信息
	 * 
	 * @param user 用户对象
	 * @return 修改成功返回1，否则返回0
	 */
	public int modifyUser(User user);

	/**
	 * 添加用户
	 * 
	 * @param user 用户对象
	 * @return 添加成功返回true，否则返回false
	 */
	public boolean addUser(User user);

	/**
	 * 按用户名和密码检查用户，登录
	 * 
	 * @param userName 用户名
	 * @param usetPsw  密码
	 * @return 登陆成功返回true，否则返回false
	 */
	public boolean checkUser(String userName, String usetPsw);

	/**
	 * 按编号删除用户
	 * 
	 * @param userid 用户编号
	 * @return 删除成功返回1，否则返回0
	 */
	public int deleteUser(String userid);

	/**
	 * 查询用户：组合条件
	 * 
	 * @param uname   姓名
	 * @param dname   院系
	 * @param major   专业
	 * @param classes 班级
	 * @param grade   年级
	 * @return 满足条件的对象组成的集合list
	 */
	public List<User> findUser(String uname, String dname, String major, String classes, String grade);
}
