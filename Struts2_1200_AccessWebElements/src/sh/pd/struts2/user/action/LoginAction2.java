package sh.pd.struts2.user.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @Title:LoginAction2
 * @Description:依赖注入控制反转 重点掌握
 * @author:Administrator
 * @date:2018年4月11日 下午11:14:40
 */
// interceptor英 [ˌɪntəˈseptə(r)]、拦截器、aware得知、知道
public class LoginAction2 extends ActionSupport implements RequestAware,
		SessionAware, ApplicationAware {

	private Map<String, Object> request;
	private Map<String, Object> session;
	private Map<String, Object> application;

	// DI dependency injection
	// IoC inverse of control
	public String execute() {
		request.put("r1", "r1");
		session.put("s1", "s1");
		application.put("a1", "a1");
		return SUCCESS;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

}
