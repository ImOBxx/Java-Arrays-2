import java.util.Arrays;

public class Exercise77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, -2, 5, -4, 3, -6};
		System.out.printf("\nOriginal array: " + Arrays.toString(nums));
		boolean result = test(nums);
		System.out.printf("\nCheck the said array of integers alternates between positive and negative values! " + result);
	}
	public static boolean test(int[] nums) {
		for (int n: nums) {
			if (n == 0)
				return false;
		}
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] > 0 && nums[i] > 0) {
				return false;
			}
		}
		return true;
		
			}
		}

	


