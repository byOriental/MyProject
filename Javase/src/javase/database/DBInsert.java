package javase.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBInsert {
	// 定义常量
	private static String user = "root";
	private static String password = "sunzhihui1997";
	private static String dBDriver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/baiyang";

	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Statement stm = null;
		String sql = "insert into user(name,password,age,sex,birthday)values('zls','123456',26,'n','1991-09-09')";
		Class.forName(dBDriver);
		conn = DriverManager.getConnection(url, user, password);
		stm = conn.createStatement();
		stm.executeUpdate(sql);
		stm.close();
		conn.close();

	}
}
