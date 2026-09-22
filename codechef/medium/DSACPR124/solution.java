void deleteNode(int value) {
    Node targetNode = head;
    while (targetNode != null && targetNode.value != value) {
        targetNode = targetNode.next;
    }

    if (targetNode == null)
        return;

    // Update A and B
    Node A = targetNode.prev;
    Node B = targetNode.next;

    // A could be null if target is head
    if (A != null) {
        A.next = B;
    }

    // B could be null if target is tail
    if (B != null) {
        B.prev = A;
    }

    if (targetNode == head) {
        head = B;
    }
}
