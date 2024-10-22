package chapter9;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake birthdayCake = new BirthdayCake("red velvet", 45.00,20);
        System.out.println("My birthday cake flavor is " + birthdayCake.getFlavor() + ". " + "It was $" + birthdayCake.getPrice() + " with " + birthdayCake.getCandles() + " candles");

        WeddingCake weddingCake = new WeddingCake("vanilla", 100.00,3);
        System.out.println("My Wedding cake flavor is " + weddingCake.getFlavor() + ". " + "It was $" + weddingCake.getPrice() + " with " + weddingCake.getTiers() + " tiers");


    }
}
