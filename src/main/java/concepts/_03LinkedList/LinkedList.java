package concepts._03LinkedList;

public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    void display() {
        Node node = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Data : " + node.data + ", Next : " + node.next);
        while (node.next != null) {
            node = node.next;
            System.out.println("Data : " + node.data + ", Next : " + node.next);
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.display();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.display();
    }
}
