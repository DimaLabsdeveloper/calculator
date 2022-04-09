import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("your name:");
        String name = scaner.nextLine();
        System.out.println("your age:");
        Integer age = scaner.nextInt();
        System.out.println("Hello your name is : "+name);
        System.out.println("Hello your age is : "+age);
    }

}
