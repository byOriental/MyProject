package pd.dao.proxy.EmpDaoProxy;

import java.util.List;

import pd.dao.EmpDao.EmpDao;
import pd.dao.impl.EmpDaoImpl.EmpDaoImpl;
import pd.dbc.DatabaseConnection.DatabaseConnection;
import pd.vo.BaseInfo.Emp;

public class EmpDaoProxy implements EmpDao {
	private DatabaseConnection dbc = null;
	private EmpDao dao = null;

	public EmpDaoProxy() throws Exception {
		// 于代理处实例化数据库连接
		this.dbc = new DatabaseConnection();
		// 于代理处实例化DAO,通过子类（EmpDaoImpl）来实现化父类接口（EmpDao）
		this.dao = new EmpDaoImpl(this.dbc.getConnection());
	}

	public boolean doCreate(Emp emp) throws Exception {
		boolean flag = false;
		try {
			if (this.dao.findId(emp.getEmpno()) == null) {// 如果插进去员工不在（为null），则进行插入操作
				flag = this.dao.doCreate(emp);
			}
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return flag;
	}

	public List<Emp> findAll(String keyWord) throws Exception {
		List<Emp> all = null;
		try {
			all = this.dao.findAll(keyWord);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return all;
	}

	public Emp findId(int empno) throws Exception {
		Emp emp = null;
		try {
			emp = this.dao.findId(empno);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return emp;
	}

}
