import java.util.Arrays;

public class Exercise72 {


		// TODO Auto-generated method stub
		
		public static int[] findUnsortedSubarray(int[] nums) {
			int[] result = new int[2];
			int n = nums.length;
			int start = -1;
			int end = -2;
			int min = nums[n - 1];
			int max = nums[0];
			for (int i = 1; i < n; i++) {
				max = Math.max(max,  nums[i]);
				min = Math.min(min, nums[n - 1 - i]);
				if (nums[i] < max) {
					end = i;
				}
				if (nums[n - 1 -i] > min) {
					end = i;
				}
				if (nums[n - 1 -i] > min) {
					start = n - 1 - i;
				}
			}
			result[0] = start;
			result[1] = end;
			return result;
		}
		public static void main(String[] args)
		{
			int[] nums1 = {1, 2, 3, 0, 4, 6};
		    System.out.printf("\nOriginal array: "+Arrays.toString(nums1));	

		    // Find and print the continuous subarray that needs sorting.
		    int[] result1 = findUnsortedSubarray(nums1);
		    System.out.printf("\nContinuous subarray:\n");
		    for (int i = result1[0]; i <= result1[1]; i++) {
		        System.out.print(nums1[i] + " ");
		    }

		    // Initialize the second array.
		    int[] nums2 = { 1, 3, 2, 7, 5, 6, 4, 8};
		    System.out.printf("\n\nOriginal array: "+Arrays.toString(nums2));	
		    System.out.printf("\nContinuous subarray:\n"); 

		    // Find and print the continuous subarray that needs sorting.
		    int[] result2 = findUnsortedSubarray(nums2);
		    
		    for (int i = result2[0]; i <= result2[1]; i++) {
		        System.out.print(nums2[i] + " ");
			}
		}
}

				
			
		
			

	
