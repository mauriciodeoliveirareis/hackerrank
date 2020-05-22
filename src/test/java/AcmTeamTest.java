import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AcmTeamTest {

    @Test
    void twoAtendeesOneTopicNobodyKnowsShouldReturnZeroOne() {
        String[] input = {"0", "0"};
        int[] output = {0, 1};
        assertArrayEquals(output, AcmTeam.acmTeam(input, 2, 1));
    }


    @Test
    void twoAtendeesOneTopicEveryoneKnowsShouldReturnOneOne() {
        String[] input = {"1", "1"};
        int[] output = {1, 1};
        assertArrayEquals(output, AcmTeam.acmTeam(input, 2, 1));
    }

    @Test
    void twoAtendeesTwoTopicsOneAtendeeKnowsShouldReturnTwoOne() {
        String[] input = {"11", "00"};
        int[] output = {2, 1};
        assertArrayEquals(output, AcmTeam.acmTeam(input, 2, 2));
    }

    @Test
    void treeAtendeesTwoTopicsOneAtendeeKnowsShouldReturnTwoTwo() {
        String[] input = {"00", "11", "00"};
        int[] output = {2, 2};
        assertArrayEquals(output, AcmTeam.acmTeam(input, 3, 2));
    }
    @Test
    void excerciseInput() throws Exception{
        Scanner scanner = new Scanner(new File("/Users/mauricio.reis/Downloads/acmInput.txt"));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = AcmTeam.acmTeam(topic, n, m);
        System.out.println(result);
        scanner.close();

    }
}