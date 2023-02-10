/** 
 * Color: Enum used for Tiles and Pieces
 * Author: Caleb Bartel 
 */

public enum Color {
	RED('r'), BLACK('b');
	private char symbol;
	
	
	Color(char symbol) {
		this.symbol = symbol;
	}


	@Override
	public String toString() {
		return String.valueOf(symbol);
	}
}
