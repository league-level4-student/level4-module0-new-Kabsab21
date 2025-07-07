package _04_Snake;

public class Location {
	private int x;
	private int y;
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public  int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	boolean equals(Location loco ) {
		if(this.x == loco.getX() && this.y == loco.getY()) {
			return true;
		}else{
			return false;
			
		}
	}
	
	
}


