

import org.junit.*;
public class Task2_Tests extends Assert {
    @Test
    public void bubbleSort_CreateMyBubbleSort_TryToSort() {
        BubbleSort<Integer> sorter = new BubbleSort<>();

        MyComparator comparator = new MyComparator() {
            @Override
            public int compare(Object first, Object second) {
                return 1;
            }
        };
    }
}