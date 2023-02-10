public class Tile {
	private int row;
	private int col;
	private Color color;
	
	public Tile(int row, int col, Color color) {
		super();
		this.row = row;
		this.col = col;
		this.color = color;
	}
	
	private Piece piece;
	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	/** 
	 * draw: Draws the tile depending on the color
	 * 		 If there is a piece on the tile, the piece's draw method is called
	 * Following the contract described in the drawBoard method of the Board class
	 */
	public void draw() {
		if (piece != null) {
			String symbol;
			if (piece.color == Color.RED) {
				symbol = "r";
			}
			else {
				symbol = "b";
			}
			if (piece.king) {
				symbol = symbol.toUpperCase();
			}
			System.out.print(symbol);
			return;
		}
		if (color == Color.RED) {
			System.out.print("X");
		}
		else {
			System.out.print("O");
		}
	}
	
}
