package chapter6;

public class PhoneBillCalculator2 {
    private int id;
    private double baseCost;
    private int numberOfAllottedMinutes;
    private int numberOfMinutesUsed;

    public PhoneBillCalculator2(){}

    public PhoneBillCalculator2(int id) {
        this.id = id;
    }

    public PhoneBillCalculator2(int id, double baseCost, int numberOfAllottedMinutes, int numberOfMinutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.numberOfAllottedMinutes = numberOfAllottedMinutes;
        this.numberOfMinutesUsed = numberOfMinutesUsed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getNumberOfAllottedMinutes() {
        return numberOfAllottedMinutes;
    }

    public void setNumberOfAllottedMinutes(int numberOfAllottedMinutes) {
        this.numberOfAllottedMinutes = numberOfAllottedMinutes;
    }

    public int getNumberOfMinutesUsed() {
        return numberOfMinutesUsed;
    }

    public void setNumberOfMinutesUsed(int numberOfMinutesUsed) {
        this.numberOfMinutesUsed = numberOfMinutesUsed;
    }

    public double calculateOverage(){
       if(numberOfMinutesUsed <= numberOfAllottedMinutes){
       }
        return 0;
    }
    public double calculateTax(){
        return 0;
    }
    public double calculateTotal(){
        return 0;
    }
}
