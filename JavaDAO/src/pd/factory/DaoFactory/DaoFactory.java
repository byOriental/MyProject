package pd.factory.DaoFactory;

import pd.dao.EmpDao.EmpDao;
import pd.dao.proxy.EmpDaoProxy.EmpDaoProxy;

public class DaoFactory {
	// 工厂类返回代理类实例，该实例属于EmpDao类型，即是他的父类
	public static EmpDao getEmpDaoInstance() throws Exception {
		return new EmpDaoProxy();
	}
}
