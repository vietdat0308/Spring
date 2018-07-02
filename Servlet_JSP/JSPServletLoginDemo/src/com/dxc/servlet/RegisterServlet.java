package com.dxc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");

		if (first_name.isEmpty() || last_name.isEmpty() || username.isEmpty() || password.isEmpty() || address.isEmpty()
				|| contact.isEmpty()) {
			response.getWriter().append("Please enter all field in form");
		} else {
			request.setAttribute("first_name", first_name);
			request.setAttribute("last_name", last_name);
			request.setAttribute("username", username);
			request.setAttribute("passwordVu", password);
			request.setAttribute("address", address);
			request.setAttribute("contact", contact);
			RequestDispatcher req = request.getRequestDispatcher("LoginSuccess.jsp");
			req.forward(request, response);
		}
	}
}
