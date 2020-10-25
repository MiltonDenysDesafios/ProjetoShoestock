package br.sp.mdenys.core;

import static br.sp.mdenys.core.DriverFactory.killDriver;

import java.io.IOException;

import io.cucumber.java.After;

public class BaseTest {
	

	@After
	public void finaliza() throws IOException{
			
		killDriver();
		
	}

}
