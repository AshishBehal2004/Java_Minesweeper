package Project;

public class Board{

	private int rows= 5;
	private int column = 5;
	private int num = 0;
	
	Cell[][] board;
	
	
	Board() {
		this.rows = rows;
		this.column = column;
		this.board = new Cell[rows][column];
		
		for (int i =0;i<rows;i++) {
			for(int j=0;j<column;j++) {
				board[i][j] = new Cell();
			}
		}
	}
	
	public void printBoard() {
		
		for (int i=0; i<rows;i++) {
			for (int j=0;j<column;j++) {
				 
				 System.out.print(board[i][j] +" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Board gameboard = new Board();
		gameboard.printBoard();
		
		
	}
}
