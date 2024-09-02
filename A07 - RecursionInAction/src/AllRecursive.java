import java.util.InputMismatchException;
import java.util.Scanner;

public class AllRecursive {
	
	
	public static void main(String[] args) {
			menu(); //Calls menu method
	}
	
	//Recursive menu
	public static void menu() {
		try {
			//Prints Menu options
			System.out.println("1. power(int,int); // positive"); 
			System.out.println("2. factorial(int); // positive");
			System.out.println("3. summation(int); // positive");
			System.out.println("0. Exit");
			
			//Scanner object for user input 
			Scanner input = new Scanner(System.in);
			int option;
			int num;
			int num1;
			
			//User input for options
			option = input.nextInt(); 
			
			//Process user's choice
			switch(option) {
			case 0:
				//Exit program
				System.out.println("Thank you!"); 
				return; 
			case 1:
				//Calculate power
				System.out.println("Enter a base: "); 
				num = input.nextInt();
				if(num >= 0) { 
					//User input for exponent
					System.out.println("Enter an exponent: "); 
					num1 = input.nextInt(); 
					if (num1<0) { 
						//Exponent cannot be negative
						System.out.println("No negative numbers!"); 
						break;
					}
					else{
						//Print result of power function
						System.out.println(power(num,num1)); 
						break;
					}
				}
				else if(num<0) { 
					//Base cannot be negative
					System.out.println("No negative numbers!");
					break;
				}
			case 2:
				//Calculate factorial
				System.out.println("Enter a factorial");
				num = input.nextInt(); 
				if(num>=0) { 
					//Print result of factorial function
					System.out.println(factorial(num)); 
					break;
				}
				else if(num<0) { 
					//Factorial cannot be negative 
					System.out.println("No negative numbers!");
					break;
				}
			case 3:
				//Calculate summation
				System.out.println("Enter a summation");
				num = input.nextInt();
				if(num>0) { 
					//Prints result of summation function
					System.out.println(summation(num));
					break;
				}
				else if(num<0) {
					//Summation cannot be negative
					System.out.println("No negative numbers!");
					break;
				}
			default:
				//Invalid choice
				System.out.println("Invalid Choice! Please choose another option"); 
		}
			//Recursively calls menu method to display menu again
			menu(); 
		}
		catch(InputMismatchException IME) { //If user doesn't enter a number
			System.out.println("Enter a number!");
			menu();
		}
		catch(Exception e) {
			System.out.println("Enter a valid input."); //If user inputs any other invalid input
			menu();
		}

	}
	
	//Recursive method to calculate power
	public static int power(int base, int exponent) {
		int result;
		if(exponent == 0) { //Anything raised to the power of 0 is 1
			return 1;
		}
		else {
			//Calculates power recursively
			result = base * power(base, exponent-1); //
			return result;
		}
	}
	
	//Recursive method to calculate factorial
	public static int factorial(int n) {
		int result;
		if(n == 1 || n == 0) { //Factorial of 0 and 1 is 1
			return 1;
		}
		else {
			//Calculates factorial recursively
			result = factorial(n -1) *n; 
			return result;
		}
		
	}
	
	//Recursive method to calculate summation 
	public static int summation(int n) {
		int result;
		if(n == 0) {  //Summation of 0 is 0
			return 0;
		}
		else {
			//Calculates summation recursively
			result = n + summation(n-1);
			return result;
		}
	}
}