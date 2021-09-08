package coffeemaker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import coffeemaker.exceptions.InventoryException;
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
	
	@Test
	public void testAddChocolateNaN() {
		try {
			inv.addChocolate("abc");
		} catch (InventoryException e) {
			assertEquals(e.getMessage(), "Units of chocolate must be a positive integer");
			return;
		};
		fail("Should not parse invalid input");
	}
	
	@Test
	public void testAddChocolateNeg1() {
		try {
			inv.addChocolate("-1");
		} catch (InventoryException e) {
			assertEquals(e.getMessage(), "Units of chocolate must be a positive integer");
			return;
		};
		fail("Should not parse invalid input");
	}
	
	@Test
	public void testAddChocolate0() {
		try {
			inv.addChocolate("0");
		} catch (InventoryException e) {
			fail("Should parse int");
		};
		assertEquals(inv.getChocolate(), 15);
	}
	
	@Test
	public void testAddChocolate1() {
		try {
			inv.addChocolate("1");
		} catch (InventoryException e) {
			fail("Should parse int");
		};
		assertEquals(inv.getChocolate(), 16);
	}


}
