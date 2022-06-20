package concepts._02Arrays;

/**
 * @author Mahesh
 * Implementation of an Array ADT
 */
public class Array {
    int arr[];
    int size;
    int length;

    Array(int size, int length) {
        this.size = size;
        this.length = length;
        this.arr = new int[size];
    }

    void display() {
        System.out.print("Array [ ");
        for (int i = 0; i < this.size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}

class Test {
    public static void main(String[] args) {
        Array adt = new Array(10, 5);
        adt.arr[0] = 15;
        adt.display();
    }
}