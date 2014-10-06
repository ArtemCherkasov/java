
public class EntryPoint {

	public static void main(String[] args){

		DataStoreImpl dataStoreImpl = new DataStoreImpl();
		
		if(dataStoreImpl.loginUser("randomUser", "password")){
			
			System.out.println("success");
			
		} else {
			
			System.out.println("fail");
			
		}

	}

}
