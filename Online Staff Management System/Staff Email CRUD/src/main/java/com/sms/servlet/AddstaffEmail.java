package com.sms.servlet;

import com.sms.model.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.service.*;

@WebServlet("/AddstaffEmail")
public class AddstaffEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		String fname = request.getParameter("staff_fname");
		String lname = request.getParameter("staff_lname");
		String email = request.getParameter("staffemail");
		
		new Person(fname,lname,email);
		
		InsertStaffEmail ise1 = new InsertStaffEmail();
		
		if(ise1.insertstaffemail().equals("true")) {
		     request.setAttribute("result", "true");
		}
		else if(ise1.insertstaffemail().equals("false")) {
			request.setAttribute("result", "false");
		}
		else if(ise1.insertstaffemail().equals("already")) {
			request.setAttribute("result", "already");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("AddstaffEmail.jsp");
		dispatcher.forward(request, response);
	}

}
