import org.junit.*;
public class task1_tests extends Assert{
    @Test
    public void isEmpty_DoubleLinkedList_checkIsEmpty() {
        DoubleLinkedList<Integer> List = new DoubleLinkedList<>();
        assertTrue(List.isEmpty());

    }
}