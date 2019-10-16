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
    Node first;

    public LinkedList() {
        first = null;
    }

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

    /**
     * Return the integer element at the given index.
     *
     * @param index the index of the element to be returned.
     * @return the element at the given index.
     */
    public int get(int index) {
        // 2 cases
        if (first == null) { // list is empty
            // case 1: zero elements
            throw new IndexOutOfBoundsException("list is empty");
        } else {
            // case 2: at least one element
            int counter = 0;
            Node current = first;
            // can use "next" field
            while (current.next != null && counter < index) {
                current = current.next;
                counter++;
            }
            if (counter == index) {
                return current.elem;
            } else {
                throw new IndexOutOfBoundsException("index out of bounds");
            }

        }
    }
}
