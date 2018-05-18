package pd.by.servletListener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class ServletRequestAttributeListenerDemo implements
		ServletRequestAttributeListener {

	public void attributeAdded(ServletRequestAttributeEvent even) {
		System.out.println("�������_��������--->" + even.getName() + "��������--->"
				+ even.getValue());
	}

	public void attributeRemoved(ServletRequestAttributeEvent even) {
		System.out.println("�����Ƴ�_��������--->" + even.getName() + "��������--->"
				+ even.getValue());
	}

	public void attributeReplaced(ServletRequestAttributeEvent even) {
		System.out.println("�����滻_��������--->" + even.getName() + "��������--->"
				+ even.getValue());
	}

}
