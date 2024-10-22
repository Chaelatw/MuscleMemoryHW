package chapter9;

import org.w3c.dom.css.Rect;

public class InheritanceTester {
    public static void main(String[] args) {

        Mother mom = new Mother();
        mom.setName("Theresa");
        System.out.println(mom.getName() + " is a " + mom.getGender());



        Rectangle rectangle = new Rectangle();
        rectangle.print();
        Square square = new Square();
        square.print("Square");
        Employee employee = new Employee();

    }
}
