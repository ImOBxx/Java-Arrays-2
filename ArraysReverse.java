import java.util.Arrays;
import java.util.Collections; 
public class ArraysReverse 
{ 
    public static void main(String[] args) 
    {
		Integer[] arr = {23,5,67,20,3,30,79,3,70,2}; 
		System.out.println("Original Array : " +  Arrays(arr));
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("Sorted Array : "+Arrays(arr)); 
    }

	}

	

	