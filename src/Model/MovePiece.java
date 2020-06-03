package Model;

import Model.Piece.Piece;

/**
 * responsible for moving a piece and checking the validity of moving a piece to a given square
 * @author mohammed
 *
 */
public class MovePiece {
	
	private Square targetSquare;
	private Square srcSquare;
	private MoveValidity moveValidity;
	private Piece piece;
	private Player player;

	public MovePiece(Square srcSquare, Square targetSquare) {
		super();
		this.piece = srcSquare.getPiece();
		this.srcSquare = srcSquare;
		this.targetSquare = targetSquare;
	}

	public boolean validateMove() {
		this.moveValidity = new MoveValidity(this.piece);
		return this.moveValidity.isValidMove(targetSquare);
	}
	
	public boolean move() {
		if(this.validateMove()) {
//			this.piece.move(targetSquare);
			this.srcSquare.setPiece(null);
			this.targetSquare.setPiece(this.piece);
			return true;
		}
		return false;
	}
	/**
	 * @return
	 */
	public Square getTargetSquare() {
		return targetSquare;
	}
	

	/**
	 * @param targetSquare
	 */
	public void setTargetSquare(Square targetSquare) {
		this.targetSquare = targetSquare;
	}

	/**
	 * @return
	 */
	public Piece getPiece() {
		return piece;
	}

	/**
	 * @return
	 */
	public Player getPlayer() {
		return player;
	}

}
