package javase.database;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class DBTest {
	private static String name = "root";
	private static String password = "sunzhihui1997";
	private static String url = "jdbc:mysql://localhost:3306/baiyang";

	public static void main(String[] args) throws Exception {
		// 1���������������似����
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 2���õ�����
		Connection con = null;
		try {
			con = (Connection) DriverManager.getConnection(url, name, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 3������ִ��
		Statement stmt = null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 4��ִ�����

		ResultSet rs = null;
		try {
			rs = stmt.executeQuery("select name,age from user;");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		while (rs.next()) {
			System.out.println("name:" + rs.getString("name") + "age"
					+ rs.getInt("age"));
		}
		stmt.close();
		con.close();
	}
}
