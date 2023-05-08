package HSolution;

import java.io.*;
import java.util.*;

public class Solution {
    public static double sumOfSeries(float n) {
        if (n == 1) 
        {
            return 1.0;
        } else 
        {
            if(n%2==0) 
            {
                return (float)sumOfSeries(n-1)-(1/n);
            }
            else
            { 
                return (float)sumOfSeries(n-1)+(1/n);
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(sumOfSeries(sc.nextInt()));
        
    }
        
}
}