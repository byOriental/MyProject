package pd.app.TestDemo;

import java.util.Iterator;
import java.util.List;

import pd.factory.DaoFactory.DaoFactory;
import pd.vo.BaseInfo.Emp;

public class selectDemo {

	public static void main(String[] args) throws Exception {
		List<Emp> all = DaoFactory.getEmpDaoInstance().findAll("");
		Iterator<Emp> iter = all.iterator();
		while (iter.hasNext()) {
			Emp emp = iter.next();
			System.out.println(emp.getEmpno() + "¡¢" + emp.getEname() + "-->"
					+ emp.getEname());
		}
	}

}
