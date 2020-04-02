import org.w3c.dom.Node;

import javax.swing.*;

public class LinkedList<E> {
    private Node head;
    private int numNodes = 1;

    public LinkedList(Object data){
        head = new Node(data);
    }

    public void add(int index, Object data){
        Node temp = head;
        Node holder;

        for (int i  = 0; i < index -1 && temp.next == null; i++){
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(data);
        numNodes++;
    }

    public void remove(int index){
        Node temp = head;
        int tempIndex = 1;
        while (temp.next != null && tempIndex != index){
            temp = temp.next;
            tempIndex++;
        }
        temp = temp.next;
        numNodes--;
    }

    public void size(){
        System.out.println(numNodes);
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private class Node{
        private Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }
    }
}
