import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {50, 10, 40, 30, 20};
        // int[] descArr = {50, 10, 40, 30, 20};

        // Sort the array in ascending order
        Arrays.sort(arr);

        // int[] descArr = arr.clone(); 
        // Arrays.sort(descArr,Collections.reverseOrder());

        System.out.println("Sorted Array in Ascending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // System.out.println("Sorted Array in decending Order:");
        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }
    }
}


