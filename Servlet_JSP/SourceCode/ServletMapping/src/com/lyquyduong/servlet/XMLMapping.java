/**
 * 
 */
package com.lyquyduong.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author QuyDuong
 *
 */
public class XMLMapping extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletOutputStream out = resp.getOutputStream();
		String name = (String) req.getAttribute("fullname");
		out.print("new cowntent; mapping by xml - " + name);
	}
}
