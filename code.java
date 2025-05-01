import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double burger = 4.50;
        double fry = 2.00;
        double drink = 3.40;

        Scanner input = new Scanner(System.in);

        System.out.println("How many burgers would you like? ");
        int burgers = input.nextInt();

        System.out.println("How many fries would you like? ");
        int fries = input.nextInt();

        System.out.println("How many drinks would you like? ");
        int drinks = input.nextInt();

        double total = burger * burgers + fry * fries + drink * drinks;
        System.out.println("Your total: $" + total + " Dollars.");

        input.close();
    }
}
