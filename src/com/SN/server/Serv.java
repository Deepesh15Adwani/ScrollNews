package com.SN.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Serv extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html");
		
		PrintWriter out=res.getWriter();
		
		String s1=req.getParameter("t1");
		
		GreetingServiceImpl aa=new GreetingServiceImpl();
		String news=aa.checkk(s1);
		
		out.println(news);
		//GreetingServiceImpl aa=new GreetingServiceImpl();
		
	}
}
