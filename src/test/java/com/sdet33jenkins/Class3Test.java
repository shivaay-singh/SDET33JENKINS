package com.sdet33jenkins;

import org.testng.annotations.Test;

public class Class3Test {
	@Test
	public void test1() {
		
		
		String browser = System.getProperty("BROWSER");
		String url = System.getProperty("URL");
		System.out.println(browser+"  "+url);
		System.out.println("step 1 from class3");

	}

}
