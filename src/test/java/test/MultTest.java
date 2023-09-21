package test;

import org.testng.annotations.Test;

public class MultTest extends BaseTest{
	
	@Test
	public static void mul(){
		int a =10, b=9;
		int c = a*b;
		System.out.println("Value(Multiply)- " + c);
	}


}
