class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int minTime = 0;
        int i = 0;
        while (i < points.length - 1) {
            minTime += Math.max(Math.abs(points[i+1][1] - points[i][1]), Math.abs(points[i+1][0] - points[i][0]));
            i++;
        }
        return minTime;       
    }
}