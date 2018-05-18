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
		System.out.println("初始化:" + initParam);
	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain filterChain) {
		try {
			HttpServletRequest request = (HttpServletRequest) req;
			HttpServletResponse response = (HttpServletResponse) res;
			HttpSession session = request.getSession();

			// 这里放到达目的地前(进入)处理代码
			System.out.println("执行do之前---");
			filterChain.doFilter(request, response);
			System.out.println("执行do之后---");
			// 这里放到达目的地(离开)的处理代码

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}

	public void destroy() {
		System.out.println("销毁----");
	}
}
