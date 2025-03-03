import java.util.Scanner;

public class OddEvenSeperator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking user input
		System.out.print("Enter a natural number: ");
		int number = sc.nextInt();
		
		if(number <= 0){
			System.err.print("Not a natural number");
			System.exit(0);
		}
		
		// Arrays to store even and odd numbers
		int[] evenNumbers = new int[number/2 + 1];
		int[] oddNumbers = new int[number/2 + 1];
		
		// Index variables for even and odd numbers
		int evenIndex = 0;
		int oddIndex = 0;
		
		// Storing odd and even numbers
		for(int i = 1 ; i <= number; i++){
			if(i % 2 == 0){
				evenNumbers[evenIndex++] = i;
			} else {
				oddNumbers[oddIndex++] = i;
			}
		}
		
		// Printing odd and even numbers
		for(int i = 0; i < evenIndex ; i++){
			System.out.print(evenNumbers[i] + " " );	
		}
		System.out.println();
		
		for(int i = 0; i < evenIndex ; i++){
			System.out.print(oddNumbers[i] + " " );	
		}
	}
}