package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
     private Scanner scanner = new Scanner(System.in);

    static HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
    public static void main(String[] args) {

        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is: "+ area);
        calculator.scanner.close();

    }
    public Rectangle getRoom(){


        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        Rectangle room = new Rectangle(length, width);

        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
