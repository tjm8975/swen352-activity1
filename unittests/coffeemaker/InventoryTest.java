package coffeemaker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

public class InventoryTest extends TestCase {
	private Inventory inv;
	private Recipe rec;

	@Before
	public void setUp() throws Exception {
		inv = new Inventory();
		rec = new Recipe();
		super.setUp();
	}

	@After
	public void tearDown() throws Exception {
		inv = null;
		rec = null;
		super.tearDown();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
