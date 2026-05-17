package ArraysAndHashing;

import java.util.*;

class MyHashSet {
    boolean[] hashset;

    public MyHashSet() {
        hashset = new boolean[100001];
    }

    public void add(int key) {
        hashset[key] = true;
    }

    public void remove(int key) {
        hashset[key] = false;
    }

    public boolean contains(int key) {
        return hashset[key];
    }

}

public class DesignHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyHashSet hashSet = new MyHashSet();
        System.out.println("Adding 1 and 2 to the hash set.");
        hashSet.add(1);
        hashSet.add(2);
        System.out.println(hashSet.contains(1));
        System.out.println(hashSet.contains(3));
        hashSet.add(2);
        System.out.println(hashSet.contains(2));
        hashSet.remove(2);
        System.out.println(hashSet.contains(2));
        sc.close();
    }

}
