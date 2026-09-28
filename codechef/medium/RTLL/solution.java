/*
public class Main {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }*/
public static Node listReverse(Node head) {
    Node prev = null;
    Node curr = head;
    Node next = null;
    
    while(curr!=null){
        next = curr.next;
        curr.next = prev ;
        prev  = curr;
        curr = next;
    }
    return prev;
    }

    

