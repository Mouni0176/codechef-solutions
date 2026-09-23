# DSACPR125

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice - Josephus Problem

You need to solve the famous Josephus problem using circular linked list in this section.

There are `N` people standing in a circle like 1->2->3...->N->1 and there is a knife. Whoever has the knife kills the person next to them and hands over the knife, i.e., if `2` has the knife in 1->2->3->1 then `2` kills `3` and hands over the knife to `1`. This process continues until there is only one person left, i.e., there is no one left to kill. This last person is deemed as the winner. Initially the knife is with person `1`.

For a given `N`, you need to determine the winner.

Note - You are given a circular linked list containing elements from `1` to `N` with head initially at `1`. In the `solution` function, you need to output a single integer denoting the winner.
 **Do not make changes anywhere except the solveJosephus() function.** 

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases. The description of the test cases follows.
- The first and only line of each test case contains a single integer $N$, denoting the number of people
### Output Format

For each test case, output on a new line the winner of that game.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq N \leq 10^5$
### Sample 1:
Input
Output

```
2
5
4
```

```
3
1
```

### Explanation:

For n=5, the moves are as followed (the person in bracket holds the knife):
(1)->2->3->4->5->1   (`1` kills `2` and hands knife to 3)
1->(3)->4->5->1   (`3` kills `4` and hands knife to 5)
1->3->(5)->1   (`5` kills `1` and hands knife to 3)
(3)->5   (`3` kills `5` and is the only person left)

Therefore, 3 is the winner.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T15:14:58.939Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR125)