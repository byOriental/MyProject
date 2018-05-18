package pd.dao.EmpDao;

import java.util.List;

import pd.vo.BaseInfo.Emp;

public interface EmpDao {
	// 添加操作
	public boolean doCreate(Emp emp) throws Exception;

	// 通过关键字查找操作，返回集合
	public List<Emp> findAll(String keyWord) throws Exception;

	// 通过员工编号查找，返回单个员工
	public Emp findId(int empno) throws Exception;
}
