package HSolution;
import java.io.*;
import java.util.*;

public class Q5Solution {
    

    public static void sum(int arr[],int sum){
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])==sum){
                    System.out.println("Pair found ("+arr[i]+","+arr[j]+")");
                    return;
                }
                }
        }
        System.out.println("Pair not found");
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int arr[]={5, 2, 6, 8, 1, 9};
        int sum=12;
        
        sum(arr,sum);
        
    }
}