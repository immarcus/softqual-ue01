package org.se.lab;

abstract class Article {

	private int id;
	private String description;
	private double price;

	public Article(int id, String description, double price) {
		setId(id);
		setDescription(description);
		setPrice(price);
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public abstract String toString();

	public abstract String toXml();

}
