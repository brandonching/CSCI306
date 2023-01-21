// Authors: Walter Moy and Brandon Ching
// CodingBat (Pair) exercise
public class CodingBatPair {

	public static boolean evenlySpaced(int a, int b, int c) {
		if(a == b && b == c){
			return true;
		} else if(Math.abs(c-b) == Math.abs(a-b) && a!=c) { // b is middle
			return true;  
		} else if(Math.abs(b-c) == Math.abs(a-c) && b!=a) { // c is middle
			return true;
		} else if(Math.abs(b-a) == Math.abs(c-a) && b!=c) { // a is the middle
			return true;  
		} else {
			return false;
		}
	}

	/*
      Expected This Run  
      evenlySpaced(2, 4, 6) → true  true  OK    
      evenlySpaced(4, 6, 2) → true  true  OK    
      evenlySpaced(4, 6, 3) → false false OK    
      evenlySpaced(6, 2, 4) → true  true  OK    
      evenlySpaced(6, 2, 8) → false false OK    
      evenlySpaced(2, 2, 2) → true  true  OK    
      evenlySpaced(2, 2, 3) → false false OK    
      evenlySpaced(9, 10, 11) → true      true  OK    
      evenlySpaced(10, 9, 11) → true      true  OK    
      evenlySpaced(10, 9, 9) → false      false OK    
      evenlySpaced(2, 4, 4) → false false OK    
      evenlySpaced(2, 2, 4) → false false OK    
      evenlySpaced(3, 6, 12) → false      false OK    
      evenlySpaced(12, 3, 6) → false      false OK    
      other tests       OK    
	 */

	public static String plusOut(String str, String word) {
		String first = str.replace(word, "?");
		String second = first.replaceAll("[^?]", "+");
		String third = second.replace("?", word);
		return third;
	}

	/*
      Expected This Run  
      plusOut("12xy34", "xy") → "++xy++"  "++xy++"    OK    
      plusOut("12xy34", "1") → "1+++++"   "1+++++"    OK    
      plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"      "++xy++xy+++xy"   OK    
      plusOut("abXYabcXYZ", "ab") → "ab++ab++++"      "ab++ab++++"      OK    
      plusOut("abXYabcXYZ", "abc") → "++++abc+++"     "++++abc+++"      OK    
      plusOut("abXYabcXYZ", "XY") → "++XY+++XY+"      "++XY+++XY+"      OK    
      plusOut("abXYxyzXYZ", "XYZ") → "+++++++XYZ"     "+++++++XYZ"      OK    
      plusOut("--++ab", "++") → "++++++"  "++++++"    OK    
      plusOut("aaxxxxbb", "xx") → "++xxxx++"    "++xxxx++"  OK    
      plusOut("123123", "3") → "++3++3"   "++3++3"    OK    
      other tests       OK    
	 */

	public static int countClumps(int[] nums) {
		int count = 0;
		boolean start = true;
		for(int i = 0; i < nums.length-1; i++) {
			if(nums[i] == nums[i+1] && start) {
				count++;
				start = false;
			} else if(nums[i] != nums[i+1] && !start){
				start = true;
			}
		}
		return count;
	}

	/*
      Expected This Run  
      countClumps([1, 2, 2, 3, 4, 4]) → 2 2     OK    
      countClumps([1, 1, 2, 1, 1]) → 2    2     OK    
      countClumps([1, 1, 1, 1, 1]) → 1    1     OK    
      countClumps([1, 2, 3]) → 0    0     OK    
      countClumps([2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 4 4     OK    
      countClumps([0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 4    4     OK    
      countClumps([0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 5 5     OK    
      countClumps([0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 5    5     OK    
      countClumps([]) → 0     0     OK    
      other tests       OK    
	 */

	public static int[] fix34(int[] nums) {
		int[] newArray = new int[nums.length];
		int[] tempArray = new int[nums.length];
		int idx = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 3) {
				newArray[i] = nums[i];
				newArray[i+1] = 4;
			} else if(nums[i] != 4) {
				tempArray[idx++] = nums[i];
			}
		}  
		idx = 0;
		for(int i = 0; i < nums.length; i++){
			if(newArray[i] == 0){
				newArray[i] = tempArray[idx++];
			}
		}
		return newArray;
	}

	/*
      Expected This Run  
      fix34([1, 3, 1, 4]) → [1, 3, 4, 1]  [1, 3, 4, 1]      OK    
      fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]  [1, 3, 4, 1, 1, 3, 4]   OK    
      fix34([3, 2, 2, 4]) → [3, 4, 2, 2]  [3, 4, 2, 2]      OK    
      fix34([3, 2, 3, 2, 4, 4]) → [3, 4, 3, 4, 2, 2]  [3, 4, 3, 4, 2, 2]      OK    
      fix34([2, 3, 2, 3, 2, 4, 4]) → [2, 3, 4, 3, 4, 2, 2]  [2, 3, 4, 3, 4, 2, 2]   OK    
      fix34([5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5]) → [5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4]  [5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4]      OK    
      fix34([3, 1, 4]) → [3, 4, 1]  [3, 4, 1]   OK    
      fix34([3, 4, 1]) → [3, 4, 1]  [3, 4, 1]   OK    
      fix34([1, 1, 1]) → [1, 1, 1]  [1, 1, 1]   OK    
      fix34([1]) → [1]  [1]   OK    
      fix34([]) → []    []    OK    
      fix34([7, 3, 7, 7, 4]) → [7, 3, 4, 7, 7]  [7, 3, 4, 7, 7]   OK    
      fix34([3, 1, 4, 3, 1, 4]) → [3, 4, 1, 3, 4, 1]  [3, 4, 1, 3, 4, 1]      OK    
      fix34([3, 1, 1, 3, 4, 4]) → [3, 4, 1, 3, 4, 1]  [3, 4, 1, 3, 4, 1]      OK
      other tests       OK    
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(evenlySpaced(2, 4, 6));
		System.out.println(plusOut("12xy34", "xy"));
		int[] arr;
		arr = new int[6];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		arr[5] = 4;
		System.out.println(countClumps(arr));
		int[] arr34;
		arr34 = new int[3];
		arr34[0] = 1;
		arr34[1] = 3;
		arr34[2] = 1;
		arr34[3] = 4;
		System.out.println(fix34(arr34));
	}

}