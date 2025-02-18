import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dice dice = new Dice();
        int rollCount = 0;

        System.out.println("Press Enter to roll the dice...");

        do {
            scanner.nextLine();
            dice.roll();
            rollCount++;

            System.out.println("Die 1: " + dice.getDie1());
            System.out.println("Die 2: " + dice.getDie2());


        } while (!dice.isDouble());

        System.out.println("After " + rollCount + " tries, both dice reached the same value.");
    }
}