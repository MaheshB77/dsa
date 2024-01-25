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

    void append(int data) {
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

    void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void deleteAt(int position) {
        int counter = 1;
        Node temp = this.head;
        Node prev = this.head;
        while (counter != position) {
            counter++;
            prev = temp;
            temp = temp.next;
            if (temp == null) {
                break;
            }
        }
        if (temp == null) {
            System.out.println("Position is out of bound");
            return;
        }
        prev.next = temp.next;
        temp.next = null;
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
        list.append(5);
        list.append(10);
        list.append(15);
        list.insertAtStart(20);
        list.display();

        list.deleteAt(3);
        System.out.println("Deleted node at position 3");
        list.display();
    }
}
