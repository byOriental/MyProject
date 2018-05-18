package pd.by.servletListener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class ServletRequestEventDemo implements ServletRequestListener {

	public void requestInitialized(ServletRequestEvent event) {
		System.out.println("request���Գ�ʼ��--->"
				+ event.getServletRequest().getRemoteAddr()
				+ event.getServletContext().getContextPath());
		// TODO Auto-generated method stub

	}

	public void requestDestroyed(ServletRequestEvent event) {
		System.out.println("request��������--->"
				+ event.getServletRequest().getRemoteAddr()
				+ event.getServletContext().getContextPath());
		// TODO Auto-generated method stub

	}

}
