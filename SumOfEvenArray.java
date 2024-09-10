import java.util.Scanner;

public class SumOfEvenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter Number: ");
        n = in.nextInt();
        int arr[] = new int[n]; // Initialize the array with size n
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Value: ");
            arr[i] = in.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum: " + sum);

	}

}
