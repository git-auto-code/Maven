package Day1;

public class Greetings {
	//1.No params    No return value
	void m1()
	{
		System.out.println("Hello...");
	}
	//2.No params   return value
	String m2() 
	{
		return("welcome to training");
	}
	//3.Takes params  no return value
	void m3(String name) 
	{
		System.out.println("Hello " +name);
	}
	//4.Takes params   return value
	String m4(String name) 
	{
		return("Hello "+name);
	}

}
