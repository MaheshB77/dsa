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

    int length() {
        return this.length;
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

    int binarySearch(int element) {
        int low = arr[0];
        int high = this.length - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (this.arr[mid] == element) {
                return mid;
            } else if (element < this.arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = (low + high) / 2;
        }
        return -1;
    }

    void reverse() {
        for (int i = 0, j = length()-1 ; i < length()/2; i++, j--) {
            System.out.println(arr[i] + ", " + arr[j]);
            int temp = this.arr[i];
            this.arr[i] = arr[j];
            this.arr[j] = temp;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Array adt = new Array(10);
        adt.append(2);
        adt.append(3);
        adt.append(4);
        adt.append(5);
        adt.append(8);
        adt.append(10);
        adt.append(11);
        System.out.println("Linear search => " + adt.search(8));
        System.out.println("Binary search => " + adt.binarySearch(8));
        adt.display();
        System.out.println("Length :: " + adt.length());
        adt.reverse();
        adt.display();
    }
}