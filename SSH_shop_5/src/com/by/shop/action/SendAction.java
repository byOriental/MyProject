package com.by.shop.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @Description: TODO(此Action用来完成WEB-INF中JSP与JSP请求转发功能，此Action不处理任何的逻辑)
 * @author eson_15
 * 
 */
public class SendAction extends ActionSupport {

	public String execute() {
		return "send";
	}
}