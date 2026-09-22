import java.util.Scanner;

class Main {

    private static class MyCircularList {
        
        // Notice there are no changes in the node class
        private class node {
            int value;
            node next;

            public node(int val) {
                this.value = val;
                this.next = null;
            }
        }
        
        // Additional pointer tail also maintained
        node head;
        node tail;

        public MyCircularList(){
            // Initialising both head and tail as null when list is created.
            head=null;
            tail=null;
        }

        public void insertAtEnd(int val){

            node newnode = new node(val);

            if(this.head==null){
                // When the list is empty
                // Note that even though there is not really a head in the list (you can traverse the list starting at any point), we maintain the first node we insert as the head
                this.head = newnode;
                this.tail = newnode;
            }
            else{
                // When the list is not empty
                // Add a new element towards the end of list
             tail.next = newnode;
                // Update the tail pointer so that it points to the last element
              tail = newnode;
            }
            // The last element always points to the head
            tail.next = head;
        }

        public void print(){
            node temp = this.head;
            while(temp!=null){
                System.out.printf("%d ",temp.value);
                if(temp==this.tail) break;
                temp=temp.next;
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyCircularList list = new MyCircularList();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.insertAtEnd(value);
        }
        list.print();
    }
}
