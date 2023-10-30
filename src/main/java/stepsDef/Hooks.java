package stepsDef;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.TestBase;

public class Hooks {
	static TestBase test;
	
	@Before
    public static void setUp() {
		test = new TestBase();
		test.initiate();
    }

//    @After
//    public void tearDown() {
//
//    	test.tearDown();
//    }

}
