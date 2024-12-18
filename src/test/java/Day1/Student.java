package Day1;

public class Student {
	
	int sid;
	String sname;
	char grad;
	
	void printStudentData() 
	{
		System.out.println(sid+"  "+sname+"  "+grad);
	}
	public void setStudentData(int id,String name, char grd) 
	{
		sid = id;
		sname = name;
		grad =grd;
	}
	Student(int id,String name, char gr )
	{
		sid = id;
		sname = name;
		grad = gr;
		
	}
	

}
