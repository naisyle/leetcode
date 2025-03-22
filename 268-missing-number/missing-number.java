class Solution {
    public int missingNumber(int[] nums) {
        int expectedSum = 0;
        int trueSum = 0;
        for (int i = 0; i < nums.length + 1; i++) {
            expectedSum += i;
        }
        for (int number : nums) {
            trueSum += number;
        }
        return expectedSum - trueSum;
    }
}