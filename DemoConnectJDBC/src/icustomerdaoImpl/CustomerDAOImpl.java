package icustomerdaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bo.customer;
import icustomerdao.ICustomerDAO;

public class CustomerDAOImpl implements ICustomerDAO {

	@Override
	public List<customer> ShowCustomer(Statement st) throws SQLException {
		// TODO Auto-generated method stub
		List<customer> cus = new ArrayList<customer>();
		String sqlShow = "Select * from customer";
		
		ResultSet rs = st.executeQuery(sqlShow);
		System.out.println("---------> : "+sqlShow);
		while(rs.next()) {
			String ID =rs.getString("ID");
			String NAME = rs.getString("NAME");
			String AGE = rs.getString("AGE");
			String ADDRESS = rs.getString("ADDRESS");
			String SALARY =rs.getString("SALARY");
			
			System.out.println("-----------------------------------------------------");
			System.out.println(ID +"||"+ NAME +"||"+ AGE +"||"+ ADDRESS +"||"+ SALARY);
		}
		return cus;
		
	}

	@Override
	public void addCustomer(customer customer, Statement st) throws SQLException {
		// TODO Auto-generated method stub
		String sqlInsert = " insert into customer (ID, NAME , AGE , ADDRESS,SALARY)"
				+ " values("+customer.getID()+","+"'"+customer.getNAME().trim()+"'"+","+customer.getAGE()+","+"'"+customer.getADDRESS().trim()+"'"+","+customer.getSALARY()+")";
		System.out.println("insert into query : "+sqlInsert);
		st.executeUpdate(sqlInsert);
	}

	@Override
	public void updateCustomer(customer customer, Statement st) throws SQLException {
		// TODO Auto-generated method stub
		String sqlUpdate = ("update customer "+" set  "+"'"+customer.getNAME().trim()+"'"+","+customer.getAGE()+","+"'"+customer.getADDRESS().trim()+"'"+","+customer.getSALARY()+"    "+" where "+customer.getID()+" ");
		System.out.println("Update query "+sqlUpdate);
		st.executeUpdate(sqlUpdate);
	}

	@Override
	public void deleteCustomer(String NAME, Statement st) throws SQLException {
		// TODO Auto-generated method stub
		String sqlDelete = (  "Delete from  customer where NAME ='"+NAME + "' " );
		System.out.println(" Delete query : "+sqlDelete);
		st.executeUpdate(sqlDelete);
	}

	@Override
	public List<customer> findCustomerByName(String NAME, Statement st) throws SQLException {
		// TODO Auto-generated method stub
		
		List<customer> cts =new ArrayList<customer>();
		String sqlFind= ("select ID,NAME,AGE,ADDRESS,SALARY from customer where NAME ='"+NAME + "'");
		System.out.println("--------> "+sqlFind);
		ResultSet rs = st.executeQuery(sqlFind);
		
		while(rs.next()) {
			int ID =rs.getInt(1);
			String NAMEs = rs.getString("NAME");
			int AGE = rs.getInt(3);
			String ADDRESS = rs.getString("ADDRESS");
			double SALARY =rs.getDouble(5);
		customer customer = new customer(ID, NAMEs, AGE,ADDRESS, SALARY);
		cts.add(customer);
	
		}
		cts.stream().forEach(item -> {
			System.out.println("Item: " + item.toString());
		});
		
		for(int i = 0; i< cts.size(); i++) {
			System.out.println("Item 2: " + cts.get(i).toString());
		}
		
		System.out.println("----Below----");
		return cts;
	
	}


}
