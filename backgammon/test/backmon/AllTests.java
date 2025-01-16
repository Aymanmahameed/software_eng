package backmon;
import static org.junit.Assert.*;

import game.RandomPip;

import java.awt.Dimension;

import org.junit.Test;

import constants.GameConstants;

//import game.History;

import game.Question;

import game_engine.Settings;




public class AllTests {
	



	@Test

	public void randomTest() {

		// check if the random numbers is generated 

		RandomPip.runAll();

		assertNotEquals(RandomPip.firstRandomPipQ, "-1");

		assertNotEquals(RandomPip.secondRandomPipQ, "-1");

		assertNotEquals(RandomPip.thRandomPipQ, "-1");

		assertNotEquals(RandomPip.RandomPipS, "-1");

		

	}

	@Test

	public void test2() {

		Settings.setDifficulty("hard");

		String Dif = "hard";

		assertEquals(Dif, Settings.getDifficulty());

	}

	@Test

	public void test3() {

		Dimension d = new Dimension();

		d.setSize(381,589);

		assertEquals(d,GameConstants.getHalfBoardSize());

	}

	

	@Test

	public void test4() {

		Question q = new Question("are you here?", null, 0, null);

		String qu = "are you here?";

		assertEquals(q.getQuestion(), qu);

	}

//	@Test
//
////	public void test5() {
////
////		History h = new History("yosef", null, null);
////
////		assertEquals("yosef", h.getWinnerName());
////
////	}

}