import java.util.*;

public class LL {
    // LinkedList without Collections framework
    Node head;
    private int size;

    LL() {
        size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head; // need to traverse in linkedlist
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = this.head.next;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node currNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }

    public int getSize() {
        return size;
    }

    // iterative approach
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }
        Node preNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = preNode;

            preNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = preNode;

    }

    // recursive approach
    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newNode = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public static void main(String[] args) {
        // without collections framework
        LL list = new LL();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addFirst("0");
        System.out.println("size of list is " + list.getSize());
        list.printList();
        // list.reverseIterate();
        // list.printList();
        list.head = list.reverseRecursive(list.head);
        list.printList();

        // with collection framework
        // LinkedList<String> list = new LinkedList<>();
        // list.addFirst("Vishal");
        // list.addLast("is");
        // list.addLast("name");
        // System.out.println(list);

        // list.add(2, "my");
        // System.out.println(list);

        // for (int i = 0; i < list.size(); i++) {
        // System.out.print(list.get(i) + " -> ");
        // }
        // System.out.println("null");
    }

}
