class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            // 1) Find the row with the maximum value in column mid (O(m))
            int maxRow = 0;
            for (int r = 1; r < m; r++) {
                if (mat[r][mid] > mat[maxRow][mid]) {
                    maxRow = r;
                }
            }

            int midVal = mat[maxRow][mid];
            int leftVal  = (mid - 1 >= 0) ? mat[maxRow][mid - 1] : -1; // virtual perimeter
            int rightVal = (mid + 1 < n)  ? mat[maxRow][mid + 1] : -1; // virtual perimeter

            // 2) Check if it's a peak using left/right (top/bottom handled by "max in column")
            if (midVal > leftVal && midVal > rightVal) {
                return new int[] { maxRow, mid };
            }

            // 3) Move toward the larger neighbor horizontally
            if (leftVal > midVal) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        // Should never reach here if input meets problem constraints
        return new int[] { -1, -1 };
    }
}

