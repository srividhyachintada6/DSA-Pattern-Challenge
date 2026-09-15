//using built-in method
// Java program to delete an element from a given  
// position of an array

import java.util.*;

class delete {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>
          						(Arrays.asList(10, 20, 30, 40));
        int pos = 2;

        System.out.println("Array before deletion");
        for (int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");

        // Delete the element at the specified position
        arr.remove(pos - 1);

        System.out.println("\nArray after deletion");
        for (int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");
    }
}


//using custom method
// Java program to delete an element from a given  
// position in an array using custom method

class delete1 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        int n = arr.length;
        int pos = 2;

        System.out.println("Array before deletion");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Delete the element at the given position
        for (int i = pos; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        if (pos <= n) {
            n--;
        }

        System.out.println("\nArray after deletion");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}