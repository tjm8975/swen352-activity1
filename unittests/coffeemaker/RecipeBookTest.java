package coffeemaker;

import static org.junit.Assert.*;

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
			assertEquals(rb.addRecipe(recipe), true);
	}
}
