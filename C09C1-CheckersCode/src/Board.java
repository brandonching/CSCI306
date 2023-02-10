/** 
 * Board: Creates tiles, pieces, and draws the board
 * Author: Caleb Bartel 
 * @author brandonching
 */

import java.util.ArrayList;

public class Board {
	static final int BOARD_DIMENSION = 8; // side length of square board
	static final int STARTING_ROWS = 3; // number of rows of pieces each player starts with
	private Tile[][] tiles;
	private ArrayList<Piece> boardPiecesArrayList;

	/** 
	 * Default Constructor: Initializes tiles and pieces to default orientation
	 */
	@SuppressWarnings("unused")
	public Board() {
		super();

		// Create an empty board of size BOARD_DIMENSION x BOARD_DIMENSION
		tiles = new Tile[BOARD_DIMENSION][BOARD_DIMENSION];
		// Create an empty array to contain all game pieces
		boardPiecesArrayList = new ArrayList<Piece>();

		// Fill in the Board
		Color currentTileColor = Color.RED;
		for (int row = 0; row < BOARD_DIMENSION; row++){
			for (int column = 0; column < BOARD_DIMENSION; column++){

				// Create a new tile of the current color
				tiles[row][column] = new Tile(row, column, currentTileColor);

				// all pieces start on black spaces, check if within starting rows for red pieces
				if (currentTileColor == Color.BLACK && row < STARTING_ROWS) {
					Piece piece = new Piece(row, column, Color.RED);
					boardPiecesArrayList.add(piece);
					tiles[row][column].setPiece(piece);
				}

				// if a black tile and within the last black starting rows, create a black piece
				if (currentTileColor == Color.BLACK && row > BOARD_DIMENSION - STARTING_ROWS - 1) {
					Piece piece = new Piece(row, column, Color.BLACK);
					boardPiecesArrayList.add(piece);
					tiles[row][column].setPiece(piece);
				}
				currentTileColor = switchColor(currentTileColor);
			}
			
			// if board dimension is even, swap color to make tile colors on diagonal grid
			if(BOARD_DIMENSION % 2 == 0) {
				currentTileColor = switchColor(currentTileColor);
			}

		}
	}

	/**
	 * Get the opposite color
	 * @param currentColor to be swapped
	 * @return opposite color from current
	 */
	private Color switchColor(Color currentColor) {
		if (currentColor == Color.RED) {
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
		for (int row = 0; row < BOARD_DIMENSION; row++){
			// print the row divider
			for (int column = 0; column < BOARD_DIMENSION; column++){
				System.out.print("----");
			}
			System.out.println("-");

			// print the column divider and tile/piece symbol
			for (int column = 0; column < BOARD_DIMENSION; column++){
				System.out.print("| ");
				tiles[row][column].draw();
				System.out.
				print(" ");
			}	
			System.out.println("|");
		}
		// print the last row divider
		for (int column = 0; column < BOARD_DIMENSION; column++){
			System.out.print("----");
		}
		System.out.println("-");

	}

	/** 
	 * main: test main to draw initial board arrangement
	 */
	public static void main(String[] args) {
		Board board = new Board();
		board.drawBoard();
	}

}
