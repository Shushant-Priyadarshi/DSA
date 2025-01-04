package linked_lists.singlyLL.creation;

public class SinglyLinkedList {
    private Node head;
    private int size;

    public int size(){
        return this.size;
    }

    public void prepend(int data){
        Node header = new Node(data,null);
        header.setNext(head);
        this.head = header;
        this.size++;
    }
}
