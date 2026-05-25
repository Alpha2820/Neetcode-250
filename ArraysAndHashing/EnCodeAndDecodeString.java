package ArraysAndHashing;

import java.util.*;

public class EnCodeAndDecodeString {
    public static String Encode(String arr[]) {
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            String length = Integer.toString(str.length());
            sb.append(length);
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();

    }

    public static List<String> Decode(String str) {
        List<String> result = new ArrayList<>();
        int index = 0;
        while (index < str.length()) {
            int deLimiter = str.indexOf('#', index);
            String lengthStr = str.substring(index, deLimiter);
            int length = Integer.parseInt(lengthStr);
            String actualEncodedString = str.substring(deLimiter + 1, deLimiter + 1 + length);
            result.add(actualEncodedString);
            index = deLimiter + 1 + length;
        }
        return result;
    }

    public static void display(List<String> list) {
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the String");
        int size = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLine();
        }
        String encode = Encode(arr);
        List<String> decode = Decode(encode);
        display(decode);
        sc.close();
    }

}
