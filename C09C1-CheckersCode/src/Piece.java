/** 
 * Piece: Stores piece information 
 * Author: Caleb Bartel 
 */

public class Piece {
	private int row;
	private int column;
	public Color color;
	public boolean king = false;
	
	/**
	 * Prints out the symbol for the piece, if a king symbols are upper case
	 */
	public void draw() {
		// get the symbol corresponding to piece color
		String symbol = color.toString();
		
		// if a king, make upper case
		if (king) {
			symbol = symbol.toUpperCase();
		}
		
		System.out.print(symbol);
	}
	
	/**
	 * Constructor for piece based on color, row, and column
	 * @param row
	 * @param column
	 * @param color
	 */
	public Piece(int row, int column, Color color) {
		super();
		this.row = row;
		this.column = column;
		this.color = color;
	}
}
