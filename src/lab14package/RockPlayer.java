package lab14package;

public class RockPlayer extends Player {

	public RockPlayer() {
		super();
	}
	
	public RockPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		return Roshambo.ROCK;
	}

}
