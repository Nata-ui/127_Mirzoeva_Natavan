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

    @Test
    public void pushFront_PushFrontDoubleLinkedList_enterCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(5);
        assertTrue(1 == list.getSize());
    }

    @Test
    public void pushFront_DoubleLinkedList_TestAnotherNumber() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        try {
            list.get(2);
            fail();
        } catch (IndexOutOfBoundsException e) { //поиск ощибки
            assertFalse(false);
        }
    }

    @Test
    public void getHead_DoubleLinkedList_TestGetHead() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(2);
        list.pushFront(8);
        int head = ((Node<Integer>) list.getHead()).getData();
        assertEquals(2, head);
    }

    @Test
    public void getHead_DoubleLinkedList_TestanotherGetHead() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(2);
        list.pushBack(8);
        int head = ((Node<Integer>) list.getHead()).getData();
        assertEquals(8, head);
    }

    @Test
    public void getTail_DoubleLinkedList_TestGetTail() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        int tail = ((Node<Integer>) list.getTail()).getData();
        assertEquals(2, tail);
    }
}