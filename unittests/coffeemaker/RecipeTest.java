package coffeemaker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import coffeemaker.exceptions.RecipeException;

public class RecipeTest {
	
	private Recipe recipe;

	@Before
	public void setUp() throws Exception {
		recipe = new Recipe(); 
	}

	@After
	public void tearDown() throws Exception {
		recipe = null;
	}
	
	@Test 
	public void testGetAmtChocolate() {
		assertEquals(recipe.getAmtChocolate(), 0);
	}
	
	@Test 
	public void testSetChocalate0() {
		try {
			recipe.setAmtChocolate("0");
		} catch (RecipeException e) {
			fail("Should accept valid int");
		}
		assertEquals(recipe.getAmtChocolate(), 0);	
	}
	
	@Test 
	public void testSetChocalate5() {
		try {
			recipe.setAmtChocolate("5");
		} catch (RecipeException e) {
			fail("Should accept valid int");
		}
		assertEquals(recipe.getAmtChocolate(), 5);	
	}
	
	@Test 
	public void testSetChocalateNeg() {
		try {
			recipe.setAmtChocolate("-1");
		} catch (RecipeException e) {
			assertEquals(e.getMessage(), "Units of chocolate must be a positive integer");
			return;
		}
		fail("Should not parse invalid int");
	}
	
	@Test
	public void testSetChocolateNonInt() {
		try {
			recipe.setAmtChocolate("String");
		} catch (RecipeException e) {
			assertEquals(e.getMessage(), "Units of chocolate must be a positive integer");
			return;
		}
		fail("Should not parse invalid int");
	}

	
	@Test 
	public void testGetAmtCoffee() {
		assertEquals(recipe.getAmtCoffee(), 0);
	}
	
	@Test
	public void testSetAmtCoffee0() {
		try {
			recipe.setAmtCoffee("0");
		} catch (RecipeException e) {
			fail("Should accept valid int");
		}
		assertEquals(recipe.getAmtCoffee(), 0);
	}
	
	@Test
	public void testSetAmtCoffee5() {
		try {
			recipe.setAmtCoffee("5");
		} catch (RecipeException e) {
			fail("Should accept valid int");
		}
		assertEquals(recipe.getAmtCoffee(), 5);
	}
	
	@Test 
	public void testSetCoffeeNeg() {
		try {
			recipe.setAmtCoffee("-1");
		} catch (RecipeException e) {
			assertEquals(e.getMessage(), "Units of coffee must be a positive integer");
			return;
		}
		fail("Should not parse invalid int");
	}
	
	@Test
	public void testSetCoffeeNonInt() {
		try {
			recipe.setAmtCoffee("String");
		} catch (RecipeException e) {
			assertEquals(e.getMessage(), "Units of coffee must be a positive integer");
			return;
		}
		fail("Should not parse invalid int");
	}
	
	@Test 
	public void testGetAmtMilk() {
		assertEquals(recipe.getAmtMilk(), 0);
	}
	
	@Test
	public void testSetAmtMilk0() {
		try {
			recipe.setAmtMilk("0");
		} catch (RecipeException e) {
			fail("Should accept valid int");
		}
		assertEquals(recipe.getAmtMilk(), 0);
	}
	
	@Test
	public void testSetAmtMilk5() {
		try {
			recipe.setAmtMilk("5");
		} catch (RecipeException e) {
			fail("Should accept valid int");
		}
		assertEquals(recipe.getAmtMilk(), 5);
	}
	
	@Test 
	public void testSetMilkNeg() {
		try {
			recipe.setAmtMilk("-1");
		} catch (RecipeException e) {
			assertEquals(e.getMessage(), "Units of milk must be a positive integer");
			return;
		}
		fail("Should not parse invalid int");
	}
	
	@Test
	public void testSetMilkNonInt() {
		try {
			recipe.setAmtMilk("String");
		} catch (RecipeException e) {
			assertEquals(e.getMessage(), "Units of milk must be a positive integer");
			return;
		}
		fail("Should not parse invalid int");
	}
	
	@Test 
	public void testGetAmtSugar() {
		assertEquals(recipe.getAmtSugar(), 0);
	}
	
	@Test
	public void testSetAmtSugar0() {
		try {
			recipe.setAmtSugar("0");
		} catch (RecipeException e) {
			fail("Should accept valid int");
		}
		assertEquals(recipe.getAmtSugar(), 0);
	}
	
	@Test
	public void testSetAmtSugar5() {
		try {
			recipe.setAmtSugar("5");
		} catch (RecipeException e) {
			fail("Should accept valid int");
		}
		assertEquals(recipe.getAmtSugar(), 5);
	}
	
	@Test 
	public void testSetSugarNeg() {
		try {
			recipe.setAmtSugar("-1");
		} catch (RecipeException e) {
			assertEquals(e.getMessage(), "Units of sugar must be a positive integer");
			return;
		}
		fail("Should not parse invalid int");
	}
	
	@Test
	public void testSetSugarNonInt() {
		try {
			recipe.setAmtSugar("String");
		} catch (RecipeException e) {
			assertEquals(e.getMessage(), "Units of sugar must be a positive integer");
			return;
		}
		fail("Should not parse invalid int");
	}
	
	@Test
	public void testGetName() {
		assertEquals(recipe.getName(), "");
	} 
	
	@Test
	public void testSetName() {
		recipe.setName("name");
		assertEquals(recipe.getName(), "name");
	}
	
	@Test
	public void testSetNameNull() {
		recipe.setName("name");
		recipe.setName(null);
		assertEquals(recipe.getName(), "name");
	}
	
	@Test
	public void testgetPrice() {
		assertEquals(recipe.getPrice(), 0);
	}
	
	@Test
	public void testSetPrice0() {
		try {
			recipe.setPrice("0");
		} catch (RecipeException e) {
			fail("Should accept valid int");
		}
		assertEquals(recipe.getPrice(), 0);
	}
	
	@Test
	public void testSetPrice5() {
		try {
			recipe.setPrice("5");
		} catch (RecipeException e) {
			fail("Should accept valid int");
		}
		assertEquals(recipe.getPrice(), 5);
	}
	
	@Test 
	public void testSetPriceNeg() {
		try {
			recipe.setPrice("-1");
		} catch (RecipeException e) {
			assertEquals(e.getMessage(), "Price must be a positive integer");
			return;
		}
		fail("Should not parse invalid int");
	}
	
	@Test
	public void testSetPriceNonInt() {
		try {
			recipe.setPrice("String");
		} catch (RecipeException e) {
			assertEquals(e.getMessage(), "Price must be a positive integer");
			return;
		}
		fail("Should not parse invalid int");
	}
	
	@Test
	public void testToString() {
		assertEquals(recipe.toString(), "");
	}
	
	
}
