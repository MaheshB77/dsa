package concepts._03LinkedList;

public class LinkedList<T> {

    public T data;
    public LinkedList<T> next;

    LinkedList(T data) {
        this.data = data;
        this.next = null;
    }

    public void add(T data) {
        if (this.next == null) {
            this.next = new LinkedList<>(data);
        } else {
            LinkedList<T> tail = this;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = new LinkedList<>(data);
        }
    }

    // Traverse the Linked List
    public void display() {
        LinkedList<T> tail = this;
        while (tail.next != null) {
            System.out.println("data : " + tail.data + ", next : " + tail.next);
            tail = tail.next;
        }
        // Tail
        System.out.println("data : " + tail.data + ", next : " + tail.next);
    }

    // Recursive way to traverse the Linked List
    public void display(LinkedList<T> head) {
        if (head.next != null) {
            System.out.println("data : " + head.data + ", next : " + head.next);
            display(head.next);
        } else {
            // Tail
            System.out.println("data : " + head.data + ", next : " + head.next);
        }
    }

    // Counting the nodes in the linked list
    public int size() {
        int size = 1;
        LinkedList<T> head = this;
        while (head.next != null) {
            head = head.next;
            size++;
        }
        return size;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(10);
        list.add(20);
        list.add(30);
        list.display();
//        list.display(list);
        System.out.println(list.size());
    }
}
