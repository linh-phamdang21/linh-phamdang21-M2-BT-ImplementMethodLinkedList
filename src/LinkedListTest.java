public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList(10);
        linkedList.add(0,5);
        linkedList.add(1,20);
        //linkedList.printList();
        linkedList.add(1,30);
        linkedList.printList();
        linkedList.size();
    }
}
