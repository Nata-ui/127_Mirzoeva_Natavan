import org.junit.*;
public class Task1_Tests extends Assert {

    private int getIntValue(ListNode<Integer> item) {

        return ((Node<Integer>) item).getData();
    }

    @Test
    public void PushFront_EmptyList_Not() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        assertFalse(list.isEmpty());
    }
    @Test
    public void PushFront_EmptyList_TryingToGetElement() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        try {
            list.get(1);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }

    }
    @Test
    public void PushElements_ThreeElements_TheFirstOneIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        assertEquals(1, getIntValue(list.get(0)));
    }
}

