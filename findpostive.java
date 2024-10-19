package algoritims1;
import java.util.Scanner;

  
public class findpostive {
	
	public static  void positive(int n, int y[]) {
			
		}
	
	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.print("input the size you want the array to hold ");
		
		int mynum = scanner.nextInt();
		int[] arr = new int[mynum];
		
		System.out.println("Enter the elements you want your array to hold ");
		for( int i=0; i<mynum; i++) {
			arr[i]=scanner.nextInt();
		}
		int count = 0;
		for(int q=0;q<mynum;q++) {
			if(arr[q]>0) {
				count= count + 1;
			}
		}
		System.out.println("The number of positive elements are : " + count);
		
	}

}
