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
	
	/**
	 * Tests for chocolate methods
	 */

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
	
	/**
	 * Tests for coffee methods
	 */

	@Test
	public void testGetCoffee() {
		assertEquals(inv.getCoffee(), 15);
	}
	
	@Test
	public void testSetCoffee0() {
		inv.setCoffee(0);
		assertEquals(inv.getCoffee(), 0);
	}
	
	@Test
	public void testSetCoffeeNeg1() {
		inv.setCoffee(-1);
		assertEquals(inv.getCoffee(), 15);
	}
	
	@Test
	public void testSetCoffee1() {
		inv.setCoffee(1);
		assertEquals(inv.getCoffee(), 1);
	}
	
	@Test
	public void testAddCoffeeNaN() {
		try {
			inv.addCoffee("abc");
		} catch (InventoryException e) {
			assertEquals(e.getMessage(), "Units of coffee must be a positive integer");
			return;
		};
		fail("Should not parse invalid input");
	}
	
	@Test
	public void testAddCoffeeNeg1() {
		try {
			inv.addCoffee("-1");
		} catch (InventoryException e) {
			assertEquals(e.getMessage(), "Units of coffee must be a positive integer");
			return;
		};
		fail("Should not parse invalid input");
	}
	
	@Test
	public void testAddCoffee0() {
		try {
			inv.addCoffee("0");
		} catch (InventoryException e) {
			fail("Should parse int");
		};
		assertEquals(inv.getCoffee(), 15);
	}
	
	@Test
	public void testAddCoffee1() {
		try {
			inv.addCoffee("1");
		} catch (InventoryException e) {
			fail("Should parse int");
		};
		assertEquals(inv.getCoffee(), 16);
	}
	
	/**
	 * Tests milk methods
	 */
	
	@Test
	public void testGetMilk() {
		assertEquals(inv.getMilk(), 15);
	}
	
	@Test
	public void testSetMilk0() {
		inv.setMilk(0);
		assertEquals(inv.getMilk(), 0);
	}
	
	@Test
	public void testSetMilkNeg1() {
		inv.setMilk(-1);
		assertEquals(inv.getMilk(), 15);
	}
	
	@Test
	public void testSetMilk1() {
		inv.setMilk(1);
		assertEquals(inv.getMilk(), 1);
	}
	
	@Test
	public void testAddMilkNaN() {
		try {
			inv.addMilk("abc");
		} catch (InventoryException e) {
			assertEquals(e.getMessage(), "Units of milk must be a positive integer");
			return;
		};
		fail("Should not parse invalid input");
	}
	
	@Test
	public void testAddMilkNeg1() {
		try {
			inv.addMilk("-1");
		} catch (InventoryException e) {
			assertEquals(e.getMessage(), "Units of milk must be a positive integer");
			return;
		};
		fail("Should not parse invalid input");
	}
	
	@Test
	public void testAddMilk0() {
		try {
			inv.addMilk("0");
		} catch (InventoryException e) {
			fail("Should parse int");
		};
		assertEquals(inv.getMilk(), 15);
	}
	
	@Test
	public void testAddMilk1() {
		try {
			inv.addMilk("1");
		} catch (InventoryException e) {
			fail("Should parse int");
		};
		assertEquals(inv.getMilk(), 16);
	}
}
