package firstTask;

import java.util.Arrays;

public class Solution {
	
	int[] A;
	int smalestNumber;
	
    public int solution(int[] A) {
    	
    	this.A = A;
    	Arrays.sort(A);
    	
    	//int tabLength = A.length;
    	
    	int i = 0;
    	while(A[i] + 1 == A[i+1] || A[i] == A[i+1] || A[i] <= 0){
    		i++;
    	}
    	smalestNumber = A[i] + 1;
    	while(i == A.length)
    	return smalestNumber;
    	
    }
	public void getSmalestNumber(){
		System.out.println("Array: " + Arrays.toString(A) + "Smalest number " + smalestNumber);
	}
}