import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // create a set because we have duplicates 
        // create an empty array to store the missing numbers 
        // for each number to n, see if the set contains it 
        // return 
        Set <Integer> numsSet = new HashSet<Integer>();
        for (int n : nums) {
            numsSet.add(n);
        }
        List <Integer> missingNums = new ArrayList<Integer>();
        for (int i = 1; i < nums.length + 1; i++) {
            if (!numsSet.contains(i)) {
                missingNums.add(i);
            }
        }
        return missingNums;
    }
}