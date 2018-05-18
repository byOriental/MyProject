package sh.pd.struts2.user.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction1 extends ActionSupport {

	private Map request;
	private Map session;
	private Map application;

	// ActionContext指的是程序执行时的周围环境,类似ServletContext,通过它可以取得得知程序运行时与之相关的信息
	public LoginAction1() {
		request = (Map) ActionContext.getContext().get("request");
		session = ActionContext.getContext().getSession();
		application = ActionContext.getContext().getApplication();
	}

	public String execute() {
		request.put("r1", "r1");
		session.put("s1", "s1");
		application.put("a1", "a1");
		return SUCCESS;
	}

}