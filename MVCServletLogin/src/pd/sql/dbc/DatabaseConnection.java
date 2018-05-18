package pd.sql.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	// 前提一定要将数据库连接jar文件添加上去
	public static final String USER = "root";
	public static final String PASSWORD = "sunzhihui1997";
	public static final String URL = "jdbc:mysql://localhost:3306/baiyang";
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	private Connection conn = null;

	// 在构造函数中进行数据库连接
	public DatabaseConnection() throws Exception {
		try {
			Class.forName(DRIVER);
			this.conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return conn;
	}

	public void close() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
