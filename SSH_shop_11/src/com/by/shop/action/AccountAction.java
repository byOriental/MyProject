package com.by.shop.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.by.shop.model.Account;

@Controller("accountAction")
@Scope("prototype")
public class AccountAction extends BaseAction<Account> {

	public String query() {
		jsonList = accountService.query();
		return "jsonList";
	}

}
