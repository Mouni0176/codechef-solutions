import java.util.Scanner;

class Main {

    private static class MyCircularList {

        private class node {
            int value;
            node next;

            public node(int val) {
                this.value = val;
                this.next = null;
            }
        }

        node head;
        node tail;

        public MyCircularList(){
            head=null;
            tail=null;
        }

        public void insertAtEnd(int val){

            node newnode = new node(val);

            if(this.head==null){
                this.head = newnode;
                this.tail = newnode;
            }
            else{
                this.tail.next = newnode;
                this.tail = newnode;
            }
            this.tail.next=head;
        }

        public void solution(){
            // Your code goes here
            node current = this.head;
            while(current.next!=current){
                node knife = current.next.next;
                if(current.next==head){
                    head = knife;
                }
                current.next = knife;
                current=current.next;
            }
            System.out.println(current.value);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            MyCircularList list = new MyCircularList();
            for (int i=1 ; i<=n ; i++) {
                list.insertAtEnd(i);
            }
            list.solution();
            t--;
        }
    }
}