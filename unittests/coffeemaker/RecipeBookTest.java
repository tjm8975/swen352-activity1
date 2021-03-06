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
	public void testAddDifferentRecipes() {
			Recipe rec1 = new Recipe();
			rec1.setName("Chicken");
			rb.addRecipe(recipe);
			assertTrue(rb.addRecipe(rec1));
	}
	
	@Test
	public void testAddToFullRecipeBook() {
		Recipe rec1 = new Recipe();
		Recipe rec2 = new Recipe();
		Recipe rec3 = new Recipe();
		Recipe rec4 = new Recipe();
		
		rec1.setName("Chicken");
		rec2.setName("Pork");
		rec3.setName("Burgers");
		rec4.setName("Hot Dogs");
		
		rb.addRecipe(recipe);
		rb.addRecipe(rec1);
		rb.addRecipe(rec2);
		rb.addRecipe(rec3);
		boolean added = rb.addRecipe(rec4);
		
		assertFalse(added);
	}
	
	@Test
	public void testDeleteEmptyRecipeList() {
		assertEquals(rb.deleteRecipe(0), null);
	}
	
	@Test
	public void testDeleteRecipe() {
		recipe.setName("Chicken");
		rb.addRecipe(recipe);
		assertEquals(rb.deleteRecipe(0), "Chicken");
	}
	
	@Test
	public void testRecipeDeleted() {
		recipe.setName("Chicken");
		rb.addRecipe(recipe);
		rb.deleteRecipe(0);
		assertEquals(rb.getRecipes()[0], null);
	}
	
	@Test
	public void testEditEmptyRecipeBook() {
		assertEquals(rb.editRecipe(0, recipe), null);
	}
	
	@Test
	public void testEditRecipe() {
		Recipe rec1 = new Recipe();
		rec1.setName("Beef");
		recipe.setName("Chicken");
		rb.addRecipe(recipe);
		assertEquals(rb.editRecipe(0, rec1), "Chicken");
	}
	
	@Test
	public void testNewRecipeAdded() {
		Recipe rec1 = new Recipe();
		rec1.setName("Beef");
		String name = rec1.getName();
		recipe.setName("Chicken");
		rb.addRecipe(recipe);
		rb.editRecipe(0, rec1);
		assertEquals(rb.getRecipes()[0].getName(), name);
	}
	
	@Test
	public void testDeletedIsNull() {
		recipe.setName("Chicken");
		rb.addRecipe(recipe);
		rb.deleteRecipe(0);
		assertEquals(rb.getRecipes()[0], null);
	}
}
