package com.example.alertdialog24112020;

public class Order {
    private OrderType orderType;
    private BreakType breakType;
    private SauceType sauceType;
    private VegetableType vegetableType;

    public Order(OrderType orderType, BreakType breakType, SauceType sauceType, VegetableType vegetableType) {
        this.orderType = orderType;
        this.breakType = breakType;
        this.sauceType = sauceType;
        this.vegetableType = vegetableType;
    }

    public Order() {
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public BreakType getBreakType() {
        return breakType;
    }

    public void setBreakType(BreakType breakType) {
        this.breakType = breakType;
    }

    public SauceType getSauceType() {
        return sauceType;
    }

    public void setSauceType(SauceType sauceType) {
        this.sauceType = sauceType;
    }

    public VegetableType getVegetableType() {
        return vegetableType;
    }

    public void setVegetableType(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
    }
}
