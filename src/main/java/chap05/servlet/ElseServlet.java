package chap05.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ElseServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("ElseServlet: 매핑에 걸리지 않으면 도착하는 곳입니다...");
		System.out.println("요청보내신 주소: " + req.getRequestURI());
	}
}
