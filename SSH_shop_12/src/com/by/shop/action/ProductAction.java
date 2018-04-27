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
		System.out.println("page��" + page);
		System.out.println("rows��" + rows);

		// �����洢��ҳ������
		pageMap = new HashMap<String, Object>();
		//
		System.out.println("productService's name"
				+ productService.getClass().getName());
		// ���ݹؼ��ֺͷ�ҳ�Ĳ�����ѯ��Ӧ������
		List<Product> productList = productService.queryJoinCategory(
				model.getName(), page, rows);
		System.out.println("-----û��ִ�е���һ��-----");
		System.out.println("���ԣ�" + productList.get(2));
		pageMap.put("rows", productList); // �洢ΪJSON��ʽ
		// ���ݹؼ��ֲ�ѯ�ܼ�¼��
		Long total = productService.getCount(model.getName());
		// System.out.println(total);
		pageMap.put("total", total); // �洢ΪJSON��ʽ
		return "jsonMap";
	}

}