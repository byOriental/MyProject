package sh.pd.struts2.user.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction1 extends ActionSupport {

	/**
	 * (1).Value Stack Contents 里面的信息我们可以用 <s:property value="sss"> 这样来直接访问.
	 * 
	 * (2) Stack Context 里面的信息我们可以 <s:property value="#sss">这样来访问
	 */
	private Map request;
	private Map session;
	private Map application;

	// ActionContext指的是程序执行时的周围环境,类似ServletContext,通过它可以取得得知程序运行时与之相关的信息
	public LoginAction1() {// 构造函数初始化这些对象
		request = (Map) ActionContext.getContext().get("request");
		session = ActionContext.getContext().getSession();
		application = ActionContext.getContext().getApplication();
	}

	public String execute() {
		request.put("ws", "wushu");
		session.put("lcc", "lichenchen");
		application.put("szh", "sunzhihui");
		return SUCCESS;
	}

}