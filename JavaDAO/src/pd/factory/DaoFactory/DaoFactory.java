package pd.factory.DaoFactory;

import pd.dao.EmpDao.EmpDao;
import pd.dao.proxy.EmpDaoProxy.EmpDaoProxy;

public class DaoFactory {
	// �����෵�ش�����ʵ������ʵ������EmpDao���ͣ��������ĸ���
	public static EmpDao getEmpDaoInstance() throws Exception {
		return new EmpDaoProxy();
	}
}
