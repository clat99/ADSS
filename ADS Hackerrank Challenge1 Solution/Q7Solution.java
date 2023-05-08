package HSolution;

public class Q7Solution {
    public static void main(String[] args) {

        int[] arr = { 0, 1, 2, 6, 9, 11, 15 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count != arr[i]) {
                System.out.println("The smallest missing element is " + count);
                break;
            }
            count++;
        }
    }
}
