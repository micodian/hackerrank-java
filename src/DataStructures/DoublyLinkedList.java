package DataStructures;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last = newNode;
            
        } else {
            first.previous = newNode;

        }
        newNode.next = first;
        this.first = newNode;

    }


    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;

    }


    public Node deleteFirst(){
        Node temp = first;
        if (first.next == null) {
            last = null;
        }
        else{
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public Node deleteLast(){
        Node temp = first;
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
            
        }
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(int key,int data){
        Node current = first;
        while (current.data != key) {
            current =current.next;
            if (current == null) {
                return false;
            }
        }
        Node newNode = new Node();
        newNode.data = data;

        if (current == last) {
            current.next = null;
            last = newNode;
        }
        else{
            newNode.next = current.next;
            current.next.previous = newNode;
        }
        newNode.previous = current;
        current.next = newNode;
        return true;
    }

}
