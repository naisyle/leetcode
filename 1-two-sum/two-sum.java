import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create an empty hashmap/dictionary that contains the value and index to check 
        // if we used the number before hashmap = key, value
        // iterate through the list once where we subtract the current num from the target 
        // and check if it's in the hashmap 
        // if they add up, return the indices of the numbers 
        HashMap<Integer, Integer> seenNums = new HashMap<Integer, Integer>();
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (seenNums.containsKey(target-nums[i])) {
                indices[0] = seenNums.get(target-nums[i]);
                indices[1] = i;
                return indices;
            }
            else {
                seenNums.put(nums[i], i);
            }
        }
        return indices;
    }
}