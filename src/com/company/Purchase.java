package com.company;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Purchase implements IPurchase {

    private String status = "no status";
    private double totalPrice = calcTheTotalAndCurrentPriceOfThePurchase();
    private LocalDateTime currentTime = LocalDateTime.now();

    List<Dishes> purchasedDishes = new ArrayList<Dishes>();

    public String getStatus() {
        return status;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public void makeAPurchase(Table tableOfPurchase) {
        checkIfTheChosenTableIsFree(tableOfPurchase);
        tableOfPurchase.setFree(false);


    }

    @Override
    public void checkIfTheChosenTableIsFree(Table tableOfPurchase) throws IllegalArgumentException {
        if (!tableOfPurchase.isFree()) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void addADishToThePurchase(Dishes DishToAdd) {
        purchasedDishes.add(DishToAdd);
    }

    @Override
    public void removeDishFromThePurchase(Dishes dishToRemove) {
        purchasedDishes.remove(dishToRemove);
    }

    @Override
    public double calcTheTotalAndCurrentPriceOfThePurchase() {
        try {
            return purchasedDishes.stream().mapToDouble(prch -> purchasedDishes.size()).sum();
        } catch (NullPointerException e) {
            System.out.println("There are no purchased dishes");
        }
        return -1;
    }

    @Override
    public void changePurchaseStatusToPayedAndFinishIt(Table tableOfPurchase) {
        printPurchaseInfo();
        System.out.println("The purchased has been payed. Thank you for visiting our restaurant!");
        status = "payed";
        tableOfPurchase.setFree(true);
    }

    @Override
    public void changePurchaseStatusToServed() {
        status = "served";
    }

    @Override
    public void printPurchaseInfo() {
        System.out.print("Purchase Information" +
                purchasedDishes + "Total price" + totalPrice +
                "Time of purchasing" + currentTime);
    }

}
