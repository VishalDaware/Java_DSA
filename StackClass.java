import java.util.*;

public class StackClass {

    // // with linkedList
    // static class Node {
    // int data;
    // Node next;

    // public Node(int data) {
    // this.data = data;
    // next = null;
    // }
    // }

    // static class Stack {
    // public static Node head;

    // public static boolean isEmpty() {
    // return head == null;
    // }

    // public static void push(int data) {
    // Node newNode = new Node(data);
    // if (isEmpty()) {
    // head = newNode;
    // return;
    // }
    // newNode.next = head;
    // head = newNode;
    // }

    // public static int pop() {
    // if (isEmpty()) {
    // return -1;
    // }
    // int top = head.data;
    // head = head.next;
    // return top;
    // }

    // public static int peek() {
    // if (isEmpty()) {
    // return -1;
    // }
    // return head.data;
    // }

    // }

    // // with arraylist
    // static class Stack {
    // static ArrayList<Integer> list = new ArrayList<>();

    // public static boolean isEmpty() {
    // return list.size() == 0;
    // }

    // public static void push(int data) {
    // list.add(data);
    // }

    // public static int pop() {
    // if (isEmpty()) {
    // return -1;
    // }
    // int top = list.get(list.size() - 1);
    // list.remove(list.size() - 1);
    // return top;
    // }

    // public static int peek() {
    // if (isEmpty()) {
    // return -1;
    // }
    // return list.get(list.size() - 1);
    // }

    // }

    // Q. push 4 at the bottom of stack
    public static void pushBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(data, s);
        s.push(top);
    }

    // reverse stack
    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushBottom(top, s);
    }

    public static void main(String[] args) {

        // Stack s = new Stack(); //without java collection framework

        // with collection framework
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // pushBottom(4, s);
        reverse(s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();

        }

    }

}
