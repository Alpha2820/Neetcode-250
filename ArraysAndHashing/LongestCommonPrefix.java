package ArraysAndHashing;

import java.util.*;

public class LongestCommonPrefix {
    public static void display(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static String LCP(String arr[]) {
        String prefix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            String value = arr[i];
            int left = 0;
            while (left < prefix.length() && left < value.length()) {
                if (prefix.charAt(left) == value.charAt(left)) {
                    left++;
                } else {
                    break;
                }
            }
            prefix = prefix.substring(0, left);
            if (prefix.equals("")) {
                return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[size];
        System.out.println("Enter the String Elements in the Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLine();
        }
        display(arr);
        sc.close();
    }

}
