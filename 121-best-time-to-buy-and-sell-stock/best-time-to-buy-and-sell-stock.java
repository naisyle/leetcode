class Solution {
    public int maxProfit(int[] prices) {
        // use of two pointers in an array solution (greedy algorithm)
        int leftP = 0;
        int rightP = 1;
        int currProfit = 0;
        int maxProfit = 0;
        while (rightP < prices.length) {
            if (prices[leftP] < prices[rightP]) {
                currProfit = prices[rightP] - prices[leftP];
                maxProfit = Math.max(maxProfit, currProfit);
            }
            else {
                leftP = rightP;
            }
            rightP++;
        }
        return maxProfit;
    }
}