
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException ;

import java.util.Properties;

public class JDB {
	
	private static final String dbClassname = "com.mysql.cj.jdbc.Driver";
	
	private static final String CONNECTION = "jdbc:mysql://localhost:3306/test" ;
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	
	{
		System.out.println(dbClassname);
		
		Properties p = new Properties();
		
		p.put("user", "root");
		p.put("password", "password1");
		
		Connection c = DriverManager.getConnection(CONNECTION,p);
		System.out.println("It works");
		
		// Select statement for sql query
		String sql = "select * from person" ;
		
		Statement s = null ;
		ResultSet rs = null ;
		
		s = c.prepareStatement(sql) ;
		rs = s.executeQuery(sql) ;
		
		// Prints out the table's contents
		while(rs.next())
		{
			String id = rs.getString("id") ;
			System.out.print(id+ " ") ;
			
			String name = rs.getString("name") ;
			System.out.print(name + " ") ;
			
			String address = rs.getString("address") ;
			System.out.println(address) ;
		}
		
		// Closes all connections
		c.close() ;		
		s.close() ;
		rs.close() ;

	}
}
