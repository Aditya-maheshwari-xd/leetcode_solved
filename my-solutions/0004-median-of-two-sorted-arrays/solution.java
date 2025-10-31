class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array for binary search bounds
        if (nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);

        int m = nums1.length, n = nums2.length;
        int totalLeft = (m + n + 1) / 2; // size of left partition
        int lo = 0, hi = m;

        while (lo <= hi) {
            int i = lo + (hi - lo) / 2;      // cut in nums1
            int j = totalLeft - i;           // cut in nums2

            int Aleft  = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int Aright = (i == m) ? Integer.MAX_VALUE : nums1[i];
            int Bleft  = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int Bright = (j == n) ? Integer.MAX_VALUE : nums2[j];

            if (Aleft <= Bright && Bleft <= Aright) {
                // Found correct partition
                if (((m + n) & 1) == 1) {
                    return Math.max(Aleft, Bleft); // odd length
                } else {
                    int leftMax = Math.max(Aleft, Bleft);
                    int rightMin = Math.min(Aright, Bright);
                    return (leftMax + rightMin) / 2.0; // even length
                }
            } else if (Aleft > Bright) {
                hi = i - 1;   // move cut in nums1 left
            } else {
                lo = i + 1;   // move cut in nums1 right
            }
        }

        throw new IllegalArgumentException("Input arrays not sorted or invalid.");
    }
}

