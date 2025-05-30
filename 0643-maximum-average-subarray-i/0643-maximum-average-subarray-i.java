class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (i >= k - 1) {
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
                currentSum -= nums[i - k + 1];
            }
        }

        return (double) maxSum / k;
    }
}
