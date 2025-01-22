import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLargestElement {
    LargestElement le=new LargestElement();

    @Test
    void test1(){
        int nums[]={1,3,6,7,8};
        int k=2;
        assertEquals(7,le.findKthLargest(nums, k));
    }
}
