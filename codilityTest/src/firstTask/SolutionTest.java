package firstTask;

import java.util.Arrays;

import secondTask.Solution2;

public class SolutionTest {
	
	
	public static void main(String[] args){
		
		int[] a = {25, 10, 25, 10, 32};
		
		/*for(int x : a){
			System.out.println(x);
		}*/
		
		//System.out.println("Array: " + Arrays.toString(a));
		
		/*Arrays.sort(a);
		Solution sol = new Solution();
		System.out.println(a[a.length - 1]);
		System.out.println(a[0]);
		sol.solution(a);
		sol.getSmalestNumber();*/
		
		Solution2 sol2 = new Solution2();
		sol2.solution(a);
		
		
	}
	

}
