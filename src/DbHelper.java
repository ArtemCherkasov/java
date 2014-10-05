import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbHelper {
	
	private final String CREATETABLES_SQL_PATH = "src/createTables.sql";
	
	private Connection conn;

	@SuppressWarnings("resource")
	public Connection getConn() {
		
		Statement stmt = null;
		
		try {
			
			Class.forName("org.sqlite.JDBC");
			String databaseUrl = "jdbc:sqlite:mydatabase.db";
			conn = DriverManager.getConnection(databaseUrl);
			stmt = conn.createStatement();
			stmt.executeUpdate(new Scanner(new File(CREATETABLES_SQL_PATH)).useDelimiter("\\A").next());
			
			if(stmt != null){
				
				stmt.close();
				
			}
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		return conn;
		
	}

}
