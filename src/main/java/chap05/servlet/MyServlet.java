package chap05.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("매핑 잘 도착했습니다...");
		
		// forward는 WEB-INF 밑의 경로에 있는 .jsp 파일에 접근할 수 있다.
		req.getRequestDispatcher("/WEB-INF/views/myPage2.jsp").forward(req, resp);
	}
}
