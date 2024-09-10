import java.util.ArrayList;

public class Exercise37 {
	public static ArrayList<ArrayList<Integer>>diagonalEfficient(ArrayList<ArrayList<Integer>>A) {
		ArrayList<ArrayList<Integer>>result = new ArrayList<ArrayList<Integer>>();
		int m = A.size();
		int n = A.get(0).size();
		ArrayList<Integer>temp = new ArrayList<Integer>();
		temp.add(A.get(0).get(0));
		result.add(new ArrayList<Integer>(temp));
		int i = 0;
		int j = i + 1;
		while (j < n) {
			int k = i;
			int l = j;
			temp.clear();
			while (k < m && l >= 0) {
				temp.add(A.get(k).get(l));
				k++;
				l--;
			}
			result.add(new ArrayList<Integer>(temp));
			j++;
		}
		i = 1;
		j = n - 1;
		while (i < m) {
			int k = i;
			int l = j;
			temp.clear();
			while (k < m && l >= 0) {
				temp.add(A.get(k).get(l));
				k++;
				l--;
			}
			result.add(new ArrayList<Integer>(temp));
			i++;
		}
		temp.clear();
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(10);
		temp.add(20);
		temp.add(30);
		A.add(new ArrayList<Integer>(temp));
		temp.clear();
		temp.add(90);
		temp.add(100);
		temp.add(110);
		A.add(new ArrayList<Integer>(temp));
		temp.clear();
		for (ArrayList<Integer> t : A) {
				temp.clear();
				for (ArrayList<Integer> t1 : A) {
					System.out.println(t1);
				}
				ArrayList<ArrayList<Integer>> result = diagonalEfficient(A);
				for (ArrayList<Integer> t1 : result) {
					System.out.println(t1);
				}
				
				
				
		
		
		

	}

}
}
