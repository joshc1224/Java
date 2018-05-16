package classes;

public abstract class Mammal {

	private boolean hasMilk=true, hasHair=true, liveYoung=true, biPedal;
	private int weight, posX, posY;
	private int max = 10, min =0;
	private String name;
	
	public Mammal() {
		posX = (int)(Math.random()*(max-min));
		posY = (int)(Math.random()*(max-min));
		name = "noName";
	}
	
	public boolean isHasMilk() {
		return hasMilk;
	}
	
	public boolean insHasHair() {
		return hasHair;
	}
	
	public boolean isLiveYoun() {
		return liveYoung;
	}
	
	public boolean isBiPedal() {
		return biPedal;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight=weight;
	}
	
	public String getPosition() {
		return "("+posX+","+posY+")";
	}
	public void move(int xMove, int yMove) {
		posX+=xMove;
		posY+=yMove;
	}
	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
}
