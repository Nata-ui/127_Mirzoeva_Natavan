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
    @Test
    public void HeapSort_SortSortedData_DataIsCorrect(){
        HeapSort<Integer> hs = new HeapSort<>();
        Integer[] data = {1, 2, 3};
        hs.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, data);
    }
    @Test
    public void HeapSort_SortData_DataIsCorrect(){
        HeapSort<Integer> hs = new HeapSort<>();
        Integer[] data = {1, 3, 2};
        hs.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, data);
    }
    @Test
    public void HeapSort_SortNegativeNumbersWithNormal_DataIsCorrect(){
        HeapSort<Integer> hs = new HeapSort<>();
        Integer[] data = {1, 0, -1};
        hs.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{-1, 0, 1}, data);
    }
    @Test
    public void HeapSort_SortBigUnsortedArray_DataIsCorrect(){
        HeapSort<Integer> hs = new HeapSort<>();
        Integer[] data = {9, 2, 3, 6, 1, 0, 8, 5, 7, 4};
        hs.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, data);
    }
    @Test
    public void HeapSort_SortBigUnsortedArrayContainingSameNumbers_DataIsCorrect(){
        HeapSort<Integer> hs = new HeapSort<>();
        Integer[] data = {9, 2, 3, 6, 1, 0, 8, 5, 7, 4, 1};
        hs.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9}, data);
    }
    @Test
    public void HeapSort_SortBigUnsortedArrayWithNegativeNumbers_DataIsCorrect(){
        HeapSort<Integer> hs = new HeapSort<>();
        Integer[] data = {9, 2, 3, 6, 1, -2, 0, 8, 5, 7, 4, -1};
        hs.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{-2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, data);
    }
    @Test
    public void MergeSort_SortSameNumbers_DataIsCorrect(){
        MergeSort<Integer> ms = new MergeSort<>();
        Integer[] data = {1, 1, 1};
        ms.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1, 1, 1}, data);
    }
    @Test
    public void MergeSort_SortSortedData_DataIsCorrect(){
        MergeSort<Integer> ms = new MergeSort<>();
        Integer[] data = {1, 2, 3};
        ms.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, data);
    }
    @Test
    public void MergeSort_SortUnsortedData_DataIsCorrect(){
        MergeSort<Integer> ms = new MergeSort<>();
        Integer[] data = {1, 3, 2};
        ms.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, data);
    }
    @Test
    public void MergeSort_SortBigUnsortedArray_DataIsCorrect(){
        MergeSort<Integer> ms = new MergeSort<>();
        Integer[] data = {9, 2, 3, 6, 1, 0, 8, 5, 7, 4};
        ms.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, data);
    }
    @Test
    public void MergeSort_SortNegativeNumbersWithNormal_DataIsCorrect(){
        MergeSort<Integer> ms = new MergeSort<>();
        Integer[] data = {1, 0, -1};
        ms.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{-1, 0, 1}, data);
    }
    @Test
    public void MergeSort_SortBigUnsortedArrayWithNegativeNumbers_DataIsCorrect(){
        MergeSort<Integer> ms = new MergeSort<>();
        Integer[] data = {9, 2, 3, 6, 1, -2, 0, 8, 5, 7, 4, -1};
        ms.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{-2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, data);
    }
}