package HSolution;

import java.io.*;
import java.util.*;

public class Q4Solution {
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Disk " + n + " moved from " + from_rod + " to " + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        towerOfHanoi(sc.nextInt(), 'A', 'C', 'B');
    }

}
