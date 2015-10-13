import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseDemo{

	public static void main(String[] arrgs)throws SQLException, ClassNotFoundException{

		System.out.println("Testing database access...STARTING");

		String connectStr="jdbc:mysql://localhost:3306/fooddb";

		String username="root";
		
		String password="csci330pass";

		String driver="com.mysql.jdbc.Driver";

		Connection con = DriverManager.getConnection(connectStr, username, password);

		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT id, name, category FROM ingreient");

		String result = "";
	
		while (rs.next()){

			int theId = rs.getInt("id");
			String theName = rs.getString("name");
			String theCategory = rs.getString("category");
			result += "id: "+theId+ " , name: " +theName+ "("+theCategory+")";
			System.out.println("Results:\n\n" +result);
		}

		

		System.out.println("Testing database access...FINISHED");
 
	}//End Main
}//End class
