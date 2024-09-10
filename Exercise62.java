import java.util.Arrays;

public class Exercise62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-7, 1, 5, 2, -4, 3, 0};
		System.out.println("Original array: " + Arrays.toString(nums));
		equilibrium_indices(nums);
	}
	public static void equilibrium_indices(int[] nums) {
		int totalSum = 0;
		for (int n : nums) {
			totalSum += n;
		}
		int runningSum = 0;
		for (int i = 0; i < nums.length; i++) {
			int n = nums[i];
			if (totalSum - runningSum - n == runningSum) {
				System.out.println("Equilibrium inidces found at: " + i);
			}
			runningSum += n;
			
			}
		}
	

	}


