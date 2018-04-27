package com.by.shop.action;

import java.util.HashMap;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.by.shop.model.Product;

@Controller("productAction")
@Scope("prototype")
public class ProductAction extends BaseAction<Product> {

	public String queryJoinCategory() {
		System.out.println("name:" + model.getName());
		System.out.println("page：" + page);
		System.out.println("rows：" + rows);

		// 用来存储分页的数据
		pageMap = new HashMap<String, Object>();
		//
		System.out.println("productService's name"
				+ productService.getClass().getName());
		// 根据关键字和分页的参数查询相应的数据
		List<Product> productList = productService.queryJoinCategory(
				model.getName(), page, rows);
		System.out.println("-----没有执行到这一步-----");
		System.out.println("测试：" + productList.get(2));
		pageMap.put("rows", productList); // 存储为JSON格式
		// 根据关键字查询总记录数
		Long total = productService.getCount(model.getName());
		// System.out.println(total);
		pageMap.put("total", total); // 存储为JSON格式
		return "jsonMap";
	}

}