package com.by.shop.action;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.by.shop.model.Category;

/**
 * 
 * @Title:CategoryAction
 * @Description:间接操作数据库
 * @author:Administrator
 * @date:2018年4月18日 上午12:22:46
 */
@Controller("categoryAction")
@Scope("prototype")
public class CategoryAction extends BaseAction<Category> {

	public String queryJoinAccount() {

		// 用来存储分页的数据
		pageMap = new HashMap<String, Object>();

		// 根据关键字和分页的参数查询相应的数据。这个方法我们在Service中写过了，当时完成级联查询
		List<Category> categoryList = categoryService.queryJoinAccount(
				model.getType(), page, rows);
		Iterator<Category> it = categoryList.iterator();
		while (it.hasNext()) {// 输出集合对象
			Category category = it.next();
			System.out.println("category'value:" + category);

		}
		pageMap.put("rows", categoryList); // 存储为JSON格式，从上一节的json文件可以看出，一个key是total,一个key是rows，这里先把rows存放好
		// 根据关键字查询总记录数
		Long total = categoryService.getCount(model.getType()); // 这个方法没写，我们等会儿去Service层完善一下
		// System.out.println(total);
		pageMap.put("total", total); // 存储为JSON格式，再把total存放好

		return "jsonMap";
	}
}