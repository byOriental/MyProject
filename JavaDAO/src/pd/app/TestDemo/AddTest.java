package pd.app.TestDemo;

import pd.factory.DaoFactory.DaoFactory;
import pd.vo.BaseInfo.Emp;

public class AddTest {
	public static void main(String args[]) throws Exception {
		Emp emp = null;
		for (int i = 0; i < 5; i++) {
			emp = new Emp();
			emp.setEmpno(10 + i);
			emp.setEname("pd" + i);
			emp.setJob("programmer" + i);
			emp.setHiredate(new java.util.Date());
			emp.setSal(1000 * i);
			DaoFactory.getEmpDaoInstance().doCreate(emp);// ³ÌÐòÈë¿Ú
		}
	}
}
