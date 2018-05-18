package pd.dao.proxy;

import pd.dao.impl.UserDaoImpl;
import pd.dao.userDao.UserDao;
import pd.dao.vo.Consumer;
import pd.sql.dbc.DatabaseConnection;

public class userDaoProxy implements UserDao {
	private DatabaseConnection dbc = null;
	private UserDao dao = null;

	public userDaoProxy() {
		try {
			this.dbc = new DatabaseConnection();// �˴��ǹ��췽�����Զ�ִ�У����쳣�����׳�ȥ
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.dao = new UserDaoImpl(this.dbc.getConnection());
	}

	public boolean userLogin(Consumer consumer) throws Exception {
		boolean flag = false;
		flag = this.dao.userLogin(consumer);
		this.dbc.close();
		return flag;

	}

}
