package ArraysAndHashing;

import java.util.*;

class MyHashMap {
    public int map[];

    public MyHashMap() {
        map = new int[1000001];
        Arrays.fill(map, -1);
    }

    public void put(int key, int value) {
        map[key] = value;
    }

    public int get(int key) {
        return map[key];
    }

    public void remove(int key) {
        map[key] = -1;
    }
}

public class DesignHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyHashMap hashMap = new MyHashMap();
        System.out.println("Adding (1, 1) and (2, 2) to the hash map.");
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(3));
        hashMap.put(2, 1);
        System.out.println(hashMap.get(2));
        hashMap.remove(2);
        System.out.println(hashMap.get(2));
        sc.close();
    }
}
