package com.ekhu94;

public class WageCalculator {
    private int baseSalary;
    private int extraHours;
    private int hourlyRate;

    public WageCalculator(int baseSalary, int extraHours, int hourlyRate) {
        this.baseSalary = baseSalary;
        this.extraHours = extraHours;
        this.hourlyRate = hourlyRate;
    }

    public int calculateWage() {
        return baseSalary + (extraHours * hourlyRate);
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getExtraHours() {
        return extraHours;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setExtraHours(int extraHours) {
        this.extraHours = extraHours;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
