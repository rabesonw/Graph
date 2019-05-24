package maze;

import implementation.*;

public class Maze extends MyGraph {
	int height;
	int width;
	Cell cells[][];
	
	/**
	 * creates a maze of width width and height height
	 * with cells of empty type
	 * 
	 * @param int width, int height
	 * */
	public Maze(int width, int height) {
		this.height = height;
		this.width = width;
		this.cells = new Cell[width][height];
		for(int i = 0; i<this.width; i++) {
			for(int j = 0; j<this.height; j++) {
				this.cells[i][j] = new Cell(i, j, "");
				this.cells[i][j].setType("E");
			}
		}
	}
	
	public void setStart(int x, int y) {
		this.cells[x][y].setType("D");
	}
	
	public void setExit(int x, int y) {
		this.cells[x][y].setType("A");
	}
	
	public void setWall(int x, int y) {
		this.cells[x][y].setType("W");
	}
	
	public void setEmpty(int x, int y) {
		this.cells[x][y].setType("E");
	}
	
	public String toString() {
		String s = new String();
		for(int i = 0; i<this.width; i++) {
			for(int j = 0; j<this.height; j++) {
				s+=this.cells[i][j].getType();
			}
			s+="\n";
		}
		return s;
	}
}
