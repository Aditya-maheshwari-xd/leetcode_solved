class Solution {
    int min = Integer.MAX_VALUE;
    public int divide(int[] nums,int start,int end)
    {

        if(start==end)
        {
            if(nums[start]<min)
            {
                min = nums[start];
            }
            return min;
        }
        int mid = start + (end-start)/2;
        divide(nums,start,mid);
        divide(nums,mid+1,end);
        return min;
    }
    public int findMin(int[] nums) {
        int ans = divide(nums,0,nums.length-1);
        return ans;
    }
}
