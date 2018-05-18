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

public class EncodingFilter implements Filter {
	public EncodingFilter() {
		super();
	}

	private FilterConfig filterConfig;
	private String charset;

	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
		String charset = this.filterConfig.getInitParameter("charset");
	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain filterChain) {
		try {
			HttpServletRequest request = (HttpServletRequest) req;
			HttpServletResponse response = (HttpServletResponse) res;
			HttpSession session = request.getSession();

			// 这里放到达目的地前(进入)处理代码
			request.setCharacterEncoding(this.charset);
			filterChain.doFilter(req, res);

			// 这里放到达目的地(离开)的处理代码

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}

	public void destroy() {
	}
}
