public class linkedlist{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node headNode;
    int length;
    linkedlist() {
        headNode = null;
        length = 0;
    }
    public void insertNode(int data) {
        Node new_node = new Node(data);
        if(headNode == null) {
            headNode = new_node;
            new_node.next = null;
            length++;
        }
        Node currentNode = headNode;
        while(currentNode.next!=null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new_node;
        new_node.next = null;
        length++;
    }
    public void printList(){
        Node currentNode = headNode;
        while(currentNode!=null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }
    public static void main(String[] args){
        linkedlist l = new linkedlist();
        l.insertNode(10);
        l.insertNode(20);
        l.insertNode(30);
        l.insertNode(50);
        l.printList();
    }
}