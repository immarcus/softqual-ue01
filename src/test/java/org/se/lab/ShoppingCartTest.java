package org.se.lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class ShoppingCartTest {
	private ShoppingCart cart;
	
	@Before
	public void setup() {
		cart = new ShoppingCart(0);
		
		Cd cd = new Cd(1, "Rolling Stones", 12.99);
		Book book = new Book(7, "Refactoring", 57.80, "Martin Fowler");
		Dvd dvd = new Dvd(13, "ACDC Live", 24.90);
		cart.getArticles().add(cd);
		cart.getArticles().add(book);
		cart.getArticles().add(dvd);
	}
	

	@Test
	public void testToString() {
		String s = cart.toString();		
	
		final String EXPECTED = 
				"Cart: 0\n" +
				"CD:	1	Rolling Stones	12.99\n" +
				"BOOK:	7	Refactoring	Martin Fowler	57.8\n" +
				"DVD:	13	ACDC Live	24.9\n";

		Assert.assertEquals(EXPECTED, s);
	}

	@Test
	public void testToXml() {
		String s = cart.toXml();
		
		final String EXPECTED = 
				"<shoppingcard id=\"0\">\n" +
				"	<cd id=\"1\" description=\"Rolling Stones\" price=\"12.99\"/>\n" +
				"	<book id=\"7\" description=\"Refactoring\" price=\"57.8\" author=\"Martin Fowler\"/>\n" +
				"	<dvd id=\"13\" description=\"ACDC Live\" price=\"24.9\"/>\n" +
				"</shoppingcard>";
		
		Assert.assertEquals(EXPECTED, s);
	}
}
