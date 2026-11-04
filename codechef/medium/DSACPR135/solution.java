static int peek() {
    if (top >= 0) {
        int ele = a[top];
        System.out.println("Peeked: " + ele);
        return ele;
    } else {
        System.out.println("Stack is empty. Cannot peek.");
        return 0;
    }
}

static boolean is_empty() {
    return top == 0;
}

static boolean is_full() {
    return top >= MAX_SIZE;
}

