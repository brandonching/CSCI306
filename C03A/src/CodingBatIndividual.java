// Author: Brandon Ching
// C03A-2 CodingBat Individual
public class CodingBatIndividual {
	
	// Array-2 > tenRun exercise
	public int[] tenRun(int[] nums) {
		int[] newArray = new int[nums.length];
		for(int i = 0; i < nums.length; i++) {
			if((nums[i] % 10) == 0) {
				newArray[i] = nums[i];
			} else if(i > 0 && (newArray[i-1] % 10) == 0){
				newArray[i] = newArray[i-1];
			} else{
				newArray[i] = nums[i];
			}
		}
		return newArray;
	}
	/* 
	Expected	Run	
	tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]	[2, 10, 10, 10, 20, 20]	OK	
	tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]	[10, 10, 20, 20]	OK	
	tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]	[10, 10, 10, 20]	OK	
	tenRun([1, 2, 50, 1]) → [1, 2, 50, 50]	[1, 2, 50, 50]	OK	
	tenRun([1, 20, 50, 1]) → [1, 20, 50, 50]	[1, 20, 50, 50]	OK	
	tenRun([10, 10]) → [10, 10]	[10, 10]	OK	
	tenRun([10, 2]) → [10, 10]	[10, 10]	OK	
	tenRun([0, 2]) → [0, 0]	[0, 0]	OK	
	tenRun([1, 2]) → [1, 2]	[1, 2]	OK	
	tenRun([1]) → [1]	[1]	OK	
	tenRun([]) → []	[]	OK	
	other tests
	OK	
	 */


	// AP-1 > scoresIncreasing exercise
	public boolean scoresIncreasing(int[] scores) {
		for(int i = 1; i < scores.length; i++){
			if(scores[i] < scores[i-1]){
				return false;
			}
		}

		return true;
	}
	/*
	Expected	Run		
	scoresIncreasing([1, 3, 4]) → true	true	OK	
	scoresIncreasing([1, 3, 2]) → false	false	OK	
	scoresIncreasing([1, 1, 4]) → true	true	OK	
	scoresIncreasing([1, 1, 2, 4, 4, 7]) → true	true	OK	
	scoresIncreasing([1, 1, 2, 4, 3, 7]) → false	false	OK	
	scoresIncreasing([-5, 4, 11]) → true	true	OK
	 */

	
	// String-2 > repeatEnd exercise
	public String repeatEnd(String str, int n) {
		StringBuilder stringBuilder = new StringBuilder();
		for(int i = 0; i < n;i++){
			stringBuilder.append(str.substring(str.length()-n, str.length()));
		}
		return stringBuilder.toString();
	}
	/*
	Expected	Run		
	repeatEnd("Hello", 3) → "llollollo"	"llollollo"	OK	
	repeatEnd("Hello", 2) → "lolo"	"lolo"	OK	
	repeatEnd("Hello", 1) → "o"	"o"	OK	
	repeatEnd("Hello", 0) → ""	""	OK	
	repeatEnd("abc", 3) → "abcabcabc"	"abcabcabc"	OK	
	repeatEnd("1234", 2) → "3434"	"3434"	OK	
	repeatEnd("1234", 3) → "234234234"	"234234234"	OK	
	repeatEnd("", 0) → ""	""	OK	
	other tests
	OK
	 */

	
	// Array-3 > canBalance exercise
	public boolean canBalance(int[] nums) {
		int sum = 0;
		for(int i = 0; i<nums.length; i++){
			sum += nums[i];
		}

		if(sum % 2 > 0){
			return false;
		}

		int leftSum = 0;
		for(int i = 0; i<nums.length; i++){
			leftSum += nums[i];
			if (leftSum == sum/2){
				return true;
			}

		}
		return false;
	}
	/*
	Expected	Run		
	canBalance([1, 1, 1, 2, 1]) → true	true	OK	
	canBalance([2, 1, 1, 2, 1]) → false	false	OK	
	canBalance([10, 10]) → true	true	OK	
	canBalance([10, 0, 1, -1, 10]) → true	true	OK	
	canBalance([1, 1, 1, 1, 4]) → true	true	OK	
	canBalance([2, 1, 1, 1, 4]) → false	false	OK	
	canBalance([2, 3, 4, 1, 2]) → false	false	OK	
	canBalance([1, 2, 3, 1, 0, 2, 3]) → true	true	OK	
	canBalance([1, 2, 3, 1, 0, 1, 3]) → false	false	OK	
	canBalance([1]) → false	false	OK	
	canBalance([1, 1, 1, 2, 1]) → true	true	OK	
	other tests
	OK
	 */
}
