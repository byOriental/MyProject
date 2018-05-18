package javase.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

public class DBPreparedStatementDemo01 {
	// 常量定义
	public static final String USER = "root";
	public static final String PASSWORD = "sunzhihui1997";
	public static final String URL = "jdbc:mysql://localhost:3306/baiyang";
	public static final String DRIVER = "com.mysql.jdbc.Driver";

	public static void main(String[] args) throws Exception {
		Connection conn = null;
		PreparedStatement prst = null;
		String name = "sh";
		String password = "123456";
		int age = 27;
		String sex = "n";
		String birthday = "1994-04-06";
		java.util.Date temp = null;
		// 日期转换
		temp = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
		java.sql.Date bir = new java.sql.Date(temp.getTime());// 转换成sql的日期格式
		String sql = "insert into user(name,password,age,sex,birthday)"
				+ "values(?,?,?,?,?)";
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		conn = DriverManager.getConnection(URL, USER, PASSWORD);
		prst = conn.prepareStatement(sql);
		prst.setString(1, name);
		prst.setString(2, password);
		prst.setInt(3, age);
		prst.setString(4, sex);
		prst.setDate(5, bir);
		prst.executeUpdate();
		prst.close();
		conn.close();
	}

}
