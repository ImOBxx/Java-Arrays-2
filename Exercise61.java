import java.util.Arrays;

public class Exercise61 {

		private static void swap_nums(int[] nums, int i, int j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
		public static void rearrange_Array_nums(int[] nums)
		{
			for (int i = 1; i < nums.length; i += 2)
			{
			if (nums[i - 1] > nums[i]) {
				swap_nums(nums, i - 1, i);
			}
			if (i + 1 < nums.length && nums[i + 1] > nums[i]) {
				swap_nums(nums, i + 1, i);
			}
			}
		}
		public static void main(String[] args)
		{
			int[] nums = {1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14};
			System.out.println("Original Array:\n" +Arrays.toString(nums));
			rearrange_Array_nums(nums);
			System.out.println("\nArray with every second element is greater than its left and right elements:\n" + Arrays.toString(nums));
			
			
		
			}
			
			}
		

