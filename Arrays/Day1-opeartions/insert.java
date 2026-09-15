//using custom method 
// Java program to insert given element at a given position
// in an array using custom method

class ffff {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {10, 20, 30, 40, 0};
        int ele = 50;
        int pos = 2;
        System.out.println("Array before insertion");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        // Shifting elements to the right
        for (int i = n; i >= pos; i--)
            arr[i] = arr[i - 1];

        // Insert the new element at index pos - 1
        arr[pos - 1] = ele;

        System.out.println("\nArray after insertion");
        for (int i = 0; i <= n; i++)
            System.out.print(arr[i] + " ");
    }
}

//using built-in method
// Java program to insert given element at a given position
// in an array using in-built methods
/* 
import java.util.ArrayList;
import java.util.Arrays;

class GfG {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new 
          			ArrayList<>(Arrays.asList(10, 20, 30, 40));
        int ele = 50;
        int pos = 2;
        System.out.println("Array before insertion");
        for (int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");

        // Insert element at the given position
        arr.add(pos - 1, ele);

        System.out.println("\nArray after insertion");
        for (int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");
    }
}
    */