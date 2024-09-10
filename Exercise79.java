import java.util.Arrays;

public class Exercise79 {
	public static void main(String[] args) {


		// TODO Auto-generated method stub
		String[] str_arra = {"p", "r", "s", "t"};
		System.out.printf("Original array of the elemnts: \n " + Arrays.toString(str_arra));
		String result = test(str_arra);
		System.out.printf("\nMissing letter int the said array: " + result);
}
public static String test(String[] str_arra) {
	int c = str_arra[0].charAt(0) + 1;
	for (int i = 1; i < str_arra.length; i++, c++) {
		if (str_arra[i].charAt(0) != c) {
			return String.valueOf((char) c);
		}
	}
	return "";
		
		}

	}


