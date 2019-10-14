package exercises;

class Node {
    int elem;
    Node next;

    Node(int elem, Node next) {
        this.elem = elem;
        this.next = next;
    }
}

public class LinkedList {
    Node first = null;

    public void add(int elem) {
        if (first == null) {
            // this means the list is empty!
            // handle the simple case
            Node n = new Node(elem, null);
            first = n;
        } else {
            // first != null
            // handle the more tricky case

            // 1. step: find last node!
            // The last node is the node where
            // next == null!
            Node current = first;
            while (current.next != null) { // is it the last node?
                current = current.next;
            }
            // here, we know: current is the last node
            // because current.next == null
            Node last = current;
            last.next = new Node(elem, null);
        }
    }
}
