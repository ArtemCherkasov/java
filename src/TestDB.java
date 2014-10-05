import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestDB{
	
	@Before
	public void putData(){
		
		DataStoreImpl dataStoreImpl = new DataStoreImpl();
		User user = new User();
		user.setLogin("randomUser");
		user.setName("USER");
		user.setSurname("SURNAME");
		user.setPassword("password");
		
		if (dataStoreImpl.getUser(user.getLogin()) == null)
			dataStoreImpl.addUser(user);
		
	}
	
	@Test
	public void testData(){
		
		assertEquals(1, 1);
		
	}

}
