package com.wallet.paybill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PayElectricityServlet extends HttpServlet{
	
	private float unitPerRate = 0.0f;
	@Override
	public void init() throws ServletException {
		unitPerRate = 5.5f;
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("rate", unitPerRate);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("calculate");
		dispatcher.include(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("Please pay online or offiline before 20th of this month");
	}
	
	

}
