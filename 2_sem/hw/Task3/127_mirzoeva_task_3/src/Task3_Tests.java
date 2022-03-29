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
    public void QuickSort_sortTwoElements_sort() {
        Integer[] arr = new Integer[]{4, 2};
        QuickSort<Integer> qs = new QuickSort<>();
        qs.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{2, 4}, arr);
    }
}