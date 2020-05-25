import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class TaumBdayTest {
    @Test
    void taumBdayAllZeroShouldReturnZero() {
        assertEquals(0, TaumBday.taumBday(0,0,0,0,0));
    }
    @Test
    void taumBdayOneBlackAndAllCostsOneShouldReturnOne() {
        assertEquals(1, TaumBday.taumBday(1,0,1,1,0));
    }


    @Test
    void taumBdayAllCostOneBlackOneWhiteShouldReturnTwo() {
        assertEquals(2, TaumBday.taumBday(1,1,1,1,0));
    }

    @Test
    void taumBdayCostOneBlackTwoWhiteNoConversionShouldReturnTwo() {
        assertEquals(2, TaumBday.taumBday(1,1,1,2,0));
    }


    @Test
    void taumBdayTwoEachShouldReturnFour() {
        assertEquals(4, TaumBday.taumBday(1,1,2,2,2));
    }

    @Test
    void taumBdayConvertIsTheSameAsCost() {
        assertEquals(100, TaumBday.taumBday(15,20,4,2,2));
        assertEquals(100, TaumBday.taumBday(20,15,2,4,2));
    }


    @Test
    void taumBdayConvertIsMoreExpensiveThanCost() {
        assertEquals(100, TaumBday.taumBday(15,20,4,2,3));
    }

    @Test
    void taumBdayConvertIsCheaperThanCost() {
        assertEquals(85, TaumBday.taumBday(15,20,4,2,1));
    }
    @Test
    void taumBdayFromFile() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/mauricio.reis/Downloads/taumBday.txt"));


        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {

            String[] firstMultipleInput = new String[0];
            try {
                firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            } catch (IOException e) {
                e.printStackTrace();
            }

            int b = Integer.parseInt(firstMultipleInput[0]);

                int w = Integer.parseInt(firstMultipleInput[1]);

            String[] secondMultipleInput = new String[0];
            try {
                secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            } catch (IOException e) {
                e.printStackTrace();
            }

            int bc = Integer.parseInt(secondMultipleInput[0]);

            int wc = Integer.parseInt(secondMultipleInput[1]);

            int z = Integer.parseInt(secondMultipleInput[2]);

            long result = TaumBday.taumBday(b, w, bc, wc, z);

            System.out.println(result);

        });
        bufferedReader.close();
    }

}