package sh.pd.struts2.user.action;

/**
 * 
 * @Title:User
 * @Description:domain 
 *                     model,在ognl表达式中，只有往里面传值，才会new出对象（手动new也可以），并且需要保持无参数构造方法（http
 *                     ://localhost:8080/Struts2_1900_OGNL/ognl.action?username=
 *                     u&password=p&user.age=10）
 * @author:Administrator
 * @date:2017年12月4日 下午2:05:45
 */
public class User {
	// 一种是在action new 一种是在url动态指定如user.age,此时也可以new出user对象
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
