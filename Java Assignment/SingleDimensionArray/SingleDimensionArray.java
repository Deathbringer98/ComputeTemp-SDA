package SingleDimensionArray;

import java.util.Arrays;

public class SingleDimensionArray {
  private int[] arr;

  // Constructor to initialize the array
  public SingleDimensionArray(int size) {
    arr = new int[size];
    Arrays.fill(arr, Integer.MIN_VALUE); // Fill array with MIN_VALUE
  }

  // Method to insert a value at a specified location
  public void insertValue(int index, int value) {
    try {
      if (arr[index] == Integer.MIN_VALUE) {
        arr[index] = value;
        System.out.println("Insertion successful at index " + index);
      } else {
        System.out.println("Index " + index + " is already occupied.");
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid index: " + e.getMessage());
    }
  }

  // Method to traverse and print a specific index value
  public void printValue(int index) {
    try {
      System.out.println("Value at index " + index + ": " + arr[index]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid index: " + e.getMessage());
    }
  }

  // Method to delete value at a specific index or reset the entire array
  public void deleteValue(int index, boolean deleteAll) {
    try {
      if (deleteAll) {
        Arrays.fill(arr, Integer.MIN_VALUE);
        System.out.println("All array values have been reset.");
      } else {
        arr[index] = Integer.MIN_VALUE;
        System.out.println("Value at index " + index + " has been reset.");
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid index: " + e.getMessage());
    }
  }

  // Method to search for an element in the array
  public void searchValue(int value) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == value) {
        System.out.println("Element " + value + " found at index " + i);
        return;
      }
    }
    System.out.println("Element " + value + " not found in the array.");
  }

  // Main method to test the class functionality
  public static void main(String[] args) {
    SingleDimensionArray myArray = new SingleDimensionArray(5);
    myArray.insertValue(0, 10);
    myArray.insertValue(1, 20);
    myArray.insertValue(2, 30);
    myArray.insertValue(3, 40);
    myArray.insertValue(4, 50);

    System.out.println("Array: " + Arrays.toString(myArray.arr));

    myArray.printValue(0);
    myArray.printValue(1);

    myArray.deleteValue(1, false);
    System.out.println("Array after deleting index 1: " + Arrays.toString(myArray.arr));

    myArray.deleteValue(0, true);
    System.out.println("Array after resetting: " + Arrays.toString(myArray.arr));

    myArray.insertValue(0, 100);
    myArray.insertValue(1, 200);
    myArray.searchValue(100);
    myArray.searchValue(200);
    myArray.searchValue(300);
  }
}
