package maze;

import graph.*;

public class Cell extends Vertex {
	int x;
	int y;
	
	public Cell(int x, int y, String type) {
		super(type);
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getType() {
		return (String) super.getContent();
	}

	public void setType(String type) {
		super.setContent(type);;
	}
	
	
}
