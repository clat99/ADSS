package HSolution;

import java.io.*;
import java.util.*;

public class Q3Solution {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      StringTokenizer st;

      while (sc.hasNextLine()) {
         String s = sc.nextLine();
         st = new StringTokenizer(s, "{}, ");
         int[] arr = new int[st.countTokens()];
         int i = 0;
         while (st.hasMoreTokens() && i < arr.length) {
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
         }
         int maxNum = Integer.MIN_VALUE;

         for (int j = 0; j < arr.length; j++)
            maxNum = Math.max(maxNum, arr[j]);
         System.out.println(maxNum);
      }
   }
}
