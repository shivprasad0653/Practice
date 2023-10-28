package loopsEx;

public class ArmstrongFindEx {

	public static void main(String[] args) {
		System.out.println("Armstrong Number Between 1 to 1000:");
		for(int i=1;i<=1000;i++) {
	
				int num=i,d,result=0;
				//Scanner sc=new Scanner(System.in);
				
				//System.out.println("Enter number:-");
				//num=sc.nextInt();
				int orgnum=num,n=0;
				
				
				while(num>0) {
					n++;
					num /=10;
				}
		        
				num=orgnum;
				
				while(num>0) {
					d=num%10;
					result=(int)(result+Math.pow(d, n));
					num /=10;
					
				}
				
				if(orgnum==result) {
					System.out.println(orgnum);
				}/*else {
					System.out.println(orgnum+"is not armstrong number");
				}*/
			}
			}

	}


