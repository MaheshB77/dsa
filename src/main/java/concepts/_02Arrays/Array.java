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
        for (int i = 0; i < this.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    void append(int number) {
        this.arr[length] = number;
        length++;
    }

    void insert(int index, int n) {
        for (int i = this.length; i >= index ; i--) {
            this.arr[i] = this.arr[i - 1];
        }
        this.arr[index] = n;
        this.length++;
    }

    void delete(int index) {
        for (int i = index; i < this.length - 1; i++) {
            this.arr[i] = this.arr[i + 1];
        }
        this.arr[this.length - 1] = 0;
        this.length--;
    }

    int search(int element) {
        for (int i = 0; i < this.length; i++) {
            if (element == this.arr[i]) {
                return i;
            }
        }
        return  -1;
    }
}

class Test {
    public static void main(String[] args) {
        Array adt = new Array(10);
        adt.append(4);
        adt.append(5);
        adt.append(2);
        adt.append(8);
        adt.insert(2, 10);
        adt.delete(1);
        System.out.println(adt.search(8));
        adt.display();
    }
}