import org.junit.Assert;
import org.junit.Test;

public class Task2_Tests extends Assert {
    static class TestComparator implements MyComparator<Integer> {

        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }
    @Test
    public void BubbleSort_sortElement_sort() {
        Integer[] data = {1};
        BubbleSort<Integer> bbs = new BubbleSort<Integer>();
        bbs.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1}, data);
    }
}