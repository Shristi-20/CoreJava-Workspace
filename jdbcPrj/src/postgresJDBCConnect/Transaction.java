package postgresJDBCConnect;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Transaction {

	public static void main(String[] args) {
		Connection c = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbceg", "postgres", "password");
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");
			ps=c.prepareStatement("insert into user420 values(?,?,?)");  
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
			while(true){  
			  
			System.out.println("enter id"); 
			String s1=br.readLine();  
			int id=Integer.parseInt(s1);  
			  
			System.out.println("enter name");  
			String name=br.readLine();  
			  
			System.out.println("enter salary");  
			String s3=br.readLine();  
			int salary=Integer.parseInt(s3);  
			  
			ps.setInt(1,id);  
			ps.setString(2,name);  
			ps.setInt(3,salary);  
			ps.executeUpdate();  
			  
			System.out.println("commit/rollback");  
			String answer=br.readLine();  
			if(answer.equals("commit")){  
			c.commit();  
			}  
			if(answer.equals("rollback")){  
			c.rollback();  
			}  
			  
			  
			System.out.println("Want to add more records y/n");  
			String ans=br.readLine();  
			if(ans.equals("n")){  
			break;  
			}  
			  
			}  
			c.commit();  
			System.out.println("record successfully saved");  
			  
			c.close();//before closing connection commit() is called  
			}catch(Exception e){System.out.println(e);}  
			  
			
		

	}

}
