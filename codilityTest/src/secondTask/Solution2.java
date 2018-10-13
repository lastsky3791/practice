package secondTask;

import java.util.Arrays;

public class Solution2 {
	
	String aaa = "";
	public void solution(int[] A){
		
		int highestNumber = 0;
		int counter = 0;
		for(int x = 0; x < A.length; x++){
			for(int y = 0; y < A.length; y++){
				for(int z = 0; z < A.length; z++){
					if(x != y && x != z && y != z){
						int result = A[x] * A[y] * A[z];
						char[] charNumber = String.valueOf(result).toCharArray();
						//System.out.println("Multi: " + result); //Helpful console output
						while(charNumber[charNumber.length - 1 - counter] == '0'){
							counter++;
						//System.out.println("Zero counter: " + counter); //Helpful console output
						}
						if(counter > highestNumber){
							highestNumber = counter;
						}
						counter = 0;
					}
				}
			}
		}
		if(highestNumber == 0){
			System.out.println("No trailing zeros");
		}else{
			System.out.println("Maximum number of trailing zeros: " + highestNumber);	
		}
	}

}


/*Write a function:

    class Solution { public int solution(int[] A); }

that, given an array of N positive integers, returns the maximum number of trailing zeros of the number 
obtained by multiplying three different elements from the array. Numbers are considered different if they 
are at different positions in the array.

For example, given A = [7, 15, 6, 20, 5, 10], the function should return 3 
(you can obtain three trailing zeros by taking the product of numbers 15, 20 and 10 or 20, 5 and 10).

For another example, given A = [25, 10, 25, 10, 32], the function should return 4 
(you can obtain four trailing zeros by taking the product of numbers 25, 25 and 32).

Assume that:

        N is an integer within the range [3..100,000];
        each element of array A is an integer within the range [1..1,000,000,000].

Complexity:

        expected worst-case time complexity is O(N*log(max(A)));
        expected worst-case space complexity is O(N) (not counting the storage required for input arguments).

*/