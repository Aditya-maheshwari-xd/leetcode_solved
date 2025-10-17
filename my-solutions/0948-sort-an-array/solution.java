class Solution {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length <= 1) return nums;
        divide(nums, 0, nums.length - 1);
        return nums;
    }

    private void divide(int[] a, int start, int end) {
        if (start >= end) return;
        int mid = start + (end - start) / 2;
        divide(a, start, mid);
        divide(a, mid + 1, end);
        merge(a, start, mid, end);
    }

    private void merge(int[] a, int start, int mid, int end) {
        int n1 = mid - start + 1; 
        int n2 = end - mid;       

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = a[start + i];
        for (int j = 0; j < n2; j++) R[j] = a[mid + 1 + j];

        int i = 0, j = 0, k = start;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) a[k++] = L[i++];
            else              a[k++] = R[j++];
        }
        while (i < n1) a[k++] = L[i++];
        while (j < n2) a[k++] = R[j++];
    }
}

