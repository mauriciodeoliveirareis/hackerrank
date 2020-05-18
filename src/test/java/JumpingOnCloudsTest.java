import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpingOnCloudsTest {
    @Test
    void shouldReturnOneWhenThereAreTwoCumulus(){
        int[] clouds = {0,0};
        assertEquals(1, JumpingOnClouds.jumpingOnClouds(clouds));
    }
    @Test
    void shouldReturnOneWhenThereAreTwoCumulusAndOneThunderheadInBetween(){
        int[] clouds = {0,1,0};
        assertEquals(1, JumpingOnClouds.jumpingOnClouds(clouds));
    }
    @Test
    void shouldReturnTwoWhenThereAreTwoThunderheadsTouchingAllTreeCumulus(){
        int[] clouds = {0,1,0,1,0};
        assertEquals(2, JumpingOnClouds.jumpingOnClouds(clouds));
    }
    @Test
    void shouldReturnTreeWhenThereIsTwoThunderheadsAndOneStoppingAnDoubleJump(){
        int[] clouds = {0,0,1,0,1,0};
        assertEquals(3, JumpingOnClouds.jumpingOnClouds(clouds));
    }


}