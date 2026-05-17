package ArraysAndHashing;

import java.util.*;

public class GroupAnagram {
    public static ArrayList<ArrayList<String>> group(String arr[]) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String str : arr) {
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[size];
        System.out.println("Enter the String elements in the Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();

        }
        sc.close();
    }

}
