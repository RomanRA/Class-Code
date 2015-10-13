
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Path("ws2")
public class IngredientServices {
	
	@Path("/ingredients")
	@GET
	@Produces("text/plain")
	public String getIngredients()throws SQLException, ClassNotFoundException {
		
		String connectStr="jdbc:mysql://localhost:3306/fooddb";

		String username="root";
		
		String password="csci330pass";

		String driver="com.mysql.jdbc.Driver";
		Class.forName(driver);

		Connection con = DriverManager.getConnection(connectStr, username, password);

		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT id, name, category FROM ingredient");

		String result = "";
	
		while (rs.next()){

			int theId = rs.getInt("id");
			String theName = rs.getString("name");
			String theCategory = rs.getString("category");
			result += "id: "+theId+ " , name: " +theName+ "("+theCategory+")" +"\n";
		}

		return result;
	
	}

	@Path("/ingredients/{id}")
	@GET
	@Produces("text/plain")
	public String getIngredientById(@PathParam("id") String theId)throws SQLException, ClassNotFoundException{
		int intId = 0;
		
		//url patterens are always strings, need to convert to int
		try{
			intId = Integer.parseInt(theId);}
		catch(NumberFormatException ne){
			intId = 1;}

		//Now Retrieve ingredients from database
		String connectStr="jdbc:mysql://localhost:3306/fooddb";

		String username="root";
		
		String password="csci330pass";

		String driver="com.mysql.jdbc.Driver";
		Class.forName(driver);

		Connection con = DriverManager.getConnection(connectStr, username, password);

		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT id, name, category FROM ingredient WHERE id="+intId);

		String result = "";
	
		while (rs.next()){

			int theId2 = rs.getInt("id");
			String theName = rs.getString("name");
			String theCategory = rs.getString("category");
			result += "id: "+theId2+ " , name: " +theName+ "("+theCategory+")" +"\n";
		}

		return result;
	}

	@Path("/ingredients/ingredient")
	@GET
	@Produces("text/plain")
	public String getIngredientByName(@QueryParam("name") String theName){
		String theIng = "";
		
		//retrieve ingredient from db
		String connectStr="jdbc:mysql://localhost:3306/fooddb";

		String username="root";
		
		String password="csci330pass";

		String driver="com.mysql.jdbc.Driver";
		Class.forName(driver);

		Connection con = DriverManager.getConnection(connectStr, username, password);

		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT id, name, category FROM ingredient WHERE name='" +theName+ "'");
		String result = "";
	
		while (rs.next()){

			int theId3 = rs.getInt("id");
			String theNameAgain = rs.getString("name");
			String theCategory = rs.getString("category");
			result += "id: "+theId3+ " , name: " +theNameAgain+ "("+theCategory+")" +"\n";
		}

		return result;
	}
}//End Class