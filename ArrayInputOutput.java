package arrays;

import java.util.Scanner;

public class ArrayInputOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int n = sc.nextInt();
		int a[] = new int[n];//default values of array 0
		
		//for(int i=0; i<a.length;i++) {
		//	System.out.println(a[i]);
		//}
		
		
		//input array elements
		System.out.println("Enter "+a.length+" elements:");
		for(int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		//display
		
		System.out.println("array elements are:");
//		for(int i=0; i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
		for(int i:a) {//for each
			System.out.println(i);
		}
		
		int sum =0;
		for(int i:a) {
			sum +=i;
		}
		System.out.println("sum: "+sum);
		
		float avg=0;
		
		avg = (float)sum/a.length;
		System.out.println("average: "+avg);
		
		//find largest element of array
		
		int max=a[0];//assume first number is lagest
		int min =a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max= a[i];
			}
			if(a[i]<min) {
				min = a[i];
			}
			
		}
		System.out.println("Largest of array is:"+max);
		System.out.println("Minimum element is:"+min);
		
		//search element in array
		
		System.out.println("Enter element to search:");
		int search = sc.nextInt();
		
		for(int i=0; i<a.length;i++) {
			if(a[i] == search) {
				System.out.println("element is at position:"+a[i]);
				break;
			}
			}
		sc.close();
		}
		
	}
	


