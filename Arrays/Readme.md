# Day 1 — Array Basic Operations

Today I started my **DSA Pattern-Based Challenge** with the fundamentals of **Arrays**.

Before moving into advanced problem-solving patterns, I’m first understanding the basic operations that are commonly performed on arrays.

---

## 1. Access Array Elements

### Definition

Array elements can be accessed using their **index**.

In Java, array indexing starts from **0**, not 1.

For example:

```text
Index:    0   1   2   3   4
Array:   [2,  4,  8, 12, 16]
```

So:

* `arr[0]` → `2`
* `arr[3]` → `12`
* `arr[4]` → `16`

### Example

```java
class Hi {
    public static void main(String[] args) {

        int[] arr = {2, 4, 8, 12, 16};

        // Accessing fourth element
        System.out.print(arr[3] + " ");

        // Accessing first element
        System.out.print(arr[0]);
    }
}
```

---

## 2. Update Array Elements

### Definition

An array element can be updated by accessing its index and assigning a **new value** using the assignment operator `=`.

### Example

```java
class hii {
    public static void main(String[] args) {

        int[] arr = {2, 4, 8, 12, 16};

        // Updating first element
        arr[0] = 90;

        System.out.println(arr[0]);
    }
}
```

### Output

```text
90
```

---

## 3. Traverse an Array

### Definition

**Array traversal** means visiting each element of an array one by one.

In Java, a `for` loop can be used to traverse an array from index `0` to `arr.length - 1`.

### Example

```java
class hi {
    public static void main(String[] args) {

        int[] arr = {2, 4, 8, 12, 16};

        // Traversing and printing array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

### Output

```text
2 4 8 12 16
```

---

## 4. Find the Size of an Array

### Definition

The **size of an array** represents the number of elements present in the array.

In Java, the built-in `length` property is used to find the size of an array.

### Example

```java
class hi {
    public static void main(String[] args) {

        int[] arr = {2, 4, 8, 12, 16};

        System.out.println("Size of array: " + arr.length);
    }
}
```

### Output

```text
Size of array: 5
```

---

# Practice Problems

After understanding the basic operations, I practiced the following problems.

---

## 5. Insert Element

### Definition

**Insertion** means adding a new element at a particular position in an array.

When an element is inserted at a specific index, the existing elements may need to be shifted to make space for the new element.

### Practice Problem

**GFG — Array Insert at Index**

🔗 [Solve on GeeksforGeeks](https://www.geeksforgeeks.org/problems/array-insert-at-index/1)

**My Solution:** `insert.java`

---

## 6. Delete Element

### Definition

**Deletion** means removing an element from an array.

When an element is deleted, the remaining elements may need to be shifted to maintain the order of the array.

### Practice Problem

**GFG — Delete Array Elements Which Are Smaller Than Next or Become Smaller**

🔗 [Solve on GeeksforGeeks](https://www.geeksforgeeks.org/problems/delete-array-elements-which-are-smaller-than-next-or-become-smaller3115/1)

**My Solution:** `delete.java`

---

## 7. Search Element

### Definition

**Searching** means finding whether a particular element exists in an array and determining its position if it is present.

For an unsorted array, a simple approach is to check the elements one by one.

### Practice Problem

**GFG — Search an Element in an Array**

🔗 [Solve on GeeksforGeeks](https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1)

**My Solution:** `seraching.java`

---

## 8. Find Minimum and Maximum Element

### Definition

Finding the **minimum and maximum** means identifying the smallest and largest elements present in an array.

A simple approach is to traverse the array while maintaining the current minimum and maximum values.

### Practice Problem

**GFG — Find Minimum and Maximum Element in an Array**

🔗 [Solve on GeeksforGeeks](https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1)

**My Solution:** `minmax.java`

---

## 9. Reverse an Array

### Definition

**Reversing an array** means changing the order of its elements so that the last element becomes the first and the first element becomes the last.

Example:

```text
Before:
[2, 4, 8, 12, 16]

After:
[16, 12, 8, 4, 2]
```

### Practice Problem

**GFG — Reverse an Array**

🔗 [Solve on GeeksforGeeks](https://www.geeksforgeeks.org/problems/reverse-an-array/1)

**My Solution:** `reverse.java`

---

## 🚀 Day 1 Completed
