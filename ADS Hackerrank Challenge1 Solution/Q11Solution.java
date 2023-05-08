package HSolution;

public class Q11Solution {
    public static void main(String[] args) {
        int arr[]={2, 4, 6, 8, 3};
        int temp;
        for(int i=1;i<arr.length;i++)
        { 
        temp=arr[i];
         int j;
            for(j=i-1;j>=0 &&arr[j]>temp;j--)
            {
                arr[j+1]=arr[j];
            }
         arr[j+1]=temp;
         
         for(int k=0;k<arr.length;k++)
         {
                 System.out.print(arr[k]+" ");
         }
           System.out.println();
        }
         for(int k=0;k<arr.length;k++)
         {
                 System.out.print(arr[k]+" ");
         }
    }
}
