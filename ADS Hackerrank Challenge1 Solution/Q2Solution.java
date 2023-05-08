package HSolution;

import java.io.*;
import java.util.*;

public class Q2Solution {

    static int index = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        int re[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                System.out.print(arr[i] + " ");
            else {
                re[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.print(re[i] + " ");
        }

    }
}
