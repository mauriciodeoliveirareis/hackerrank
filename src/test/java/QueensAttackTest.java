import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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

    @Test
    void fourByFourBoardWithQueenOnThreeTwoSurroundedByObstaclesShouldReturnZero() {
        int[][] ints = {{2,1},{2,2},{2,3},{3,1},{3,3},{4,1},{4,2},{4,3}};

        assertEquals(0, QueensAttack.queensAttack(4,8,3,2, ints));
    }


    @Test
    void fourByFourBoardWithQueenOnThreeTwoOnlyAbleToMoveUpShouldReturnTwo() {
        int[][] ints = {{2,1},{2,3},{3,1},{3,3},{4,1},{4,2},{4,3}};
        assertEquals(2, QueensAttack.queensAttack(4,8,3,2, ints));
    }

    @Test
    void scanFromFileShouldResult417() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/Users/mauricio.reis/Downloads/input16.txt"));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] r_qC_q = scanner.nextLine().split(" ");

        int r_q = Integer.parseInt(r_qC_q[0]);

        int c_q = Integer.parseInt(r_qC_q[1]);

        int[][] obstacles = new int[k][2];

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
                obstacles[i][j] = obstaclesItem;
            }
        }

        int result = QueensAttack.queensAttack(n, k, r_q, c_q, obstacles);
        assertEquals(417, result);


        scanner.close();
    }

}