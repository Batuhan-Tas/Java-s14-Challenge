package com.workintech.burger.model;

public class DeluxeBurger extends Hamburger{

    private String drink;
    private String cips;



    public DeluxeBurger() {
        super("Deluxe Burger",19.1, "Double Sandwich" );
        this.drink = drink;
        this.cips = cips;
        setMeat("Double");
    }

    @Override
    public void addHamburgerAddition1(String addition, double price) {
        System.out.println("DeluxeBurger için ek malzeme seçimi yapılamaz!");
    }

    @Override
    public void addHamburgerAddition2(String addition, double price) {
        System.out.println("DeluxeBurger için ek malzeme seçimi yapılamaz!");
    }

    @Override
    public void addHamburgerAddition3(String addition, double price) {
        System.out.println("DeluxeBurger için ek malzeme seçimi yapılamaz!");
    }

    @Override
    public void addHamburgerAddition4(String addition, double price) {
        System.out.println("DeluxeBurger için ek malzeme seçimi yapılamaz!");
    }
}
