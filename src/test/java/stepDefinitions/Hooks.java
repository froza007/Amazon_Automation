package stepDefinitions;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

   
	@Before
	public void setup(){

	    BaseClass.setup();
	}


    @After
    public void tearDown(){

        BaseClass.tearDown();
    }
}
