package sh.pd.struts2.user.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction1 extends ActionSupport {

	/**
	 * (1).Value Stack Contents �������Ϣ���ǿ����� <s:property value="sss"> ������ֱ�ӷ���.
	 * 
	 * (2) Stack Context �������Ϣ���ǿ��� <s:property value="#sss">����������
	 */
	private Map request;
	private Map session;
	private Map application;

	// ActionContextָ���ǳ���ִ��ʱ����Χ����,����ServletContext,ͨ��������ȡ�õ�֪��������ʱ��֮��ص���Ϣ
	public LoginAction1() {// ���캯����ʼ����Щ����
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