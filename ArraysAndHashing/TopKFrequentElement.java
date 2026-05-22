package ArraysAndHashing;

import java.util.*;

public class TopKFrequentElement {
    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] topK(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for (int key : map.keySet()) {
            pq.add(key);
        }
        int result[] = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in an Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Kth frequent element you want in an Array");
        int k = sc.nextInt();
        int result[] = topK(arr, k);
        display(result);
        sc.close();
    }

}
