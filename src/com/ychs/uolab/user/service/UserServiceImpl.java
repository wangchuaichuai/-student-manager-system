/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.user.service;

import java.util.List;

import com.ychs.uolab.user.dao.UserDao;
import com.ychs.uolab.user.dao.UserDaoImpl;
import com.ychs.uolab.user.vo.User;

/**
 * 用户业务实现类
 * 
 * @author 王欣
 * @version 1.0
 */
public class UserServiceImpl implements UserService {

	// 创建UserDaoImpl对象，以便UserServiceImpl使用它
	// 多态机制 （在Spring中大量使用）
	private UserDao UserDao = new UserDaoImpl();

	@Override
	public boolean addUser(User user) {
		boolean flag = UserDao.insertUser(user);
		return flag;
	}

	@Override
	public boolean checkUser(String userName, String userPsw) {
		boolean flag = UserDao.login(userName, userPsw);
		return flag;
	}

	@Override
	public int deleteUser(String userid) {
		int count = UserDao.deleteUser(userid);
		return count;
	}

	@Override
	public List<User> findUser(String uname, String dname, String major, String classes, String grade) {
		List<User> ulist = UserDao.selectUser(uname, dname, major, classes, grade);
		return ulist;
	}

	@Override
	public int modifyUser(User user) {
		int count = UserDao.updateUser(user);
		return count;
	}

}
