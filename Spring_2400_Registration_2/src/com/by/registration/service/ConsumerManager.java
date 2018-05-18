package com.by.registration.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.by.registration.model.Consumer;

public class ConsumerManager {
	public boolean exists(Consumer consumer) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/spring", "root", "sunzhihui1997");
		String sqlQuery = "select count(*) from Consumer where username=?";
		PreparedStatement psQuery = connection.prepareStatement(sqlQuery);
		psQuery.setString(1, consumer.getUsername());
		ResultSet rs = psQuery.executeQuery();
		rs.next();
		int count = rs.getInt(1);
		psQuery.close();
		connection.close();
		if (count > 0) {
			return true;
		}
		return false;

	}

	public void add(Consumer c) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/spring", "root", "sunzhihui1997");
		String sqlQuery = "insert into Consumer values(null,?,?)";
		PreparedStatement psQuery = connection.prepareStatement(sqlQuery);
		psQuery.setString(1, c.getUsername());
		psQuery.setString(2, c.getPassword());
		psQuery.executeUpdate();
		psQuery.close();
		connection.close();
	}
}
