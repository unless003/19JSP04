package main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import bo.customer;
import icustomerdao.ICustomerDAO;
import icustomerdaoImpl.CustomerDAOImpl;
import utils.ConnectionUtils;

public class ProgramMain {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		Connection conn = ConnectionUtils.getMyConnection();
		Statement st = conn.createStatement();
		
//		String sql = "insert into customer (ID, NAME, AGE, ADDRESS , SALARY) values (4, 'Duong Thi D', 25 ,'Ha Noi',4000)";
//		st.execute(sql);
		
		
		//ADD
		ICustomerDAO cusDAO = new CustomerDAOImpl();
//		customer cus = new customer(8, " Hoang Thi G", 22, "Quang Binh", 7500);
	//	cusDAO.addCustomer(cus, st);
		
	
	
		//Show 
		cusDAO.ShowCustomer(st);
		//Find
		cusDAO.findCustomerByName("Le Van A", st);
		//Delete
//		cusDAO.deleteCustomer("Hoang Thi E", st);
		
		
	}

}
