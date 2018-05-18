package sh.pd.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

//建议使用此方法写Action，好处在于可以直接使用Struts2封装好的方法
public class IndexAction3 extends ActionSupport {

	@Override
	public String execute() {
		return "success";
	}
}
