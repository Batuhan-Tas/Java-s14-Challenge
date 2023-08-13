package com.workintech.burger.model;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name, healthyExtra2Name;
    private double healthyExtra1Price, healthyExtra2Price;



    public HealthyBurger(String name, double price, String breadRollType ) {
        super(name, price, breadRollType);
        setMeat("Tofu");

    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    public double itemizeHamburger(){

        double finalPrice = getPrice() + healthyExtra1Price + healthyExtra2Price + getAddition1Price() + getAddition2Price() + getAddition3Price() + getAddition4Price();
        StringBuilder builder = new StringBuilder();
        builder.append("Name: " + getName() + "\n");
        builder.append("Meat: " + getMeat() + "\n");
        builder.append("BreadRollType: " +getBreadRollType() + "\n");
        if(healthyExtra1Name != null){builder.append("Healthy Addition 1 : " + healthyExtra1Name + "\n");}
        if(healthyExtra2Name != null){builder.append("Healthy Addition 2 : " + healthyExtra2Name + "\n");}
        builder.append("Price: " + finalPrice);
        System.out.println(builder.toString());

        return finalPrice;


    }
}
