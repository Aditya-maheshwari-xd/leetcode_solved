class Solution {
    public double powerrecu(double x, long n) {
        if (n == 0) return 1.0;

        double half = powerrecu(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public double myPow(double x, int n) {
        long N = n;           
        if (N < 0) {
            N = -N;
            return 1.0 / powerrecu(x, N);
        } else {
            return powerrecu(x, N);
        }
    }
}

