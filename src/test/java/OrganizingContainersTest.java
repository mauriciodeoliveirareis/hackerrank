import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class OrganizingContainersTest {
    @Test
    void oneContainerOneItemPossible() {
        int[][] container = {{1}};
        assertEquals(OrganizingContainers.POSS, OrganizingContainers.organizingContainers(container));
    }
    @Test
    void threeContainerOneTwoTreePossible() {
        int[][] container = {{0,2,1}, {1,1,1}, {2,0,0}};
        assertEquals(OrganizingContainers.POSS, OrganizingContainers.organizingContainers(container));

    }

//    @Test
//    void oneContainerOneTwoImpossible() {
//        int[][] container = {{1,2}};
//        assertEquals(OrganizingContainers.IMP, OrganizingContainers.organizingContainers(container));
//    }
//    @Test
//    void oneContainerOneOnePossible() {
//        int[][] container = {{1,1}};
//        assertEquals(OrganizingContainers.POSS, OrganizingContainers.organizingContainers(container));
//    }
//    @Test
//    void twoContainerOneTwoPossible() {
//        int[][] container = {{1,2}, {1,2}};
//        assertEquals(OrganizingContainers.POSS, OrganizingContainers.organizingContainers(container));
//        int[][] container2 = {{1,2}, {2,1}};
//        assertEquals(OrganizingContainers.POSS, OrganizingContainers.organizingContainers(container2));
//    }
//    @Test
//    void twoContainerOneTwoOneThreeImpossible() {
//        int[][] container = {{1,2}, {1,3}};
//        assertEquals(OrganizingContainers.IMP, OrganizingContainers.organizingContainers(container));
//        int[][] container2 = {{2,1}, {3,1}};
//        assertEquals(OrganizingContainers.IMP, OrganizingContainers.organizingContainers(container2));
//    }
//
//    @Test
//    void threeContainerOneTwoTreePossible() {
//        int[][] container = {{1,2,3}, {1,3,2}, {1,3,2}};
//        assertEquals(OrganizingContainers.POSS, OrganizingContainers.organizingContainers(container));
//        int[][] container2 = {{2,1,3}, {3,1,2}, {1,3,2}};
//        assertEquals(OrganizingContainers.POSS, OrganizingContainers.organizingContainers(container2));
//    }
//
//
//    @Test
//    void threeContainerMixedButWithEqualNumberOfNumbersShouldBePossible() {
//        int[][] container = {{1,4,3}, {1,3,3}, {1,4,4}};
//        assertEquals(OrganizingContainers.POSS, OrganizingContainers.organizingContainers(container));
//
//    }

}