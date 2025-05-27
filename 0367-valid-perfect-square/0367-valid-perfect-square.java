class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;
        return binarySearch(num, 2, num / 2);
    }

    private boolean binarySearch(int num, int left, int right) {
        if (left > right) return false;
        int mid = left + (right - left) / 2;
        long square = (long) mid * mid;
        if (square == num) return true;
        else if (square < num) return binarySearch(num, mid + 1, right);
        else return binarySearch(num, left, mid - 1);
    }
}
