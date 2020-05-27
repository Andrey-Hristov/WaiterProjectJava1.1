package com.company;

public interface IPurchase {

    void makeAPurchase(Table tableOfPurchase);
    void checkIfTheChosenTableIsFree(Table tableOfPurchase) throws IllegalArgumentException;
    void addADishToThePurchase(Dishes DishToAdd);
    void removeDishFromThePurchase(Dishes dishToRemove);
    double calcTheTotalAndCurrentPriceOfThePurchase();
    void changePurchaseStatusToPayedAndFinishIt(Table tableOfPurchase);
    void changePurchaseStatusToServed();
    void printPurchaseInfo();
}
