import java.util.ArrayList;
import java.util.List;

public class Exercise36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1, -2, 0, 5, -1, -4};
		int target = 2;
		Exercise36 r = new Exercise36();
		System.out.println(r.threeSum(input, target));
	}
	private char[] threeSum(int[] input, int target) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<List<Integer>> my_List = threeSum(int[] nums, int target) { 
		List<List<Integer>> my_List	= new ArrayList<List<Integer>>();
	        for (int i = 0; i < nums.length; i++) {
	        	for (int j = i; j < nums.length; j++) {
	        		for (int k = j; k < nums.length; k++) {
	        			if (i != j && j != k && i != k && (nums[i] + nums[j] +nums[k] == target)) {
	        				List<Integer> inner_List = new ArrayList<Integer>(3);
	        			    inner.List.add(nums[i]);
	        			    inner.List.add(nums[j]);
	        			    inner.List.add(nums[k]);
	        			    my_List.add(inner_List);
	        		}
	        		
	        	}
	        	
	        }
	}
	return my_List;
	        		}
	        	}
	       
