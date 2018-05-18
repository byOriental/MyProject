package com.by.spring;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class ClassPathXmlApplicationContext implements BeanFactory {

	private Map<String, Object> beans = new HashMap<String, Object>();

	// IOC Inverse of Control DI Dependency Injection
	public ClassPathXmlApplicationContext() throws Exception {
		SAXBuilder sb = new SAXBuilder();

		Document doc = sb.build(this.getClass().getClassLoader()
				.getResourceAsStream("beans.xml")); // �����ĵ�����
		Element root = doc.getRootElement(); // ��ȡ��Ԫ��HD
		List list = root.getChildren("bean");// ȡ����Ϊdisk������Ԫ��
		for (int i = 0; i < list.size(); i++) {
			Element element = (Element) list.get(i);
			String id = element.getAttributeValue("id");
			String clazz = element.getAttributeValue("class");
			Object o = Class.forName(clazz).newInstance();// ͨ������õ���
			System.out.println(id);// u userService
			System.out.println(clazz);// com.by.dao.impl.UserDAOImpl
										// com.by.service.UserService
			beans.put(id, o);

			for (Element propertyElement : (List<Element>) element
					.getChildren("property")) {
				String name = propertyElement.getAttributeValue("name"); // userDAO
				String bean = propertyElement.getAttributeValue("bean"); // u
				Object beanObject = beans.get(bean);// UserDAOImpl instance

				String methodName = "set" + name.substring(0, 1).toUpperCase()
						+ name.substring(1);
				System.out.println("method name = " + methodName);// setUserDAO()
				// setUserDAO(UserDAO)
				Method m = o.getClass().getMethod(methodName,// userservice&&
																// setUserDAO()||���ݷ��������ֺͷ��������õ�����
						beanObject.getClass().getInterfaces()[0]);// �õ�ʵ�ֽӿڵ��Ǹ��ӿ�beanObject.getClass().getInterfaces()[0]=UserDAO
				m.invoke(o, beanObject);// beanObjectΪʵ�ʴ���ȥ�Ĳ���UserDAOImpl
			}

		}

	}

	public Object getBean(String id) {
		return beans.get(id);
	}

}