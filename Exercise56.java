import java.util.Arrays;

public class Exercise56 {

	
		// TODO Auto-generated method stub
		public static void sort_binary_nums(int[] b_nums)
		{
			int k = 0;
			for (int i = 0; i < b_nums.length; i++)
			{
				if (b_nums[i] == 0) {
					b_nums[k++] = 0;
				}
			}
			for (int i = k; i < b_nums.length; i++)
				b_nums[k++] = 1;
		}
	

	public static void main (String[] args)
	{
		int b_nums[] = {0, 1, 1, 0, 1, 1, 0, 1, 0, 0};
		System.out.println("Original Array: " + Arrays.toString(b_nums));
		sort_binary_nums(b_nums);
		System.out.println("After sorting: " + Arrays.toString(b_nums));
		
		
		
				}
			}
	
