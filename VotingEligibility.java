import java.util.Scanner;

class VotingEligibility{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		// Take 10 ages of students
		int[] studentAges = new int[10];
		
		// Take user input
		for(int i = 0; i < studentAges.length ; i++){
			System.out.println("Enter age of student " + (i+1) + ":" );
			studentAges[i] = sc.nextInt();
		}
		
		// Check eligibiity
		for(int i = 0; i < studentAges.length; i++){
			if(studentAges[i] < 0 ){
				System.err.print("Invalid age entered");	
			}
			if(studentAges[i] >= 18){
				System.out.println("The student with age " + studentAges[i] + "can vote.");
			}
			else{
				System.out.println("The student with age " + studentAges[i] + "cannot vote.");
			}
		}
	}

}