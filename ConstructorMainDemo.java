package blocks;

class Student{
	int sid;
	String sname;
	
	public Student(int sid, String sname) {
		super();
		
		this.sid = sid;
		this.sname = sname;
//		System.out.println("Present object "+this);
	}

}

public class ConstructorMainDemo {

	public static void main(String[] args) {
		
		Student sob = new Student(10, "Shiv");
		
		Student sob1 = new Student(20,"Sumit");
		
//		System.out.println("Object of student sob= "+sob);
//		System.out.println("Object of student sob1= "+sob1);
		
		System.out.println("sid = "+sob.sid);
		System.out.println("sname = "+sob.sname);
		
		System.out.println("sid = "+sob1.sid);
		System.out.println("sname = "+sob1.sname);
		
		

	}

}
