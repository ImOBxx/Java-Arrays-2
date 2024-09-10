import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercise38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2};
		System.out.println("Origial Array : " + Arrays.toString(nums));
		int result = MajorityElement(nums);
		if (result != -1)
			System.out.println("Majority element is " + result);
		else 
			System.out.println("MAjority element does not exist");
	}
	public static int MajorityElement(int array1[])
	{
		int n = array1.length;
		Map<Integer, Integer> map = new HashMap<Integer, integer>();
		for (int i = 0; i < n; i++)
		{
			if (map.get(array1[i]) == null)
					map.put(array1[i], 0);
			map.put(array1[i], map.get(array1[i]) + 1);
		}
		Iterator it = map.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry pair = (Map.Entry)it.next();
		if ((int)pair.getValue() > n/2)
			return (int)pair.getKey();
		it.remove();
		}
		return -1;
		}
		

	}


