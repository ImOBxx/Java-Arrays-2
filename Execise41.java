
public class Execise41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 7, -8, 5, 14, 1};
		int first_element, second_element, arr_size = arr.length;
		if (arr_size < 2)
		{
			System.out.println("Array size is less than two.");
			return;
		}
		first_element = second_element = Integer.MAX_VALUE;
		for (int i = 0; i < arr_size; i++)
		{
			if (arr[i] < first_element)
			{
				second_element = first_element;
				first_element = arr[i];
			}
			else if (arr[i] < second_element && arr[i] != first_element)
				second_element = arr[i];
		}
		if (second_element == Integer.MAX_VALUE)
			System.out.println("No second smallest element.");
		else 
			System.out.println("The smallest element is " + first_element + " and the second smallest element is " + second_element + ".");
		
			
			}
		}


