class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currentSum = 0;
        int index = 0;

        while (index < k) {
            currentSum += nums[index];
            index++;
        }

        int maxSum = currentSum;
        int i = k;

        while (i < nums.length) {
            currentSum = currentSum - nums[i - k] + nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            } else if (currentSum == maxSum) {
                // This block is optional, as equality doesn't change the max value
            }
            i++;
        }

        return (double) maxSum / k;
    }
}
