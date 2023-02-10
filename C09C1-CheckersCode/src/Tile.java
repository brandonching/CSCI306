public class Tile {
	private int row;
	private int column;
	private Color color;
	private Piece piece;
	
	
	/**
	 * Creates a Tile of color at row, column
	 * @param row
	 * @param column
	 * @param color
	 */
	public Tile(int row, int column, Color color) {
		super();
		this.row = row;
		this.column = column;
		this.color = color;
	}
	
	/**
	 * Sets the piece currently on tile
	 * @param piece
	 */
	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	/** 
	 * draw: Draws the tile depending on the color
	 * 		 If there is a piece on the tile, the piece's draw method is called
	 * Following the contract described in the drawBoard method of the Board class
	 */
	public void draw() {
		// If a piece is currently on tile, call piece to draw respective symbol
		// 		otherwise print tile color symbol
		if (piece != null) {
			piece.draw();
		} else if (color == Color.RED) {
			System.out.print("X");
		}
		else {
			System.out.print("O");
		}
	}
	
}
