class Solution {
    public int binaryc(int start, int end, int target, int[] nums) {
        if (start > end) {
            return start; 
        }
        int mid = (start + end) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return binaryc(start, mid - 1, target, nums);
        } else {
            return binaryc(mid + 1, end, target, nums);
        }
    }
    public int searchInsert(int[] nums, int target) {
        int low =0;
        int n = nums.length;
        int high = n-1;
        int ans = binaryc(low,high,target,nums);
        return ans;
        
    }
}
