import java.util.Arrays;

public class Exercise44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {6, 7, 9, 16, 25, 12, 30, 40};
		int n = nums.length;
		System.out.println("Original Array : " + Arrays.toString(nums));
		Arrays.sort(nums);
		int ctr = 0;
		for (int i = 0; i < n - 2; i++)
		{
			int x = i + 2;
			for (int j = i + 1; j < n; ++j)
			{
				while (x < n && nums[i] + nums[j] > nums[x])
					++x;
				ctr += x - j - 1;
			}
		}
		System.out.println("Total number of triangles: " + ctr);
			}
		}

	
