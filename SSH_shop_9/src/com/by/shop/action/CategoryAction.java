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
 * @Description:��Ӳ������ݿ�
 * @author:Administrator
 * @date:2018��4��18�� ����12:22:46
 */
@Controller("categoryAction")
@Scope("prototype")
public class CategoryAction extends BaseAction<Category> {

	public String queryJoinAccount() {

		// �����洢��ҳ������
		pageMap = new HashMap<String, Object>();

		// ���ݹؼ��ֺͷ�ҳ�Ĳ�����ѯ��Ӧ�����ݡ��������������Service��д���ˣ���ʱ��ɼ�����ѯ
		List<Category> categoryList = categoryService.queryJoinAccount(
				model.getType(), page, rows);
		Iterator<Category> it = categoryList.iterator();
		while (it.hasNext()) {// ������϶���
			Category category = it.next();
			System.out.println("category'value:" + category);

		}
		pageMap.put("rows", categoryList); // �洢ΪJSON��ʽ������һ�ڵ�json�ļ����Կ�����һ��key��total,һ��key��rows�������Ȱ�rows��ź�
		// ���ݹؼ��ֲ�ѯ�ܼ�¼��
		Long total = categoryService.getCount(model.getType()); // �������ûд�����ǵȻ��ȥService������һ��
		// System.out.println(total);
		pageMap.put("total", total); // �洢ΪJSON��ʽ���ٰ�total��ź�

		return "jsonMap";
	}
}