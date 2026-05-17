package ArraysAndHashing;

import java.util.*;

public class TwoSum {

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] findSum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int value = target - arr[i];
            if (map.containsKey(value)) {
                return new int[] { map.get(value), i };
            }
            map.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        System.out.println("Enter the Target Element");
        int target = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Elements in the Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result[] = new int[2];
        result = findSum(arr, target);
        display(result);
        sc.close();
    }
}
