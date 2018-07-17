package firstTask;

import java.util.Arrays;
public class Solution {
	
	int[] A;
	int smalestNumber;
	
    public int solution(int[] A) {
    	
    	this.A = A;
    	Arrays.sort(A);
    	
    	if(A[A.length - 1] <= 0){
			smalestNumber = 1;
		}
    	else if(A[A.length - 1] > 0){
    		for(int i = 0; i < A.length; i++){
    	    	
    			if(A[i] > 0 && A[i] < A[A.length - 1]){
    				if(A[i] != A[i+1] && A[i] + 1 != A[i+1]){
        				smalestNumber = A[i] + 1;
        				return smalestNumber;
        			}		
        		}
    			else if(A[i] > 0 && A[i] == A[A.length - 1]){
					smalestNumber = A[i] + 1;
					return smalestNumber;
				}
        		
        	}
    	}
    	
    	
    	return smalestNumber;
    	
    }
	public void getSmalestNumber(){
		System.out.println("Array: " + Arrays.toString(A) + "Smalest number " + smalestNumber);
	}
}
/*This is a demo task.
Write a function:
    class Solution { public int solution(int[] A); }
that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [-1, -3], the function should return 1.
Assume that:
        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [-1,000,000..1,000,000].
Complexity:
        expected worst-case time complexity is O(N);
        expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
 */