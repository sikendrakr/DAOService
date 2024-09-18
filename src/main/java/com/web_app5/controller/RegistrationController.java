package com.web_app5.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


import com.web_app5.model.DAOServiceImple;

@WebServlet("/register")

public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegistrationController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/create_reg.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String FullName = request.getParameter("FullName");
		String Email_ID = request.getParameter("Email_ID");
		String Phone = request.getParameter("Phone");
		
		DAOServiceImple service = new DAOServiceImple();
		service.connectDB();
		service.createRegistration(FullName, Email_ID, Phone);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/create_reg.jsp");
		rd.forward(request, response);
		}
	}

