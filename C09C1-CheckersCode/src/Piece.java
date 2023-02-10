/** 
 * Piece: Stores piece information 
 * Author: Caleb Bartel 
 */

public class Piece {
	private int row;
	private int col;
	public Color color;
	public boolean king = false;
	
	public void draw() {
		String symbol;
		if (color == Color.RED) {
			symbol = "r";
		}
		else {
			symbol = "b";
		}
		if (king) {
			symbol = symbol.toUpperCase();
		}
		System.out.print(symbol);
	}
	
	public Piece(int row, int col, Color color) {
		super();
		this.row = row;
		this.col = col;
		this.color = color;
	}
}
