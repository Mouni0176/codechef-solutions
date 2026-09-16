# BLOBBYVOLLEY

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Blobby Volley Scores

Alice and Bob are playing a game of Blobby Volley. In this game, in each turn, one player is the server and the other player is the receiver. Initially, Alice is the server, and Bob is the receiver.

If the server wins the point in this turn, their score increases by 1, and they remain as the server for the next turn.
But if the receiver wins the point in this turn, their score does not increase. But they become the server in the next turn.
In other words, your score increases only when you win a point when you are the server.
Please see the Sample Inputs and Explanation for more detailed explanation.

They start with a score of $0$ each, and play $N$ turns. The winner of each of those hands is given to you as a string consisting of 'A's and 'B's. 'A' denoting that Alice won that point, and 'B' denoting that Bob won that point. Your job is the find the score of both of them after the $N$ turns.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains one integer $N$ — the number of turns. The line contains a string $S$ of length $N$. If the $i^{th}$ character of this string is 'A', then Alice won that point. If the $i^{th}$ character of this string is 'B', then Bob won that point.
### Output Format

For each test case, output on a new line, two space-separated integers - Alice's final score, and Bob's final score.

### Constraints
- $1 \leq T \leq 1000$
- $1 \leq N \leq 1000$
- Length of $|S|$ = $N$
- $S$ consists only of the characters 'A' and 'B'.
### Sample 1:
Input
Output

```
4
3
AAA
4
BBBB
5
ABABB
5
BABAB

```

```
3 0
0 3
1 1
0 0

```

### Explanation:

 **Testcase 1:**  The given string is "AAA".

- Score is 0, 0.
- Turn 1. Alice is the server, and Bob is the receiver. Alice wins.
- Score is 1, 0.
- Turn 2. Alice is the server, and Bob is the receiver. Alice wins.
- Score is 2, 0.
- Turn 3. Alice is the server, and Bob is the receiver. Alice wins.
- Score is 3, 0.

This is the final score, and so the output is 3 0.

 **Testcase 3:**  The given string is "ABABB".

- Score is 0, 0.
- Turn 1. Alice is the server, and Bob is the receiver. Alice wins.
- Score is 1, 0.
- Turn 2. Alice is the server, and Bob is the receiver. Bob wins.
- Score is 1, 0. [Note that Bob's score doesn't increase]
- Turn 3. Bob is the server, and Alice is the receiver. Alice wins.
- Score is 1, 0. [Note that Alice's score doesn't increase]
- Turn 4. Alice is the server, and Bob is the receiver. Bob wins.
- Score is 1, 0. [Note that Bob's score doesn't increase]
- Turn 5. Bob is the server, and Alice is the receiver. Bob wins.
- Score is 1, 1.

This is the final score, and so the output is 1 1.

 **Testcase 4:**  The given string is "BABAB".

- Score is 0, 0.
- Turn 1. Alice is the server, and Bob is the receiver. Bob wins.
- Score is 0, 0.
- Turn 2. Bob is the server, and Alice is the receiver. Alice wins.
- Score is 0, 0.
- Turn 3. Alice is the server, and Bob is the receiver. Bob wins.
- Score is 0, 0.
- Turn 4. Bob is the server, and Alice is the receiver. Alice wins.
- Score is 0, 0.
- Turn 5. Alice is the server, and Bob is the receiver. Bob wins.
- Score is 0, 0.

This is the final score, and so the output is 0 0.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T15:37:13.635Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int a=0;
            int b=0;
            if(s.charAt(0)=='A'){
                a++;
            }
            for(int i=0;i<n-1;i++){
            if((s.charAt(i)=='A')&&(s.charAt(i+1)=='A')){
                a++;
            }
            else if((s.charAt(i)=='B')&&(s.charAt(i+1)=='B')){
                b++;
            }
            }
            System.out.println(a+" "+b);
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BLOBBYVOLLEY)