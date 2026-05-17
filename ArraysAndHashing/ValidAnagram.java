package ArraysAndHashing;

import java.util.*;

public class ValidAnagram {
    public static boolean valid(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
        }
        return map1.equals(map2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String");
        String s1 = sc.nextLine();
        System.out.println("Enter the Second String");
        String s2 = sc.nextLine();
        boolean check = valid(s1, s2);
        if (check) {
            System.out.println("Both the String are anagram of each other");
        } else {
            System.out.println("The String is not anagram of each other");
        }
        sc.close();
    }

}
