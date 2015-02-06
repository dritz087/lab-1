package lab1;

import java.util.Scanner;


public class GuessingGame {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num = (int)(Math.random()*10 + 1);
		System.out.println("Please guess an integer between 1 and 10");
		int guess = s.nextInt();
		int cont = 1;
		
		while(cont == 1){
		String decide = null;
		if(num == guess){
			System.out.println("Congratulations, you have guessed the number.");
			cont = 0;
		}
		else{
			System.out.println("You have guessed the number incorrectly.  Would you like to guess again?(Y/N)");
			decide = s.next();
		
		String yes = "Y";
		String no = "N";
		if(decide.equalsIgnoreCase(no)){
			cont =0;
		}
		else{
			System.out.println("Please guess an integer between 1 and 10");
			guess = s.nextInt();
		}
		}
		}
	}
}
