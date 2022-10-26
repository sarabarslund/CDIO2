package test.java;

import game.Dices;
import org.junit.jupiter.api.RepeatedTest;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {
    Dices dices = new Dices();
    Integer[] acceptedDiceNumbers = {1, 2, 3, 4, 5, 6};
    @RepeatedTest(100)
    void rangeOfDiceNumbers(){
        dices.rollDices();
        assertTrue(Arrays.asList(acceptedDiceNumbers).contains(dices.getDice1()));
        assertTrue(Arrays.asList(acceptedDiceNumbers).contains(dices.getDice2()));
    }
}
