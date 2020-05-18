import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueensAttackTest {

    @Test
    void onePerOneBoardShouldReturnZero() {
        int[][] ints = {};
        assertEquals(0, QueensAttack.queensAttack(1,0,1,1, ints));
    }
    @Test
    void twoPerTwoBoardShouldReturnThree() {
        int[][] ints = {};
        assertEquals(3, QueensAttack.queensAttack(2,0,1,1, ints));
    }
    @Test
    void threePerTheeBoardShouldReturnSix() {
        int[][] ints = {};
        assertEquals(6, QueensAttack.queensAttack(3,0,1,1, ints));
    }

    @Test
    void threePerTheeBoardWithQueenOnCenterShouldReturnEight() {
        int[][] ints = {};
        assertEquals(8, QueensAttack.queensAttack(3,0,2,2, ints));
    }

    @Test
    void fourByFourBoardWithQueenOnThreeTwoAndObstacleOnTwoThreeShouldReturnNine() {
        int[][] ints = {{2,3}};

        assertEquals(9, QueensAttack.queensAttack(4,1,3,2, ints));
    }


}