import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Set;


public class EntryPoint {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		DataStoreImpl dataStoreImpl = new DataStoreImpl();
		
		if(dataStoreImpl.loginUser("user1", "1111")){
			
			System.out.println("success");
			
		} else {
			
			System.out.println("fail");
			
		}

	}

}
