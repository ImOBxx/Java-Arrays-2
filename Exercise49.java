import java.util.Arrays;

public class Exercise49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array_nums[] = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
		System.out.println("Original Array: " + Arrays.toString(array_nums));
		int j, temp, arr_size;
		arr_size = array_nums.length;
		for (int i = 0; i < arr_size; i++) {
		j = i;
		while((j > 0) && (array_nums[j] > 0) && (array_nums[j - 1] < 0)) {
			temp = array_nums[j - 1];
			array_nums[j] = array_nums[j - 1];
			array_nums[j - 1] = temp;
			j--;
		}
		}
		System.out.println("New Array: " + Arrays.toString(array_nums));
		}
		

	}


