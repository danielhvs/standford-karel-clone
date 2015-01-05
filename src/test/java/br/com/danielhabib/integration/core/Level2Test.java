package br.com.danielhabib.integration.core;

import static org.junit.Assert.assertEquals;

public class Level2Test extends AbstractIntegrationTest {

	private TestObserver rulesObserver;

	@Override
	protected void testIt() throws Exception {
		move();
		grab();
		drop();
		assertEquals(false, rulesObserver.isOver());

		grab();
		move();
		drop();
		move();
		move();
		move();
		assertEquals(false, rulesObserver.isOver());

		left();
		left();
		left();
		move();
		grab();
		move();
		drop();

		assertEquals(true, rulesObserver.isOver());
	}

	@Override
	protected int setTimeoutMillis() {
		return 50;
	}

	@Override
	protected String[] levels() {
		return new String[] { "w:0,0\nr:2,0-3,0\nw:4,0\nr:2,0-3,0\np:1,0" };
	}

	@Override
	protected void setup() {
		rulesObserver = new TestObserver();
		parser.setMoveHandlerObserver(rulesObserver);
	}

}
