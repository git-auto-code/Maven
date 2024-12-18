package Day1;

public class StudentMain {

	public static void main(String[] args) {
		
		//using object reference variable
		
        //Student s = new Student();
        
        /*s.sid=101;
        s.sname="abc";
        s.grad='A';
        s.printStudentData();*/
        
        //using method
        
        //s.setStudentData(102, "xyz", 'B');
        //s.printStudentData();
        
        //using constructor
        Student stu = new Student(103,"efg",'C');
        stu.printStudentData();
	}

}
