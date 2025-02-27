package tudelft.numfinder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumFinderTest {

    @Test
    public void findLargest() {
        int[] testlist = new int[] {0, 4, 3, -3, 2, 1};
        NumFinder nf = new NumFinder();
        nf.find(testlist);
        int result = nf.getLargest();
        Assertions.assertEquals(4, result);
    }
    @Test
    public void findSmallest() {
        int[] testlist = new int[] {0, 4, 3, -3, 2, 1};
        NumFinder nf = new NumFinder();
        nf.find(testlist);
        int result = nf.getSmallest();
        Assertions.assertEquals(-3, result);
    }
    @Test
    public void findSmallestTwoSame() {
        int[] testlist = new int[] {0, 4, 3, -3, -3, 2, 1};
        NumFinder nf = new NumFinder();
        nf.find(testlist);
        int result = nf.getSmallest();
        Assertions.assertEquals(-3, result);
    }
    @Test
    public void findBoth() {
        int[] testlist = new int[] {1,1,1};
        NumFinder nf = new NumFinder();
        nf.find(testlist);
        int result = nf.getSmallest();
        int result2 = nf.getLargest();
        Assertions.assertEquals(1, result);
        Assertions.assertEquals(1, result2);
        Assertions.assertEquals(result2, result);
    }

}