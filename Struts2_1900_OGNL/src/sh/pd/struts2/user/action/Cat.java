package sh.pd.struts2.user.action;

/**
 * 
 * @Title:Cat
 * @Description: 
 *               http://localhost:8080/Struts2_1900_OGNL/ognl.action?username=u&password
 *               =p&cat.friend.name=lili
 * @author:Administrator
 * @date:2017��12��4�� ����3:16:49
 */
public class Cat {

	private Dog friend;

	public Cat() {// �ֶ����
		System.out.println("cat�Ĺ��췽����");
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