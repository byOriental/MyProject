package javase.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBUpdate {
	// 定义常量
	private static String user = "root";
	private static String password = "sunzhihui1997";
	private static String dBDriver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/baiyang";

	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Statement stm = null;
		String sql = "update user set name='ws',password='123456',age=25,sex='n',birthday='1994-09-08' where id=2";
		Class.forName(dBDriver);
		conn = DriverManager.getConnection(url, user, password);
		stm = conn.createStatement();
		stm.executeUpdate(sql);
		stm.close();
		conn.close();
	}

}
