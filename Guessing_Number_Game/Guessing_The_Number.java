package package1;
import java.util.*;

public class Guessing_The_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		        Scanner sc = new Scanner(System.in);
		        Random rand = new Random();

		        int playAgain;

		        do {
		            int number = rand.nextInt(100) + 1; // 1–100
		            int attempts = 5;
		            int guess;
		            boolean won = false;

		            System.out.println("\n--- Number Guessing Game ---");
		            System.out.println("Guess a number between 1 and 100");
		            System.out.println("You have " + attempts + " attempts");

		            while(attempts > 0){

		                System.out.print("Enter your guess: ");

		                try{
		                    guess = sc.nextInt();

		                    if(guess == number){
		                        System.out.println("Correct! You won!");
		                        System.out.println("Score: " + attempts * 10);
		                        won = true;
		                        break;
		                    }
		                    else if(guess > number){
		                        System.out.println("Too high!");
		                    }
		                    else{
		                        System.out.println("Too low!");
		                    }

		                    attempts--;

		                    if(attempts > 0){
		                        System.out.println("Attempts left: " + attempts);
		                    }

		                }catch(Exception e){
		                    System.out.println("Invalid input!");
		                    sc.nextLine();
		                }
		            }

		            if(!won){
		                System.out.println("You lost! The number was: " + number);
		            }

		            System.out.print("Play again? (1-Yes / 0-No): ");
		            playAgain = sc.nextInt();

		        } while(playAgain == 1);

		        System.out.println("Game ended.");
		        sc.close();
		    }
		

	}


