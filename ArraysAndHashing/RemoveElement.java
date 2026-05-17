package ArraysAndHashing;

import java.util.*;

public class RemoveElement {
    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int findLength(int arr[], int value) {
        // int result[] = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                arr[index++] = arr[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Value");
        int val = sc.nextInt();
        System.out.println("The length of the arr is" + findLength(arr, val));
        sc.close();

    }

}
