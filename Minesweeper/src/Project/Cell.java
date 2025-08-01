package Project;

public class Cell {
	boolean mine;
	boolean isRevealed;
	int adjacent_mines;	
	Cell() {
		this.mine = false;
		this.isRevealed = false;
		this.adjacent_mines = 0;
	}
	
	public void plant() {
		
	}
	
	public String toString() {
		return ".";
	}
	
}
