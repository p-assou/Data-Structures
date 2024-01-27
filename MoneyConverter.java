import java.util.*;
public class MoneyConverter {
    public static void main(String[] args) {

        String RESET = "\u001B[0m";
        String BLUE = "\u001B[46m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String MAGENTA = "\u001B[45m";
        String RED = "\u001B[41m";

        Scanner sc = new Scanner(System.in);
        System.out.println(YELLOW + "Enter an amount:" + RESET);
        double cents = sc.nextDouble();

        int amount = (int) (cents * 100);

        int quarters = (int) (amount / 25);
        amount = (int) (amount % 25);

        int dimes = (int) (amount / 10);
        amount = (int) (amount % 10);

        int nickels = (int) (amount / 5);
        amount = (int) (amount % 5);

        if (quarters > 0) {
            System.out.println(BLUE + "Quarters: " + RESET + quarters);
        }
        if (dimes > 0) {
            System.out.println(MAGENTA + "Dimes: " + RESET + dimes);
        }
        if (nickels > 0) {
            System.out.println(RED + "Nickels: " + RESET + nickels);
        }

    }
}
