import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    private Dice dice;

    @BeforeEach
    void setUp() {
        dice = new Dice();
    }

    @Test
    void roll() {
        dice.roll();
        int die1 = dice.getDie1();
        int die2 = dice.getDie2();

        assertTrue(die1 >= 1 && die1 <= 6);
        assertTrue(die2 >= 1 && die2 <= 6);

    }

    @Test
    void isDouble() {
        dice = new Dice() {
            @Override
            public void roll() {
                this.die1 = 1;
                this.die2 = 1;
            }
        };
        dice.roll();
        assertTrue(dice.isDouble());
    }

    @Test
    void notDouble() {
        dice = new Dice() {
            @Override
            public void roll() {
                this.die1 = 1;
                this.die2 = 2;
            }
        };
        dice.roll();
        assertFalse(dice.isDouble());
    }

}