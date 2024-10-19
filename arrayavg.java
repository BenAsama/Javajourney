package algoritims1;

import java.util.Scanner;

public class arrayavg {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        int sum = 0;
	        for ( int y = 0; y<n ;y++) {
	        	
	        	sum = sum + arr[y];
	        	
	        }
	        
	        System.out.println("The sum of the numbers :" + sum);
	        System.out.println("Average of the numbers:"+ (double)sum/n);
		}
	}
