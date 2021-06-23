package com.ekhu94;

public class Main {

    public static void main(String[] args) {
	    // use var keyword to implicitly declare data type
        var ore = new Employee(58409, 25);
        System.out.println(ore.calculateWage(18));
    }
}
