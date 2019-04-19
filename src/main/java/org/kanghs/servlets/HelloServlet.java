package org.kanghs.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 서블릿은 데이터 처리만 하고 페이지 출력은 JSP와 같은 뷰 기술로 넘긴다.
 * 
 * @author kanghs
 */
@WebServlet("/helloMvc")
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = "강현수";

		// 데이터를 request에 태운다.
		req.setAttribute("name", name);

		// /WEB-INF/jsp/hello.jsp로 forward 한다.
		req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req, resp);
	}
}
