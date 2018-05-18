package sh.pd.struts2.user.action;

/**
 * 
 * @Title:Cat
 * @Description: 
 *               http://localhost:8080/Struts2_1900_OGNL/ognl.action?username=u&password
 *               =p&cat.friend.name=lili
 * @author:Administrator
 * @date:2017年12月4日 下午3:16:49
 */
public class Cat {

	private Dog friend;

	public Cat() {// 手动添加
		System.out.println("cat的构造方法！");
	}

	public Dog getFriend() {
		return friend;

	}

	public void setFriend(Dog friend) {
		this.friend = friend;
	}

	public String miaomiao() {
		return "miaomiao";
	}
}