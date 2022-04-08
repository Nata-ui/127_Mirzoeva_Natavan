import org.junit.Assert;
import org.junit.*;

public class Task3_Tests extends Assert {
    class TestComparator implements MyComparator<Integer> {
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }

    @Test
    public void HeapSort_SortSameNumbers_DataIsCorrect() {
        HeapSort<Integer> hs = new HeapSort<>();
        Integer[] data = {1, 1, 1};
        hs.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1, 1, 1}, data);
    }
}