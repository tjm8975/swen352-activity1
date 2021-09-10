package coffeemaker;

import static org.junit.Assert.*;

import coffeemaker.exceptions.RecipeException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

public class RecipeBookTest extends TestCase {
	private RecipeBook rb;
	private Recipe recipe;

	@Before
	public void setUp() throws Exception {
		rb = new RecipeBook();
		recipe = new Recipe();
		super.setUp();
	}

	@After
	public void tearDown() throws Exception {
		rb = null;
		recipe = null;
		super.tearDown();
	}

	@Test
	public void testGetRecipe() {
		assertEquals(rb.getRecipes().length, 4);
	}
	
	@Test
	public void testAddRecipeReturn() {
			assertTrue(rb.addRecipe(recipe));
	}
	
	@Test
	public void testAddTwoSameRecipesReturn() {
		rb.addRecipe(recipe);
		assertFalse(rb.addRecipe(recipe));
	}
	
	@Test
	public void testAddRecipe() {
		rb.addRecipe(recipe);
		assertEquals(rb.getRecipes()[0], recipe);
	}
	
	@Test
	public void testAddToFullRecipeList() {
		boolean added = true;
		try {
			Recipe rec1 = new Recipe();
			Recipe rec2 = new Recipe();
			Recipe rec3 = new Recipe();
			Recipe rec4 = new Recipe();
			
			rec1.setAmtChocolate("1");
			rec2.setAmtChocolate("2");
			rec3.setAmtChocolate("3");
			rec4.setAmtChocolate("4");
			
			System.out.println("Recipe choc:" + recipe.getAmtChocolate());
			System.out.println("Recipe 1 choc:" + rec1.getAmtChocolate());
			System.out.println("Recipe 2 choc:" + rec2.getAmtChocolate());
			System.out.println("Recipe 3 choc:" + rec3.getAmtChocolate());
			System.out.println("Recipe 4 choc:" + rec4.getAmtChocolate());
			
			rb.addRecipe(recipe);
			rb.addRecipe(rec1);
			rb.addRecipe(rec2);
			rb.addRecipe(rec3);
			added = rb.addRecipe(rec4);
		}catch(RecipeException ex) {
			fail("Units of chocolate must be a positive integer");
		}
		assertFalse(added);
	}
}
