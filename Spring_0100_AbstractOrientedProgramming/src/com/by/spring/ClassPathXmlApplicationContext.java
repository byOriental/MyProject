package com.by.spring;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

/**
 * 
 * @Title:ClassPathXmlApplicationContext
 * @Description:模拟spring---将配置文件里面的对象（比如UserDAOImpl）读出来，放到userservice,给对象（UserDAO）进行初始化
 * @author:Administrator
 * @date:2018年3月22日 上午11:22:39
 */
public class ClassPathXmlApplicationContext implements BeanFactory {

	private Map<String, Object> beans = new HashMap<String, Object>();

	// IOC Inverse of Control DI Dependency Injection
	public ClassPathXmlApplicationContext() throws Exception {
		SAXBuilder sb = new SAXBuilder();

		Document doc = sb.build(this.getClass().getClassLoader()
				.getResourceAsStream("beans.xml")); // 构造文档对象
		Element root = doc.getRootElement(); // 获取根元素HD
		List list = root.getChildren("bean");// 取名字为disk的所有元素
		for (int i = 0; i < list.size(); i++) {
			Element element = (Element) list.get(i);
			String id = element.getAttributeValue("id");
			String clazz = element.getAttributeValue("class");
			Object o = Class.forName(clazz).newInstance();// 通过反射得到类
			System.out.println(id);// u userService
			System.out.println(clazz);// com.by.dao.impl.UserDAOImpl
										// com.by.service.UserService
			beans.put(id, o);

			for (Element propertyElement : (List<Element>) element
					.getChildren("property")) {
				String name = propertyElement.getAttributeValue("name"); // userDAO
				String bean = propertyElement.getAttributeValue("bean"); // u
				// 通过拿到属性名字u在容器beans中再拿对象UserDAOImpl instance出来
				Object beanObject = beans.get(bean);

				String methodName = "set" + name.substring(0, 1).toUpperCase()
						+ name.substring(1);
				System.out.println("method name = " + methodName);// setUserDAO()
				// setUserDAO(UserDAO)
				Method m = o.getClass().getMethod(methodName,// userservice&&
																// setUserDAO()||根据方法的名字和方法参数拿到方法
						beanObject.getClass().getInterfaces()[0]);// 得到实现接口的那个接口即UserDAO
				m.invoke(o, beanObject);// invoke调用方法的方法(参考例子)
			}

		}

	}

	public Object getBean(String id) {
		return beans.get(id);
	}

}