package pd.by.servletBasic;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext app = super.getServletContext();
		// ��ȡServlet���ڷ������µĸ�Ŀ¼������Ŀ¼��C:\Tomcat7.0\me-webapps\JavaServlet
		System.out.println("��ʵ·��:" + app.getRealPath("/"));
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
