package game_test;

import game.Dices;
import game.Field;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

public class probabilityOfNegativeTest {
    // Det vides fra forriges opgave at chancen for at slå 1, 2, 3... er hhv:
    // 1/36, 2/36, 3/36, 4/36, 5/36, 6/36, 5/36, 4/36, 3/36, 2/36, 1/36

    // chances = {1/36, 2/36, 3/36, 4/36, 5/36, 6/36, 5/36, 4/36, 3/36, 2/36, 1/36};
    // values = {0, 250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};
    // Anyone maths?

    // Vi kører spillet igennem 100.000 gange, hvor kun en spiller får lov at spille.
    // Ved 100.000 tests får spilleren en negativ værdi 145 gange.
    // Sandsynligheden må således være i nærheden af 145/100.000

    @RepeatedTest(1000000)
    public void chanceTest(){
        // Fra controller
        int Balance = 1000;
        // Henter relevante classes fra spil
        Dices dices = new Dices();
        Field value = new Field();

        while (Balance < 3000){
            // RUller terninger
            dices.rollDices();
            // Får value og ud fra slag, ligesom i spillet
            Balance += value.getFieldValue(dices.getDices() - 1);
            // Tester om points bliver negative
            assertTrue(Balance > 0);
        }

    }

}
