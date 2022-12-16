package postgresJDBCConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;

public class CallableStmt {

	public static void main(String[] args) {
		Connection c = null;
		CallableStatement cstmt = null;
		try {
		Class.forName("org.postgresql.Driver");
		c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/callstmt", "postgres", "password");
		c.setAutoCommit(false);
		System.out.println("Opened database successfully");
		cstmt = c.prepareCall("{call myProcedure(?, ?, ?)}");
		cstmt.setString(1, "Raghav");
		      cstmt.setInt(2, 3000);
		      cstmt.setString(3, "Hyderabad");
		cstmt.setString(1, "Kalyan");
		      cstmt.setInt(2, 4000);
		      cstmt.setString(3, "Vishakhapatnam");

		      cstmt.setString(1, "Rukmini");
		      cstmt.setInt(2, 5000);
		      cstmt.setString(3, "Delhi");

		      cstmt.setString(1, "Archana");
		      cstmt.setInt(2, 15000);
		      cstmt.setString(3, "Mumbai");

		      cstmt.execute();
		      System.out.println("Rows inserted ....");
		      cstmt.close();
		      c.commit();
		      c.close();
		   }
		catch (Exception e) {
		System.err.println(e);
		System.exit(0);
		}
		

	}

}
