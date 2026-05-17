package ArraysAndHashing;

import java.util.*;

public class ConcatenationOfArray {
    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] concatenation(int arr[]) {
        int result[] = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[(i % arr.length)];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of the Array");
        int size = sc.nextInt();
        System.out.println("Enter the Elements in the Array");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Concatenation of An Array is");
        int result[] = new int[2 * arr.length];
        result = concatenation(arr);
        display(result);
        sc.close();

    }
}
