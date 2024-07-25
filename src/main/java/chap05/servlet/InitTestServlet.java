package chap05.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitTestServlet extends HttpServlet {
	// init() : 이 서블릿이 최초로 실행될 때 딱 한 번 실행되는 메서드로서 해당 서블릿의 초기화 작업을 위해 사용할 수 있게끔 만들어 두었다.
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		String user = config.getInitParameter("db_account");
		String pw = config.getInitParameter("db_password");
		
		System.out.println("user: " + user);
		System.out.println("pw: " + pw);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ServletContext : 서블릿들을 담아놓는 통과 소통할 수 있는 객체(즉, 톰캣)
		ServletContext application = req.getServletContext();
		
		// web.xml에서 <context-param>으로 등록한 초기화 파라미터들은 톰캣에 등록되어 있다.
		System.out.println(application.getInitParameter("penguin_img"));
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
