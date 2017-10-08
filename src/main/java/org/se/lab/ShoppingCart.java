package org.se.lab;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private int id;
	private List<Article> articles = new ArrayList<>();

	public ShoppingCart(int id) {
		setId(id);
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public List<Article> getArticles() {
		return articles;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder("Cart: " + getId() + "\n");
		for (Article article: articles) {
			s.append(article.toString());
		}
		return s.toString();
	}
	

	public String toXml() {
		StringBuilder xml = new StringBuilder("<shoppingcard id=\"" + getId() + "\">\n");
		for (Article article: articles) {
			xml.append(article.toXml());
		}
		xml.append("</shoppingcard>");
		return xml.toString();
	}
}
