class Solution {
    public int divide(int[] nums,int start,int end,int target)
    {
        if(start>end)
        {
            return -1;
        }
        int mid = (start+end)/2;
        if(target>nums[mid])
        {
            return divide(nums,mid+1,end,target);
        }
        else if(target==nums[mid])
        {
            return mid;
        }
        else if(target<nums[mid])
        {
            return divide(nums,start,mid-1,target);
        }
        return mid;
    }
    public int search(int[] nums, int target) {
        int ans = divide(nums,0,nums.length-1,target);
        return ans;
    }
}
