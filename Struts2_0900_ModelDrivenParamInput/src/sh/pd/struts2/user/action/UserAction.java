package sh.pd.struts2.user.action;

import sh.pd.struts2.user.model.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

//MVC;M--model¡¢V--jsp,method's return value¡¢C--Action
public class UserAction extends ActionSupport implements ModelDriven<User> {

	private User user = new User();

	public String add() {
		System.out.println("name=" + user.getName());
		System.out.println("age=" + user.getAge());
		return SUCCESS;
	}

	@Override
	public User getModel() {
		return user;
	}

}
