package com.ekhu94;

public class Main {

    public static void main(String[] args) {
	    // use var keyword to implicitly declare data type
        var myWage = new WageCalculator(58409, 10, 25);
        System.out.println(myWage.calculateWage());
    }
}
