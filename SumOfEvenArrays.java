import java.util.Scanner;

public class SumOfEvenArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		System.out.print("Enter Number: ");
		n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			System.out.print("Enter Values: ");
			arr[i] = in.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < n; i++)
		{
			if (arr[i] % 2 == 0)
			{	
			  System.out.print(arr[i] + " ");
			  sum = sum + arr[i];
			}
		}
		System.out.println("Sum: " + sum);
		
		

	}

}
