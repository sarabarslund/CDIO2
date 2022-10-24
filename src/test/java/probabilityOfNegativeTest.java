package test.java;

import main.java.Dices;
import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

public class probabilityOfNegativeTest {
    // Det vides fra forriges opgave at chancen for at slå 1, 2, 3... er hhv:
    // 1/36, 2/36, 3/36, 4/36, 5/36, 6/36, 5/36, 4/36, 3/36, 2/36, 1/36

    Integer[] chances = {1/36, 2/36, 3/36, 4/36, 5/36, 6/36, 5/36, 4/36, 3/36, 2/36, 1/36};
    Integer[] values = {250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};

    // Vi kører spillet igennem 100.000 gange, hvor kun en spiller får lov at spille.
    // Ved 100.000 tests får spilleren en negativ værdi 145 gange.
    // Sandsynligheden må således være i nærheden af 145/100.000
    // Anton maths?

    @RepeatedTest(100000)
    public void chanceTest(){
        int Balance = 1000;
        Dices dices = new Dices();

        while (Balance < 3000){
            dices.rollDices();
            Balance += values[dices.getDices() - 2];
            assertTrue(Balance > 0);
        }

    }

}
