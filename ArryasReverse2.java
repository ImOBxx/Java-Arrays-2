import java.util.Arrays;
import java.util.Collections; 

public class ArryasReverse2 { 
    public static void main(String[] args) {
        Integer[] arr = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2}; 
        int x = arr.length;
        System.out.println(x);
        System.out.println(Arrays.toString(arr));
        
      
        System.out.println();
        
        // Sort and print sorted array
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("sorted array" + Arrays.toString(arr));
        System.out.print("Sorted Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
