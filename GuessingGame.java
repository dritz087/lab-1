import java.util.Scanner;


public class GuessingGame {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		int num = (int)(Math.random()*10 + 1);
		
		System.out.println("Please guess an integer between 1 and 10");
		int guess = s.nextInt();
		
		if(num == guess){
			System.out.println("Congratulations, you have guess the number.");
		}
		else
			System.out.println("You have guessed the number incorrectly");
	
	
	}
}
