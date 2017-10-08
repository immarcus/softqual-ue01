package org.se.lab;

public class Cd extends Article {

    public Cd(int id, String description, double price) {
        super(id, description, price);
    }
    @Override
    public String toString(){
        return "CD:\t" + getId() + "\t" + getDescription() + "\t" + getPrice() + "\n";
    }

    @Override
    public String toXml() {
        return "\t<cd id=\"" + getId() + "\" description=\"" + getDescription()
                + "\" price=\"" + getPrice() + "\"/>\n";
    }
}
