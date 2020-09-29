package UnitTester;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PongGame_SampleClassTest {

	PongGame_SampleClass p;
	
	@BeforeEach
	void setUp() throws Exception {
		p = new PongGame_SampleClass();
	}

	@Test
	void testkeyPressedUp() {
		assertEquals(true,p.keyPressedUp("w"));
	}
	
	
	@Test
	void testkeyPressedDown() {
		assertEquals(true,p.keyPressedDown("s"));
	}
	
	@Test
	void testkeyReleasedUp() {
		assertEquals(false,p.keyReleasedUp("w"));
	}
	
	@Test
	void testkeyReleasedDown() {
		assertEquals(false,p.keyReleasedDown("s"));
	}
	
	@Test
	void testSetPaddle_y() {
		assertEquals(33,p.SetPaddle_y(35,"w"));
		//assertEquals(527,p.SetPaddle_y(525,"s"));
	}
	
	@Test
	void testShowMessage() {
		assertEquals("You Lost. Enter your name for the high score list! Restarting soon!",p.ShowMessage(790));
	}
	
	@Test
	void testaddScore() {
		int[] currentScoreBoard = {89,87,67,64,61,52,50,25,20,12};
		int[] newScoreBoard = {89,87,67,64,61,55,52,50,25,20};
		assertArrayEquals(newScoreBoard,p.addScore(currentScoreBoard, 55));
		//assertEquals(newScoreBoard,p.addScore(currentScoreBoard, 55));
	}

	
		
	
}
