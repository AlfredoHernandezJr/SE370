
import java.sql.*;
import java.util.Properties;

public class JDB {
	
	private static final String dbClassname = "com.mysql.cj.jdbc.Driver";
	
	private static final String CONNECTION = "jdbc:mysql://localhost:3306/restaurant" ;
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	
	{
		// TODO Auto-generated method stub
		System.out.println(dbClassname);
		
		Properties p = new Properties();
		
		p.put("user", "root");
		p.put("password", "password1");
		
		Connection c = DriverManager.getConnection(CONNECTION,p);
		System.out.println("It works");
		
		// Select statement for sql query
		String sql = "select * from foodmenu" ;
		
		PreparedStatement ps = null ;
		ResultSet rs = null ;
		
		ps = c.prepareStatement(sql) ;
		rs = ps.executeQuery() ;
		
		// Prints out the table's contents
		while(rs.next())
		{
			String food = rs.getString("food") ;
			System.out.println(food) ;
		}
		
		// Closes all connections
		c.close() ;		
		ps.close() ;
		rs.close() ;
	}
}
