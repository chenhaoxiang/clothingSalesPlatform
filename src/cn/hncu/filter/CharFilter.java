package cn.hncu.filter;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 * 为全站设置编码-过滤器
 * @author 陈浩翔
 * @version 1.0 
 */
public class CharFilter implements Filter {
	private String charset;
	public void init(FilterConfig filterConfig) throws ServletException {
		charset=filterConfig.getInitParameter("charset");
	}
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding(charset);
		chain.doFilter(request, response);
	}
	public void destroy() {
	}
}
