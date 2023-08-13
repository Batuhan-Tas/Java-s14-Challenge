package com.workintech.burger.model;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, double price, String breadRollType) {
        this.name = name;
        this.price = price;
        this.breadRollType = breadRollType;
        setMeat("Normal");
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addHamburgerAddition1(String addition, double addition1Price){
        this.addition1Name = addition;
        this.addition1Price = addition1Price;
    }

    public void addHamburgerAddition2(String addition, double addition2Price){
        this.addition2Name = addition;
        this.addition2Price = addition2Price;
    }

    public void addHamburgerAddition3(String addition, double addition3Price){
        this.addition3Name = addition;
        this.addition3Price = addition3Price;
    }

    public void addHamburgerAddition4(String addition, double addition4Price){
        this.addition4Name = addition;
        this.addition4Price = addition4Price;
    }
    public double itemizeHamburger(){
        double finalPrice = price+addition1Price+addition2Price+addition3Price+addition4Price;
        StringBuilder builder = new StringBuilder();
        builder.append("Name: " + name + "\n");
        builder.append("Meat: " + meat + "\n");
        builder.append("Bread Roll Type: " + breadRollType + "\n");
        if(addition1Name != null){builder.append("Addition1: " + addition1Name + "\n");}
        if(addition2Name != null){builder.append("Addition2: " + addition2Name + "\n");}
        if(addition3Name != null){builder.append("Addition3: " + addition3Name + "\n");}
        if(addition4Name != null){builder.append("Addition4: " + addition4Name + "\n");}
        builder.append("Price: " + finalPrice);
        System.out.println(builder.toString());
        return finalPrice;





    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public double getAddition4Price() {
        return addition4Price;
    }
}
