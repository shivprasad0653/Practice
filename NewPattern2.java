package edubridge;

public class NewPattern2 {
    public static void main(String[] args) {
int r=1, c=3;
		
		for(int i=3; i<=r;i++) {
			for(int b=1; b<=r-i;b++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
				
			}
			System.out.println();
		}
	}

}