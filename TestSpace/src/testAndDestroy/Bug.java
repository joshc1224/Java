package testAndDestroy;

public class Bug {

	private int position=0;
	
	public int getPosition() {
		return position;
	}
	public void up() {
		position+=10;
		if (position>99) {
			position =0;
		}
	}
}
