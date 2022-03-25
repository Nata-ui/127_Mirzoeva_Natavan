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
        } catch (IndexOutOfBoundsException e) { //поиск ошибки
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

    @Test
    public void getTail_DoubleLinkedList_TestNewGetTail() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        int l = ((Node<Integer>) list.getTail()).getData();
        assertEquals(1, l);
    }

    @Test
    public void get_PushFrontEmptyDoubleLinkedList_TestFirst() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        int n = ((Node<Integer>) list.get(0)).getData();
        assertEquals(1, n);
    }

    @Test
    public void get_PushBackEmptyDoubleLinkedList_TestFirst() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(3);
        list.pushBack(2);
        list.pushBack(1);

        int n = ((Node<Integer>) list.get(0)).getData();
        assertEquals(1, n);
    }

    @Test
    public void remove_PushFrontEmptyDoubleLinkedList_RemoveTestSize() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.remove(list.get(0));
        assertEquals(2, list.getSize());
    }

    @Test
    public void insertListAfter_TestSize() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list.insertListAfter(list.get(0), list2);
        assertEquals(6, list.getSize());
    }

    @Test
    public void insertListAfter_TestHead(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(4);
        list1.pushFront(5);
        list1.pushFront(6);
        list1.insertListAfter(list.get(0), list1);
        int head = ((Node<Integer>)list.getHead()).getData();
        assertEquals(1, head);
    }



    @Test
    public void insertListAfter_TestValues(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(5);
        list.pushFront(6);

        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(2);
        list1.pushFront(3);
        list1.pushFront(4);
        list.insertListAfter(list.get(0), list1);

        int num1 = ((Node<Integer>)list.get(0)).getData();
        assertEquals(1, num1);
        num1 = ((Node<Integer>)list.get(1)).getData();
        assertEquals(2, num1);
        num1 = ((Node<Integer>)list.get(2)).getData();
        assertEquals(3, num1);
        num1 = ((Node<Integer>)list.get(3)).getData();
        assertEquals(4, num1);
        num1 = ((Node<Integer>)list.get(4)).getData();
        assertEquals(5, num1);
        num1 = ((Node<Integer>)list.get(5)).getData();
        assertEquals(6, num1);
    }

    @Test
    public void pushFront_TestValues(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.pushFront(4);

        int num1 = ((Node<Integer>)list.get(0)).getData();
        assertEquals(1, num1);
        num1 = ((Node<Integer>)list.get(1)).getData();
        assertEquals(2, num1);
        num1 = ((Node<Integer>)list.get(2)).getData();
        assertEquals(3, num1);
        num1 = ((Node<Integer>)list.get(3)).getData();
        assertEquals(4, num1);
    }
    @Test
    public void remove_RemoveAElement_TestValue(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.remove(list.get(0));
        int num = ((Node<Integer>)list.get(0)).getData();
        assertEquals(2, num);
    }
    @Test
    public void insertListAfter2_TestValues(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);

        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(4);
        list1.pushFront(5);
        list1.pushFront(6);
        list.insertListAfter(list.get(2), list1);

        int num1 = ((Node<Integer>)list.get(0)).getData();
        assertEquals(1, num1);
        num1 = ((Node<Integer>)list.get(1)).getData();
        assertEquals(2, num1);
        num1 = ((Node<Integer>)list.get(2)).getData();
        assertEquals(3, num1);
        num1 = ((Node<Integer>)list.get(3)).getData();
        assertEquals(4, num1);
        num1 = ((Node<Integer>)list.get(4)).getData();
        assertEquals(5, num1);
        num1 = ((Node<Integer>)list.get(5)).getData();
        assertEquals(6, num1);
    }
    @Test
    public void insertListBefore_TestSize(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(4);
        list.pushFront(5);
        list.pushFront(6);
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);
        list.insertListBefore(list.get(0), list1);
        assertEquals(6, list.getSize());
    }
    @Test
    public void insertListBefore_TestValues(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(4);
        list.pushFront(5);
        list.pushFront(6);
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);
        list.insertListBefore(list.get(0), list1);
        int num1 = ((Node<Integer>)list.get(0)).getData();
        assertEquals(1, num1);
        num1 = ((Node<Integer>)list.get(1)).getData();
        assertEquals(2, num1);
        num1 = ((Node<Integer>)list.get(2)).getData();
        assertEquals(3, num1);
        num1 = ((Node<Integer>)list.get(3)).getData();
        assertEquals(4, num1);
        num1 = ((Node<Integer>)list.get(4)).getData();
        assertEquals(5, num1);
        num1 = ((Node<Integer>)list.get(5)).getData();
        assertEquals(6, num1);
    }

    @Test
    public void createArrayGetSizeArray_PutSize(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        assertEquals(5, array.getSize());
    }
    @Test
    public void createArray_getEmptyArray_TestSize(){
        DynamicArray<Integer> array = new DynamicArray<>();
        assertEquals(1024, array.getSize());
    }
    @Test
    public void ChangeSize_TestSize(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.resize(10);
        assertEquals(10, array.getSize());
    }
    @Test
    public void GetTryIndex_AllowMessage(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.get(7);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void TryToGetIndex_AllowMessage(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.get(5);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }

    }
    @Test
    public void TryToSetIndex_AllowMessage(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.set(6,10);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }

    }
    @Test
    public void SetIndex_AllowMessage(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.set(5,10);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void TryToInsertIndex_AllowMessage(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.insert(6,10);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void TryToInsertValue_AllowMessage(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.insert(5,10);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void SetNumbers_TestValues(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.set(3, 4);
        array.set(4, 5);
        assertEquals(1, array.get(0).intValue());
        assertEquals(2, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());
        assertEquals(4, array.get(3).intValue());
        assertEquals(5, array.get(4).intValue());
    }
    @Test
    public void InsertANumber_TestNewValue(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.set(3, 4);
        array.set(4, 5);
        array.insert(4, 100);
        assertEquals(1, array.get(0).intValue());
        assertEquals(2, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());
        assertEquals(4, array.get(3).intValue());
        assertEquals(100, array.get(4).intValue());
    }
    @Test
    public void PushBackNumbers_TestValues(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.set(3, 4);
        array.set(4, 5);
        array.pushBack(6);
        array.pushBack(7);
        assertEquals(1, array.get(0).intValue());
        assertEquals(2, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());
        assertEquals(4, array.get(3).intValue());
        assertEquals(5, array.get(4).intValue());
        assertEquals(6, array.get(5).intValue());
        assertEquals(7, array.get(6).intValue());
    }
    @Test
    public void PopBackEmptyArray_AllowMessage(){
        DynamicArray<Integer> array = new DynamicArray<>(0);
        try {
            array.popBack();
            fail();
        }
        catch (Exception some) {
            assertEquals("Array is empty", some.getMessage());
        }
    }
}
