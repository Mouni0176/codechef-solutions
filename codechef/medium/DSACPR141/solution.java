import java.util.*;
import java.io.*;
class Solution {
    private static final int MAX_SIZE = 200005;
    private char[] a = new char[MAX_SIZE];
    private int top = -1;

    private void push(char ele) {
        if (top < MAX_SIZE - 1) {
            a[++top] = ele;
        } else {
            System.out.println("Stack is full. Cannot push: " + ele);
        }
    }

    private char pop() {
        if (top >= 0) {
            char ele = a[top];
            top--;
            return ele;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return '\0';
        }
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isMatchingPair(char open, char close) {
        if (open == '(' && close == ')') return true;
        if (open == '{' && close == '}') return true;
        if (open == '[' && close == ']') return true;
        return false;
    }

    public boolean isBalanced(String expression) {
        top = -1; // Reset stack pointer
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (isEmpty()) {
                    return false;
                }
                char topChar = pop();
                if (!isMatchingPair(topChar, c)) {
                    return false;
                }
            }
        }
        return isEmpty();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        Solution sol = new Solution();
        while (t-- > 0 && sc.hasNext()) {
            String str = sc.next();
            System.out.print(str + " : ");
            boolean ans = sol.isBalanced(str);
            if (ans) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}