import java.util.HashMap;
import java.util.Arrays;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // create a hashmap/dictionary that stores the (num, index=numberOfOccurences)
        // sort the nums array 
        // create empty list the size of nums 
        // for each num in sorted array, check if not in hashmap
        // if not: add (num, currentIndex); if yes: skip  
        HashMap<Integer, Integer> numDict= new HashMap<Integer, Integer>();
        int[] numOccurences = new int[nums.length];
        int[] sortedNums = Arrays.copyOf(nums, nums.length); 
        Arrays.sort(sortedNums);
        for (int i = 0; i < sortedNums.length; i++) {
            if (!numDict.containsKey(sortedNums[i])) {
                numDict.put(sortedNums[i], i);
            }
        }
        for (int j = 0; j < nums.length; j++) {
            numOccurences[j] = numDict.get(nums[j]); 
        }
        return numOccurences;
    }
}