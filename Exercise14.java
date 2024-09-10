import java.util.Arrays;
import java.util.HashSet;

public class Exercise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
		String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PortugeseSQL", "DB2", "JAVA"};
		System.out.println("Array1 : " + Arrays.toString(array1));
		System.out.println("Array2 ; " + Arrays.toString(array2));
		HashSet set = new HashSet();
		for(int i = 0; i < array1.length; i++) {
			for (int j = 0 ; j < array2.length; j++) {
				if (array1[i].equals(array2[j])) {
					set.add(array1[i]);
				}
			}
		}
		System.out.println("Common elelment : " + (set));

	}

}
