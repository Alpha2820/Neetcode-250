package ArraysAndHashing;

import java.util.*;

public class ContainsDuplicate {
    public static boolean containsDupli(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size = sc.nextInt();
        System.out.println("Enter the Element in an Array");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean check = containsDupli(arr);
        if (check) {
            System.out.println("The Array contains duplicates");
        } else {
            System.out.println("The Array doesn't contains duplicates");
        }
        sc.close();
    }

}
