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
    public void BubbleSort_BubbleSort_sosortElement_sort() {
        Integer[] data = {1};
        BubbleSort<Integer> bbs = new BubbleSort<Integer>();
        bbs.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1}, data);
    }
    @Test
    public void BubbleSort_sortArray_sort() {
        Integer[] data = {1, 2, 3, 4, 5, 6, 7};
        BubbleSort<Integer> bbs = new BubbleSort<Integer>();
        bbs.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7}, data);
    }
    @Test
    public void BubbleSort_Random_sort() {
        Integer[] data = {90, 253, 20, 167, 18976};
        BubbleSort<Integer> bbs = new BubbleSort<Integer>();
        bbs.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{20, 90, 167, 253, 18976}, data);
    }
    @Test
    public void BubbleSort_sortFirstElement_sort() {
        BubbleSort<Integer> bbs = new BubbleSort<>();
        Integer[] data = {2, 11, 15, 8};
        bbs.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{2, 8, 11, 15}, data);
    }

}