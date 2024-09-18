package com.web_app5.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;

import com.web_app5.model.DAOServiceImple;

@WebServlet("/updateReg")
public class UpdateCont extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public UpdateCont() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Email_ID = request.getParameter("Email_ID");
	
		DAOServiceImple service = new DAOServiceImple();
		service.connectDB();
		ResultSet result = service.getRegistrationByEmail(Email_ID);  // Fetch current registration details
		
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/updateReg.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Email_ID = request.getParameter("Email_ID");
		String phone = request.getParameter("Phone");

		
		DAOServiceImple service = new DAOServiceImple();
		service.connectDB();
		service.updateRegistration(Email_ID, phone);  // Perform the update operation
		
		// Redirect back to the list of registrations
		response.sendRedirect("listAllReg");
	}

}
