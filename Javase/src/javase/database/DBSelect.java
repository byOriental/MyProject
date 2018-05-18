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
			// java.util.Date birthday = rs.getDate(6);// ����ѡ�ü�������
			Date birthday = rs.getDate(6);// ����ѡ�����ݿ����ڣ����߽Կɣ�
			System.out.print("��ţ�" + id);
			System.out.print("������" + name);
			System.out.print("���룺" + password);
			System.out.print("���䣺" + age);
			System.out.print("�Ա�" + sex);
			System.out.println("���գ�" + birthday);
			System.out.println("----------------");
		}

	}
}
