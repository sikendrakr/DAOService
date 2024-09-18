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

@WebServlet("/listAllReg")
public class ReadRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ReadRegController() {
      super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOServiceImple service = new DAOServiceImple();
		service.connectDB();
		service.listAllReg();
		ResultSet result = service.listAllReg();
		request.setAttribute("result", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/listReg.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
