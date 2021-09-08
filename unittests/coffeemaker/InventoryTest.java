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
	public void testGetChocolate() {
		assertEquals(inv.getChocolate(), 15);
	}
	
	@Test
	public void testSetChocolate0() {
		inv.setChocolate(0);
		assertEquals(inv.getChocolate(), 0);
	}
	
	@Test
	public void testSetChocolateNeg1() {
		inv.setChocolate(-1);
		assertEquals(inv.getChocolate(), 15);
	}
	
	@Test
	public void testSetChocolate1() {
		inv.setChocolate(1);
		assertEquals(inv.getChocolate(), 1);
	}

}
