class LList {

    private class Node {
        Object data;
        Node next;
    }

    private Node tail;

    void add(Object data) {
        Node p = new Node();
        p.data = data;

        if (tail != null) {
            p.next = tail;
        }
        tail = p;
    }

    void printList() {
        Node p = tail;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }
}

public class Task1 {

    public static void main(String[] args) {
        LList l = new LList();
        l.add(2);
        l.add(215);
        l.add("Hello");
        l.add(1.2f);
        l.printList();
    }
}
