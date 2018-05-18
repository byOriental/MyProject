package pd.by.servletListener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class ServletRequestAttributeListenerDemo implements
		ServletRequestAttributeListener {

	public void attributeAdded(ServletRequestAttributeEvent even) {
		System.out.println("属性添加_属性名称--->" + even.getName() + "属性内容--->"
				+ even.getValue());
	}

	public void attributeRemoved(ServletRequestAttributeEvent even) {
		System.out.println("属性移除_属性名称--->" + even.getName() + "属性内容--->"
				+ even.getValue());
	}

	public void attributeReplaced(ServletRequestAttributeEvent even) {
		System.out.println("属性替换_属性名称--->" + even.getName() + "属性内容--->"
				+ even.getValue());
	}

}
