package com.example.alertdialog24112020;

public interface OrderBuild {
    OrderBuild setOrderType(OrderType orderType);
    OrderBuild setBreakType(BreakType breakType);
    OrderBuild setSauceType(SauceType sauceType);
    OrderBuild setVegetableType(VegetableType vegetableType);
    Order build();
}
