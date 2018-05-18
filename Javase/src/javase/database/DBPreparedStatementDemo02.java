package javase.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 
 * @Title:DBPreparedStatementDemo02
 * @Description:ģ����ѯ---�������������롢�Ա�Ϊģ����ѯ
 * @author:Administrator
 * @date:2017��9��19�� ����2:17:00
 */
public class DBPreparedStatementDemo02 {
	public static final String USER = "root";
	public static final String PASSWORD = "sunzhihui1997";
	public static final String URL = "jdbc:mysql://localhost:3306/baiyang";
	public static final String DRIVER = "com.mysql.jdbc.Driver";

	public static void main(String args[]) throws Exception {
		Connection conn = null;
		PreparedStatement prst = null;
		ResultSet rs = null;
		String keyWord = "z";
		String sql = "select id,name,password,age,sex,birthday"
				+ "from user where name like ? or password like ? or sex like ?";
		Class.forName(DRIVER);
		conn = DriverManager.getConnection(URL, USER, PASSWORD);
		prst = conn.prepareStatement(sql);
		prst.setString(1, "%" + keyWord + "%");
		prst.setString(2, "%" + keyWord + "%");
		prst.setString(3, "%" + keyWord + "%");

		rs = prst.executeQuery();
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String password = rs.getString(3);
			int age = rs.getInt(4);
			String sex = rs.getString(5);
			java.util.Date birthday = rs.getDate(6);
			System.out.print("��ţ�" + id);
			System.out.print("������" + name);
			System.out.print("���룺" + password);
			System.out.print("���䣺" + age);
			System.out.print("�Ա�" + sex);
			System.out.println("���գ�" + birthday);
			System.out.println("--------���Ƿָ���--------");
		}
		rs.close();
		prst.close();
		conn.close();
	}

}
