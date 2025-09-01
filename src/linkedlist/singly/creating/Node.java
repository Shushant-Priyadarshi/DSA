package linkedlist.singly.creating;

public class Node {
    private Object data;
    private Node next;

    public Node(Object data, Node next){
        this.data = data;
        this.next = next;
    }

    public Object getData(){
        return data;
    }

    public void setData(Object data){
        this.data = data;
    }

    public Node getNode(){
        return next;
    }

    public void setNode(Node next){
        this.next = next;
    }

}
