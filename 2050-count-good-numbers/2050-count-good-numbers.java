class Solution {
    private static final long MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2; // positions at even indices
        long oddCount = n / 2;        // positions at odd indices

        long pow5 = modPow(5, evenCount, MOD); // 5 options for even positions
        long pow4 = modPow(4, oddCount, MOD);  // 4 options for odd positions

        return (int)((pow5 * pow4) % MOD);
    }

    // Fast exponentiation: (base^exp) % mod
    private long modPow(long base, long exp, long mod) {
        long result = 1;
        base %= mod;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }

        return result;
    }
}
