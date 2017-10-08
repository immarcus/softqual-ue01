package org.se.lab;

public class Book extends Article {

    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(int id, String description, double price, String author) {
        super(id, description, price);
        setAuthor(author);
    }
    @Override
    public String toString(){
        return "BOOK:\t" + getId() + "\t" + getDescription() + "\t" + getAuthor() + "\t" + getPrice() + "\n";
    }

    @Override
    public String toXml() {
        return "\t<book id=\"" + getId() + "\" description=\"" + getDescription()
                + "\" price=\"" + getPrice()
                + "\" author=\"" + getAuthor() + "\"/>\n";
    }
}
