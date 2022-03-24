import org.junit.*;
public class Task1_Tests extends Assert {
    @Test
    public void isEmpty_DoubleLinkedList_checkIsEmpty() {
        DoubleLinkedList<Integer> List = new DoubleLinkedList<>();
        assertTrue(List.isEmpty());

    }

    @Test
    public void isEmpty_DoubleLinkedList_PushBack() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(10);
        assertFalse(list.isEmpty());
    }

    @Test
    public void getSize_DoubleLinkedList_tabGetSize() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(0 == list.getSize());
    }
}