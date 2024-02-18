class Solution {
    private final int MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long odd = n / 2;
        long even = n / 2 + n % 2;
        long result = (pow(5, even) * pow(4, odd)) % MOD;
        return (int) result;
    }

    private long pow(long base, long exponent) {
        if (exponent == 0) return 1;
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exponent /= 2;
        }
        return result;
    }
}
