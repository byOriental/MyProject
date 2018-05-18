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
			info.add("用户id不能为空！");
		}
		if (password == null || "".equals(password)) {
			info.add("用户密码不能为空！");
		}
		if (info.size() == 0) {
			Consumer consumer = new Consumer();
			consumer.setUserid(userid);
			consumer.setPassword(password);
			try {
				if (DaoFactory.getDaoInstance().userLogin(consumer)) {// 承接上面的异常在这里不能再抛
					info.add("登陆成功！！！");
				} else {
					info.add("登陆不成功！！！");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		request.setAttribute("info", info);
		request.getRequestDispatcher(path).forward(request, response);// 服务器跳转
		;
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
