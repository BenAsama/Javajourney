package algoritims1;
import java.util.Scanner;
public class linersearch {

	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter the number of elements you want your array to hold: ");
		
		//take input from the user and assigns it to arraycount 
		int arraycount = scanner1.nextInt();
		int[] linarray =  new int[arraycount];
		
		//Assigns the user input and stores it in the array
		System.out.println("Input the elements you want to be in the array");
		for(int i =0 ; i < arraycount; i++) {
			linarray[i]=scanner1.nextInt();
		}
		
		//The Search sequence begins
		System.out.println("Please enter the element you would like to search :");
		int n =scanner1.nextInt();
		
		for(int y= 0; y<arraycount; y++) {
			if(linarray[y]==n) {
				int searchresult = n;
				System.out.println("The number you searched for is present in the array at position " + (int)y );
			}
		}
		
	}

}
