package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import core.BUSINESSRULES;
import core.UserDeatils;

public class PremiumCalTest {
	
	UserDeatils us;
	BUSINESSRULES br;
//Getting instances of below objects which are required to load before Test method
	@Before
	void getInstances(){
		 us=new UserDeatils();
		 br=new BUSINESSRULES();
		//assertNotNull(us);
	}
	@Test
	public void test() {
		double expectedPremium=5700.0;
		//Checking Weather instances are getting created or not.
		assertNotNull(us);
		assertNotNull(br);
		//Setting values are manually
		us=new UserDeatils();
		us.setName("Mukesh");
		us.setAge(34);
		us.setGender("Male");
		
		us.setHypertension("NO");
		us.setBP("NO");
		us.setBS("NO");
		us.setOW("YES");
		
		us.setSmoking("NO");
		us.setAlcohol("YES");
		us.setDE("YES");
		us.setDrugs("NO");
		//CaPremuim() is getting Tested here
		double calPremium=br.CalPremium(us);
		assertEquals(expectedPremium, calPremium);
		//fail("Not yet implemented");
	}

}
