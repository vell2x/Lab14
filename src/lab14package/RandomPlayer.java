package lab14package;

import java.util.Random;

public class RandomPlayer extends Player {
	Random rand = new Random();
	
	public RandomPlayer() {
		super();
	}

	public RandomPlayer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Roshambo generateRoshambo() {
		int choice = rand.nextInt(3);
		
		if(choice == 0) {
			return Roshambo.ROCK;
		} else if (choice == 1) {
			return Roshambo.PAPER;
		} else if (choice == 2) {
			return Roshambo.SCISSORS;
		}
		else {
			System.out.println("That was invalid input. Try again.");
			return generateRoshambo();
		}
	}

}
