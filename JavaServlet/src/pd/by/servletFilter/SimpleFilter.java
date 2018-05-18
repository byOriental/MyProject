package pd.by.servletFilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SimpleFilter implements Filter {
	public SimpleFilter() {
		super();
	}

	private FilterConfig filterConfig;

	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
		String initParam = filterConfig.getInitParameter("ref");
		System.out.println("��ʼ��:" + initParam);
	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain filterChain) {
		try {
			HttpServletRequest request = (HttpServletRequest) req;
			HttpServletResponse response = (HttpServletResponse) res;
			HttpSession session = request.getSession();

			// ����ŵ���Ŀ�ĵ�ǰ(����)�������
			System.out.println("ִ��do֮ǰ---");
			filterChain.doFilter(request, response);
			System.out.println("ִ��do֮��---");
			// ����ŵ���Ŀ�ĵ�(�뿪)�Ĵ������

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}

	public void destroy() {
		System.out.println("����----");
	}
}
