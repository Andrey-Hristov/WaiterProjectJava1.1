package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Table firstTable = new Table(1, true);
        Table secondTable = new Table(2, true);
        Table thirdTable = new Table(3, true);
        Table fourthTable = new Table(4, true);
        Table fifthTable = new Table(5, true);

        List<Table> tablesInTheRestaurant = new ArrayList<Table>();

        tablesInTheRestaurant.add(firstTable);
        tablesInTheRestaurant.add(secondTable);
        tablesInTheRestaurant.add(thirdTable);
        tablesInTheRestaurant.add(fourthTable);
        tablesInTheRestaurant.add(fifthTable);


    }

}