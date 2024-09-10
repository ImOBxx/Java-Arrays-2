import java.util.Scanner;
public class Exercise19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int m, n, c, d;
			Scanner in = new Scanner(System.in);
			System.out.println("Input number of rows of the matrix");
			m = in.nextInt();
			
			System.out.println("Input number of columns of the matrix");
			n = in.nextInt();
			
			int array1[][] = new int[m][n];
			int array2[][] = new int[m][n];
			int sum[][] = new int[m][n];
			
			System.out.println("Input elements of the matrix");
			for (c = 0; c < m; c++) {
				for (d = 0; d < n; d++) {
					array1[c][d] = in.nextInt();
				}
			}
			System.out.println("Input elements of the second matrix");
			for (c = 0; c < m; c++) {
				for (d = 0; d < n; d++) {
					array2[c][d] = in.nextInt();
				}
			}
			for (c = 0; c < m; c++) {
				for (d = 0; d < n; d++) {
					sum[c][d] = array1[c][d] + array2[c][d];
				}
			}
			System.out.println("Sum of the matrices:");
			for (c =0; c < m; c++) {
				for (d = 0; d < n; d++) {
					System.out.println(sum[c][d] + "\t");
				}
				System.out.println();
			
					
				}
		}

	}

