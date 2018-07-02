package com.lyquyduong;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProccesServlet
 */
@WebServlet("/ProccesServlet")
public class ProccesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String  data = request.getParameter("data");
		response.getWriter().append("Served at: ").append(data);
		request.setAttribute("rs", data);
		HttpSession session = request.getSession(true);
		
		Cookie dataC = new Cookie("data", request.getParameter("data"));
		dataC.setMaxAge(3600);
	 response.addCookie( dataC );
//	 response.setContentLength(len);
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}


}
