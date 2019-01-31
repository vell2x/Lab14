package lab14package;

public abstract class Player {
	private String name;
	public abstract Roshambo generateRoshambo();
	
	public Player() {
		
	}
	
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}

}
