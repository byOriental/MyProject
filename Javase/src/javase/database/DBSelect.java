package javase.database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBSelect {
	private static String user = "root";
	private static String password = "sunzhihui1997";
	private static String url = "jdbc:mysql://localhost:3306/baiyang";
	private static String driver = "com.mysql.jdbc.Driver";

	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;
		String sql = "select id,name,password,age,sex,birthday from user";
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		conn = DriverManager.getConnection(url, user, password);
		stm = conn.createStatement();
		rs = stm.executeQuery(sql);
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String password = rs.getString(3);
			int age = rs.getInt(4);
			String sex = rs.getString(5);
			// java.util.Date birthday = rs.getDate(6);// 日期选用集合日期
			Date birthday = rs.getDate(6);// 日期选用数据库日期（两者皆可）
			System.out.print("编号：" + id);
			System.out.print("姓名：" + name);
			System.out.print("密码：" + password);
			System.out.print("年龄：" + age);
			System.out.print("性别：" + sex);
			System.out.println("生日：" + birthday);
			System.out.println("----------------");
		}

	}
}
