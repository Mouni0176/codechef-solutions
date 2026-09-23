import java.util.Scanner;
import java.util.HashMap;
class Main {

    private static class MyDoublyList {

        private class node {
            int value;
            node next;
            node prev;

            public node(int val) {
                this.value = val;
                this.next = null;
                this.prev = null;
            }
        }

        node head;
        node current;
        node tail;
        
        // It is suggested to maintain head pointer for the first element of the list and cur pointer for the current song node
        public MyDoublyList(){
            head=null;
            current=null;
            tail = null;
        }
        HashMap<Integer, node> map = new HashMap<>();

        public void addSong(int songId){
            node newsong = new node(songId);
            map.put(songId,newsong);
            
            // Consider the case when list is empty too
            if(head==null)
            {
                head = tail = current= newsong;
            }
            else{
                tail.next = newsong;
                newsong.prev = tail;
                tail = newsong;
            }
        }

        public void nextSong(){
            if(current.next !=null){
                current = current.next;
            }
        }

        public void prevSong(){
            if(current.prev!=null){
                current = current.prev;
            }
        }

        public void switchSong(int songId){
            current = map.get(songId);
        }

        public int current(){
            return current.value;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyDoublyList list = new MyDoublyList();
        while(n>0){
            int q = sc.nextInt();
            if(q==1){
                int songId = sc.nextInt();
                list.addSong(songId);
            }
            else if(q==2){
                list.nextSong();
            }
            else if(q==3){
                list.prevSong();
            }
            else if(q==4){
                int songId = sc.nextInt();
                list.switchSong(songId);
            }
            else{
                int ans = list.current();
                System.out.println(ans);
            }
            n--;
        }
    }
}