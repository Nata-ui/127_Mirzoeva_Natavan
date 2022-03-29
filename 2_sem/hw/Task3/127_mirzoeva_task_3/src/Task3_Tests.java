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
    @Test
    public void QuickSort_sortTwoSameElements_sort(){
        Integer[] arr = new Integer[]{2,4,2,5};
        QuickSort<Integer> qs = new QuickSort<>();
        qs.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{2,2,4,5}, arr);
    }
    @Test
    public void QuickSort_UnsortedArray_sort(){
        Integer[] arr = new Integer[]{2,5,2,3,5};
        QuickSort<Integer> qs = new QuickSort<>();
        qs.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{2,2,3,5, 5}, arr);
    }
    @Test
    public void MergeSort_sortTwoElements_sort(){
        Integer[] arr = new Integer[]{4,2};
        MergeSort<Integer> qs = new MergeSort<>();
        qs.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{2, 4}, arr);
    }
    @Test
    public void MergeSort_ArrayFirstElements_sort(){
        Integer[] arr = new Integer[]{3,2,4};
        MergeSort<Integer> qs = new MergeSort();
        qs.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{2,3,4}, arr);
    }
    @Test
    public void MergeSort_SortArray_ArrayNotChange(){
        Integer[] arr = new Integer[]{1,2,3,4};
        MergeSort<Integer> qs = new MergeSort();
        qs.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{1,2,3,4}, arr);
    }
}