package pd.dao.EmpDao;

import java.util.List;

import pd.vo.BaseInfo.Emp;

public interface EmpDao {
	// ��Ӳ���
	public boolean doCreate(Emp emp) throws Exception;

	// ͨ���ؼ��ֲ��Ҳ��������ؼ���
	public List<Emp> findAll(String keyWord) throws Exception;

	// ͨ��Ա����Ų��ң����ص���Ա��
	public Emp findId(int empno) throws Exception;
}
