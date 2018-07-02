package com.lyquyduong.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WithInitParam
 */
@WebServlet(
		urlPatterns = { "/abc" }, 
		initParams = { 
				@WebInitParam(name = "shortname", value = "chao cac ban")
		})
public class WithInitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String shortName;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WithInitParam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		this.shortName = config.getInitParameter("shortname");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append(shortName+";Served at: ").append(request.getContextPath());
		response.sendRedirect("http://google.com");
//		request.setAttribute("fullname", "java web");
//		RequestDispatcher dispatcher = request.getServletContext()
//                .getRequestDispatcher("/xml");
//        dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
