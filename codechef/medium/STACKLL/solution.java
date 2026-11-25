public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        currentSize++;
    }

    public void pop() {
        if (top != null) {
            top = top.next;
            currentSize--;
        }
    }

    public int peek() {
        if (top == null) return -1;
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return currentSize;
    }