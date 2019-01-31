package lab14package;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		String choice;
		String name;
		String cont = "";
		Roshambo compare = null;
		
		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.print("Enter your name: ");
		name = scnr.nextLine();
		
		Player human = new ConsolePlayer(scnr, name);
		Player opponent = new RandomPlayer("Lucky");
		Player rocky = new RockPlayer("Dywane");
		Roshambo opponentChoice;
		
		do {
			System.out.print("Would you like to play against Lucky or Dywane Johnson? (l/d): ");
			choice = scnr.nextLine();
			
			switch(choice.charAt(0)) {
			case 'l':
			case 'L':  opponentChoice = opponent.generateRoshambo();
			break;
			case 'd':
			case 'D':  opponentChoice = rocky.generateRoshambo();
			break;
			default: System.out.println("Invalid entry! Please try again.");
			continue;
			}
			Roshambo humanChoice = human.generateRoshambo();
			
			System.out.println(human.getName() + " played: " + humanChoice);
			System.out.println(opponent.getName() + " played: " + opponentChoice);
			
			if(humanChoice.equals(opponentChoice)) {
				System.out.println("The Game was a Draw!");
			}
			else if(humanChoice.equals(compare.ROCK) && opponentChoice.equals(compare.SCISSORS)) {
				System.out.println("Congradulations you win");
			}
			else if(humanChoice.equals(compare.PAPER) && opponentChoice.equals(compare.ROCK)) {
				System.out.println("Congradulations you win");
			}
			else if(humanChoice.equals(compare.SCISSORS) && opponentChoice.equals(compare.PAPER)) {
				System.out.println("Congradulations you win");
			}
			else {
				System.out.println("Sorry you lost.");
			}
			
			System.out.print("Play again? (y/n): ");
			cont = scnr.nextLine();
		} while(!cont.equalsIgnoreCase("n"));
		System.out.println("Goodbye!");
	}
}
