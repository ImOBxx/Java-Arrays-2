import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise54 {

	
		// TODO Auto-generated method stub
		public static Boolean find_subarray_sum_zero(int[] nums)
		{
			Set set = new HashSet<>();
			set.add(0);
			int suba_sum = 0;
			for (int i = 0; i < nums.length; i++)
			{
				suba_sum += nums[i];
				if (set.contains(suba_sum)) {
					return true;
				}
				set.add(suba_sum);
			}
			return false;
		}
		public static void main (String[] args)
		{
			int[] nums1 = {1, 2, -2, 3, 4, 5, 6};
			System.out.println("Original array: " + Arrays.toString(nums1));
			
		
				}
}

