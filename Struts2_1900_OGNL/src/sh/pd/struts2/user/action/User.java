package sh.pd.struts2.user.action;

/**
 * 
 * @Title:User
 * @Description:domain 
 *                     model,��ognl���ʽ�У�ֻ�������洫ֵ���Ż�new�������ֶ�newҲ���ԣ���������Ҫ�����޲������췽����http
 *                     ://localhost:8080/Struts2_1900_OGNL/ognl.action?username=
 *                     u&password=p&user.age=10��
 * @author:Administrator
 * @date:2017��12��4�� ����2:05:45
 */
public class User {
	// һ������action new һ������url��ָ̬����user.age,��ʱҲ����new��user����
	private int age = 8;

	public User() {

	}

	public User(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "user" + age;
	}
}
