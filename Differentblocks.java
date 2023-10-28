package blocks;

public class Differentblocks {
	static{
		System.out.println("Static block");
		
	}
	static{
		System.out.println("Static block2");
		
	}
	
	 Differentblocks() {
		System.out.println("Constructor is called on object creation");
	}
	 {
		 System.out.println("annonymous block");
	 }
	 {
		 System.out.println("annonymous block2");
	 }
		
	
	
	public static void main(String[] args) {
		System.out.println("Main Block");
		Differentblocks obj = new Differentblocks();
		}

}
