package stack;

public class ListStack {
    private final LinkedList linkedList = new LinkedList();
    public void push(int data) {
        linkedList.addElem(data);
    }
    public int pop() {
        return linkedList.removeElem();
    }
}

class LinkedList {
    private static class Node {
        private int data;
        private Node next;
        public Node (int data_) {
            data = data_;
        }
    }

    private Node current = null;
    public void addElem(int data) {
        Node newTempElem = new Node(data);
        newTempElem.next = current;
        current = newTempElem;
    }
    public int removeElem() {
        Node currentTempElem = current;
        current = current.next;
        return currentTempElem.data;
    }
}

