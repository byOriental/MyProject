package pd.mvc.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pd.dao.vo.Consumer;
import pd.factory.daoFactory.DaoFactory;

public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = "login.jsp";
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		List<String> info = new ArrayList<String>();
		if (userid == null || "".equals(userid)) {
			info.add("�û�id����Ϊ�գ�");
		}
		if (password == null || "".equals(password)) {
			info.add("�û����벻��Ϊ�գ�");
		}
		if (info.size() == 0) {
			Consumer consumer = new Consumer();
			consumer.setUserid(userid);
			consumer.setPassword(password);
			try {
				if (DaoFactory.getDaoInstance().userLogin(consumer)) {// �н�������쳣�����ﲻ������
					info.add("��½�ɹ�������");
				} else {
					info.add("��½���ɹ�������");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		request.setAttribute("info", info);
		request.getRequestDispatcher(path).forward(request, response);// ��������ת
		;
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
