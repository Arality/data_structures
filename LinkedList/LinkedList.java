public class LinkedList{
    private Node head, node;

    LinkedList(int data){
        this.node = new Node();
        this.node.data = data;
        this.head = this.node;
    }
    public String toString(){
        return Integer.toString(this.node.data);
    }
    public void add(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.prev = this.node;

        this.node.next = newNode;
        this.node = newNode;
    }

    public void pop(){
        this.node = this.node.prev;
        this.node.next = null;
    }

    public boolean contains(int item){
        Node tempNode = this.head;
        while(true){
            if(tempNode.next == null)
                return false;
            else if(tempNode.data == item)
                return true;
            else
                tempNode = tempNode.next;
        }
    }
}

class Node{
    public int data;
    public Node next = null, prev = null;
}
