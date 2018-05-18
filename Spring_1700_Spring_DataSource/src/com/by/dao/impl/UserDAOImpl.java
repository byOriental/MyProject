package com.by.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import com.by.dao.UserDAO;
import com.by.model.User;

@Component("u")
public class UserDAOImpl implements UserDAO {
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	// 将beans.xml里面id="dataSource1"的bean注入，获取取数据库连接信息
	@Resource(name = "dataSource1")
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void save(User user) {
		try {
			Connection connection = dataSource.getConnection();
			connection.createStatement().executeUpdate(
					"insert into user values(null,'username')");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("user saved!");
	}
}