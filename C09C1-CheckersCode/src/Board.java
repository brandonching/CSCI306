/** 
 * Board: Creates tiles, pieces, and draws the board
 * Author: Caleb Bartel 
 */

import java.util.ArrayList;

public class Board {
	static final int booardDimension = 8;
	static final int NUM_PIECE_ROWS = 3; // num of rows of pieces each player starts with
	private Tile[][] tiles;
	private ArrayList<Piece> boardPiecesArrayList;
	
	/** 
	 * Default Constructor: Initializes tiles and pieces to default orientation
	 */
	public Board() {
		super();
		tiles = new Tile[booardDimension][booardDimension];
		boardPiecesArrayList = new ArrayList<Piece>();
		
		Color curTileColor = Color.RED;
		for (int row = 0; row < booardDimension; row++){
			for (int col = 0; col < booardDimension; col++){
				tiles[row][col] = new Tile(row,col, curTileColor);
				if (curTileColor == Color.BLACK && row < NUM_PIECE_ROWS) {
					Piece piece = new Piece(row, col, Color.RED);
					boardPiecesArrayList.add(piece);
					tiles[row][col].setPiece(piece);
				}
				if (curTileColor == Color.BLACK && row > booardDimension - NUM_PIECE_ROWS - 1) {
					Piece piece = new Piece(row, col, Color.BLACK);
					boardPiecesArrayList.add(piece);
					tiles[row][col].setPiece(piece);
				}
				curTileColor = switchColor(curTileColor);
			}
			curTileColor = switchColor(curTileColor);
		}
	}
	
	private Color switchColor(Color curColor) {
		if (curColor == Color.RED) {
			return Color.BLACK;
		}
		else {
			return Color.RED;
		}
	}

	/** 
	 * drawBoard: loops through the tiles and draws them with added styling
	 * 
	 * Drawing contract: 
	 * Print a single character to standard out
	 */
	private void drawBoard() {
		for (int i = 0; i < booardDimension; i++){
			System.out.println("");
			for (int j = 0; j < booardDimension; j++){
				System.out.print("----");
			}
			System.out.println("");
			for (int j = 0; j < booardDimension; j++){
				System.out.print("| ");
				tiles[i][j].draw();
				System.out.print(" ");
			}	
		}
	}

	/** 
	 * main: test main to draw initial board arrangement
	 */
	public static void main(String[] args) {
		Board board = new Board();
		board.drawBoard();
	}

}
