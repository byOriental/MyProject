package pd.factory.daoFactory;

import pd.dao.proxy.userDaoProxy;
import pd.dao.userDao.UserDao;

public class DaoFactory {
	public static UserDao getDaoInstance() {// userDaoProxy бнбн
		return new userDaoProxy();
	}
}
