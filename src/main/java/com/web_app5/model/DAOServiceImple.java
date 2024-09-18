package com.web_app5.model;

import java.sql.*;

public class DAOServiceImple implements DAOService {
	private Connection con;
	private Statement stmnt;

	
	@Override
	public boolean connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration2", "root",   "test");
            stmnt = con.createStatement();
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

    @Override
	public boolean verifyLogin(String email, String password) {
		try {
			ResultSet result = stmnt.executeQuery("SELECT * FROM stdlog where email='"+email+"' and password='"+password+"'");
			return result.next();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;

	}
    @Override
	public void createRegistration(String FullName, String Email_ID, String Phone) {
		try {
			stmnt.executeUpdate("insert into student values('" + FullName + "', '" + Email_ID + "', '" + Phone + "' )");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateRegistration(String Email_ID, String Phone) {
		try {
			String query = "UPDATE student SET Phone='" + Phone + "' WHERE Email_ID='" + Email_ID + "'";
			stmnt.executeUpdate(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ResultSet deleteRegistration(String Email_ID) {
		try {
			stmnt.executeUpdate("Delete from student where Email_ID='"+Email_ID+"'");
		}catch(Exception e) {
			e.printStackTrace();		
			}
		return null;
	}

	@Override
	public ResultSet listAllReg() {
		try {
			return stmnt.executeQuery("Select * from student");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public ResultSet getRegistrationByEmail(String Email_ID) {
		try {
			String query = "SELECT * FROM student WHERE Email_ID = '" + Email_ID + "'";
			return stmnt.executeQuery(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	

}
