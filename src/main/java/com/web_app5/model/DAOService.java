package com.web_app5.model;

import java.sql.ResultSet;

public interface DAOService {
	public boolean connectDB();
	public boolean verifyLogin(String email, String password);
	public void createRegistration(String FullName, String Email_ID, String Phone);
	public void updateRegistration(String Email_ID, String Phone);
	public ResultSet deleteRegistration(String Email_ID);
	public ResultSet listAllReg();
	public ResultSet getRegistrationByEmail(String Email_ID);
}
