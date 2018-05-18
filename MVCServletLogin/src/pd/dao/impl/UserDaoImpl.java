package pd.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import pd.dao.userDao.UserDao;
import pd.dao.vo.Consumer;

public class UserDaoImpl implements UserDao {
	private Connection conn = null;
	private PreparedStatement pstmt = null;

	public UserDaoImpl(Connection conn) {
		this.conn = conn;
	}

	public boolean userLogin(Consumer consumer) throws Exception {
		boolean flag = false;
		String sql = "select userid,name,password from consumer where userid=? and password=?";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setString(1, consumer.getUserid());
		this.pstmt.setString(2, consumer.getPassword());
		ResultSet rs = this.pstmt.executeQuery();
		while (rs.next()) {
			consumer.setName(rs.getString(1));
			flag = true;
		}
		if (this.pstmt != null) {
			this.pstmt.close();
		}
		return flag;

	}
}
