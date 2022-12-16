package postgresJDBCConnect;
import java.sql.*;



public class PrepStmt {
	public static void main(String[] args) {
		Connection c = null;
		PreparedStatement stmt = null;
		try {
		Class.forName("org.postgresql.Driver");
		c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbceg", "postgres", "password");
		c.setAutoCommit(false);
		System.out.println("Opened database successfully");
		// Insertion
		stmt=c.prepareStatement("insert into employee values(?,?)");    
		stmt.setInt(1,103);//1 specifies the first parameter in the query  
		stmt.setString(2,"Akash"); 
		int i=((java.sql.PreparedStatement) stmt).executeUpdate();  
		System.out.println(i+" records inserted"); 

		// Select (Retrieval)
		 stmt=c.prepareStatement("select * from employee");  
		ResultSet rs=stmt.executeQuery();  
		while(rs.next()){  
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+ "\n");  
		}  

		// Update
		stmt=c.prepareStatement("update employee set name=? where id=?");  
		stmt.setString(1,"Sonoo");//1 specifies the first parameter in the query i.e. name  
		stmt.setInt(2,103);  
		  
		i=stmt.executeUpdate();  
		System.out.println(i+" records updated");  

		// Select (Retrieval)
		 stmt=c.prepareStatement("select * from employee");  
		rs=stmt.executeQuery();  
		System.out.println("Update record: ");
		while(rs.next()){  
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+ "\n");  
		}

		// Deletion
		stmt=c.prepareStatement("delete from employee where id=?");  
		stmt.setInt(1,103);  
		  
		i=stmt.executeUpdate();  
		System.out.println(i+" records deleted"); 
		stmt.close();
		c.close();  }
		catch (Exception e) {
		System.err.println(e);
		System.exit(0);
		}
	}

}
