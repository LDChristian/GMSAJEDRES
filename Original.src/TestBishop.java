import junit.framework.TestCase;

public class TestBishop  extends TestCase{
	private Bishop bishop;
	  ChessGameBoard cgb= new ChessGameBoard();
	 
		public void escenario() {
			bishop =new Bishop(cgb,3,3,1);
		}
		
		public void testcanMove() {
			escenario();
			assertEquals( false , bishop.canMove(cgb, 0, 2));
		}
		public void testmove() {
			escenario();
			assertEquals(false,bishop.move(cgb, 3, 3));
		}
		public void testcol() {
			escenario();
			assertEquals(3,bishop.pieceColumn);
		}
		public void testrow() {
			escenario();
			assertEquals(3,bishop.pieceRow);
		}
		public void testcolor() {
			escenario();
			assertEquals(1,bishop.getColorOfPiece());
		}
	
		
		

		

}
