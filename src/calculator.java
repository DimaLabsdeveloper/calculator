import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter first number");
        double firstnumber  = scaner.nextDouble();
        System.out.println("Enter second number");
        double secondnumber  = scaner.nextDouble();
        System.out.println(firstnumber + secondnumber);
        System.out.println(firstnumber - secondnumber);
        System.out.println(firstnumber * secondnumber);
        System.out.println(firstnumber / secondnumber);
    }

}
