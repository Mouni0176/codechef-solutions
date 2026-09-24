# DSACPR126

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice - Music Player

In this problem, you need to implement the functionality of a music player using doubly linked list!

The functionality of a playlist queue needs to be implemented, i.e., adding a song to the queue, playing the next song, playing the previous song, switching to a song, etc.

You need to complete the following functions:

- addSong(int songId): Add the songId to the end of the list
- playNext(): Go to the next song in the list
- playPrev(): Go to the previous song in the list
- switchSong(int songId): Find in the list where this songId is present, go to that song and continue the playlist from there (In playlist 1<->2<->3<->4<->5 if the current song is 4 and function is called for 2, the current song is stopped and now order is 2->3->4->5)
- current(): Return the songId of the song currently playing

Assumptions:

- playNext function will not be called from the last song
- playPrev function will not be called from the first song
- The songId provided in switchSong function is always present in the list
- The addSong function will not be called for a songId which is already present in the list
- The current function will not be called when the list is empty.

Note: Until the next function is called, the current song will automatically be the first songId added in the list.

The problem input is query-based:

1 : An integer `songId` will be provided with which addSong(songId) will be called
2 : playNext() is called
3 : playPrev() is called
4 : An integer `songId` will be provided with which switchSong(songId) will be called
5 : current() is called and you need to return the songId for the current song playing

 **You only need to make changes in the functions mentioned. The input and calling the required functions are taken care of. Do not output anything or you may get WA verdict** 

### Input Format
- The first line of input will contain a single integer $N$, denoting the number of queries.
- The next $N$ lines contain a single or two integers depending on the type of query.
### Output Format

Output a single integer songId on a new line for every time query type is 5.

### Constraints
- $1 \leq N \leq 100000$
- $1 \leq songId \leq 10^9$
### Sample 1:
Input
Output

```
16
1 1
1 2
1 3
5
2
5
3
5
1 4
1 5
2
2
4 1
5
2
5
```

```
1
2
1
1
2
```

### Explanation:

The current playlist is empty.
1 1 : Add song 1 to the end of list and the current song is now 1.
Playlist: 1
1 2 : Add song 2 to the end of list.
Playlist: 1<->2
1 3 : Add song 3 to the end of list.
Playlist: 1<->2<->3
5 : Output the current song.
2 : The current song is now 2.
5 : Output the current song.
3 : The current song is now 1.
5 : Output the current song.
1 4 : Add song 4 to the end of list.
Playlist: 1<->2<->3<->4
1 5 : Add song 5 to the end of list.
Playlist: 1<->2<->3<->4<->5
2 : The current song is now 2.
2 : The current song is now 3.
4 1 : Switch from 3 to 1. The current song is now 1.
5 : Output 1.
2 : The current song is now 2.
5 : Output 2.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T15:34:58.463Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR126)