class MyCircularDeque {
    private class Node {
        int data;
        Node next, pre;

        Node() {
            this.data = 0;
        }

        Node(int value) {
            this.data = value;
        }
    }

    final private Node front;
    final private Node rear;
    private int size;
    private final int capacity;

    public MyCircularDeque(int k) {
        front = new Node(); 
        rear = new Node(); 
        front.next = rear;
        rear.pre = front;
        size = 0;
        capacity = k;
    }

    public boolean insertFront(int value) {
        if (isFull()) return false;

        Node n = new Node(value);
        n.pre = front;
        n.next = front.next;
        front.next.pre = n;
        front.next = n;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) return false;

        Node n = new Node(value);
        n.pre = rear.pre;
        n.next = rear;
        rear.pre.next = n;
        rear.pre = n;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;

        front.next = front.next.next;
        front.next.pre = front;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) return false;

        rear.pre = rear.pre.pre;
        rear.pre.next = rear;
        size--;
        return true;
    }

    public int getFront() {
        if (isEmpty()) return -1; 
        return front.next.data;
    }

    public int getRear() {
        if (isEmpty()) return -1; 
        return rear.pre.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */