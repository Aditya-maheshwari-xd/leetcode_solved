class Solution {
    long MOD = 1000000007;

    // fast power: computes (x^n) % MOD in O(log n)
    long power(long x, long n) {
        long result = 1;
        x %= MOD;

        while (n > 0) {
            if ((n & 1) == 1) {   // if n is odd
                result = (result * x) % MOD;
            }
            x = (x * x) % MOD;   // square the base
            n >>= 1;             // divide n by 2
        }
        return result;
    }

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;   // positions with 5 choices
        long odd  = n / 2;         // positions with 4 choices

        long part1 = power(5, even);
        long part2 = power(4, odd);

        return (int)((part1 * part2) % MOD);
    }
}

