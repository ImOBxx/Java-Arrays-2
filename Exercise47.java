public class Exercise47 {

	
		// TODO Auto-generated method stub
		static int count_rotations(int arr_int[], int n)
		{
			int min_val = arr_int[0];
			int min_index = -1;
			for(int i = 0; i < n; i++)
			{
				if (min_val > arr_int[i])
				{
					min_val = arr_int[i];
					min_index = i;
				}
			}
			return min_index;
		}
		public static void main(String[] args)
		{
			int arr_int[] = {35, 32, 30, 14, 18, 21, 27};
			int n = arr_int.length;
			System.out.println(count_rotations(arr_int, n));
			
			
		
				}
			}
	
