package com.by.shop.action;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
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
		System.out.println("catogoryService's name"
				+ productService.getClass().getName());
		// ���ݹؼ��ֺͷ�ҳ�Ĳ�����ѯ��Ӧ�����ݡ��������������Service��д���ˣ���ʱ��ɼ�����ѯ
		List<Category> categoryList = categoryService.queryJoinAccount(
				model.getType(), page, rows);
		pageMap.put("rows", categoryList); // �洢ΪJSON��ʽ������һ�ڵ�json�ļ����Կ�����һ��key��total,һ��key��rows�������Ȱ�rows��ź�
		// ���ݹؼ��ֲ�ѯ�ܼ�¼��
		Long total = categoryService.getCount(model.getType()); // �������ûд�����ǵȻ��ȥService������һ��
		// System.out.println(total);
		pageMap.put("total", total); // �洢ΪJSON��ʽ���ٰ�total��ź�

		return "jsonMap";
	}

	public String deleteByIds() {
		System.out.println(ids);
		categoryService.deleteByIds(ids);
		// ���ɾ���ɹ��ͻ�����ִ�У����ǽ�"true"��������ʽ����ǰ̨
		inputStream = new ByteArrayInputStream("true".getBytes()); // ��"true"���ֽڴ浽��inputStream��
		return "stream";
	}

	// ���
	public void save() {
		System.out.println(model);
		categoryService.save(model);
	}

	// ����
	public void update() {
		System.out.println(model);
		categoryService.update(model);
	}
}