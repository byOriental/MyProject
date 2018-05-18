package pd.dao.userDao;

import pd.dao.vo.Consumer;

public interface UserDao {
	public boolean userLogin(Consumer consumer) throws Exception;

}
