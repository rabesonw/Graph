package maze;

public class Game {
	
	public static void main(String[] args) {
		Maze m = new Maze(3, 3);
		m.setStart(0, 0);
		m.setExit(2, 2);
		m.setWall(1, 1);
		
		System.out.println(m.toString());
		/*
		 * prints out :
		 * DEE
		 * EWE
		 * EEA 
		 */
	}
}
