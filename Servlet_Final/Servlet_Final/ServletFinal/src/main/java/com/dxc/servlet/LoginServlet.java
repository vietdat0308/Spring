package com.dxc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String u = request.getParameter("user");
		String p = request.getParameter("user");
		if("google".equalsIgnoreCase(u) || "google".equalsIgnoreCase(p) ) {
			response.sendRedirect("http://google.com");
		}else if("admin".equalsIgnoreCase(u) || "admin".equalsIgnoreCase(p) ) {
			//set attribute in request
			request.setAttribute("fullname", "Quan Tri Vien");
			
			//set session
			request.getSession().setAttribute("isLogin", true);
			
			//set cookie in browser
			Cookie ck =new Cookie("user_role","Aministrator");
			ck.setMaxAge(3600);
			response.addCookie(ck);
			
			request.getRequestDispatcher("AccountDetailServlet").forward(request, response); 
		}else {
			//login fail
			response.sendRedirect("loginfailed.html");
		}
	}

}
