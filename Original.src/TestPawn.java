import junit.framework.TestCase;

public class TestPawn  extends TestCase{
  private Pawn pawn;
  ChessGameBoard cgb= new ChessGameBoard();
  
  public void escenario() {
	  pawn= new Pawn(cgb,2,1,1);
  }
  public void testcanMove() {
		escenario();
		assertEquals( false , pawn.canMove(cgb, 3, 1));
	}
  public void testhaslegalmoves() {
		escenario();
		assertEquals(false,pawn.canMove(cgb, 0, 0));
	}
  public void testcol() {
		escenario();
		assertEquals(1,pawn.pieceColumn);
	}
	public void testrow() {
		escenario();
		assertEquals(2,pawn.pieceRow);
	}
	public void testcolor() {
		escenario();
		assertEquals(1,pawn.getColorOfPiece());
	}
	

}
