public class moveinfo {
    public final int fromRow;
    public final int fromCol;
    public final int toRow;
    public final int toCol;
    public final ChessGamePiece piece;

    public moveinfo(int fromRow, int fromCol, int toRow, int toCol, ChessGamePiece piece) {
        this.fromRow = fromRow;
        this.fromCol = fromCol;
        this.toRow = toRow;
        this.toCol = toCol;
        this.piece = piece;
    }
}
