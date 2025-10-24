class Solution {
    int max = Integer.MIN_VALUE;
    int store =0;
    public int binarysearch(int[] nums,int start,int end)
    {
        if(start>end)
        {
            return -1;
        }
        if(start==end)
        {
            if(start ==0)
            {
                if(nums.length ==1 || nums[0]>nums[1])
                {
                    return 0;
                }
                else{
                    return -1;
                }
            }
            else if(start == nums.length-1)
            {
                if(nums[start]>nums[start-1])
                return start;
                else
                {
                    return -1;
                }
            }
            else
            {
                if(nums[start]>nums[start-1] && nums[start]>nums[start+1])
                {
                    return start;
                }
                else{
                    return -1;
                }
            }
        }
        int mid = start + (end - start) / 2;
        int left = binarysearch(nums, start, mid);
        if (left != -1) return left;

        int right = binarysearch(nums, mid + 1, end);
        if (right != -1) return right;

        return -1;
    }

    public int findPeakElement(int[] nums) {
        return binarysearch(nums, 0, nums.length - 1);
    }
}
