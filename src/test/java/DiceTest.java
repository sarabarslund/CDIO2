package test.java;

import main.java.Dices;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

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
