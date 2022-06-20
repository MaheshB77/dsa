package concepts._02Arrays;

/**
 * @author Mahesh
 * Implementation of an Array ADT
 */
public class Array {
    private int arr[];
    private int size;
    private int length = 0;

    Array(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    void display() {
        System.out.print("Array [ ");
        for (int i = 0; i < this.size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    void append(int number) {
        this.arr[length] = number;
        length++;
    }
}

class Test {
    public static void main(String[] args) {
        Array adt = new Array(10);
        adt.append(10);
        adt.append(20);
        adt.display();
    }
}