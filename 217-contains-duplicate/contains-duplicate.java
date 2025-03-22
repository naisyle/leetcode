import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> setNums = new HashSet<Integer>();
        for (int number : nums) {
            setNums.add(number);
        }
        System.out.println(setNums.size());
        return !(setNums.size() == nums.length);
    }
}