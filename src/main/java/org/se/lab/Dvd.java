package org.se.lab;

public class Dvd extends Article {

    public Dvd(int id, String description, double price) {
        super(id, description, price);
    }
    @Override
    public String toString(){
        return "DVD:\t" + getId() + "\t" + getDescription() + "\t" + getPrice() + "\n";
    }

    @Override
    public String toXml() {
        return "\t<dvd id=\"" + getId() + "\" description=\"" + getDescription()
                + "\" price=\"" + getPrice() + "\"/>\n";
    }
}
