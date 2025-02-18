import java.util.Random;

public class Dice {

    public int die1;
    public int die2;

    public void roll() {
        Random random = new Random();
        System.out.println("Rolling the dice...");
        die1 = random.nextInt(6) + 1;
        die2 = random.nextInt(6) + 1;
    }

    public boolean isDouble() {
       if (die1 == die2) {
           System.out.println("You rolled a double!");
           return true;
        } else
           System.out.println("Try again");
        return false;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }
}

