package javase.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBDelet {
	// ���峣��
	private static String user = "root";
	private static String password = "sunzhihui1997";
	private static String dBDriver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/baiyang";

	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Statement stm = null;
		int i = 4;
		String sql = "delete from user where id=" + i;// �ַ������ӡ�+��
		Class.forName(dBDriver);
		conn = DriverManager.getConnection(url, user, password);
		stm = conn.createStatement();
		stm.executeUpdate(sql);
		stm.close();
		conn.close();
	}

}
