class Solution {
    public boolean division(int[] nums,int threshold,int mid)
    {
        int count =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%mid==0)
            {
                count = count+(nums[i])/mid;
            }
            else
            {
                count = count + (nums[i])/mid +1;
            }
        }
        if(count<= threshold)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public int binarysearch(int[] nums, int threshold,int start,int end)
    {
        if(start==end)
        {
            return start;
        }
        int mid = start + (end-start)/2;
        if(division(nums,threshold,mid))
        {
            return binarysearch(nums,threshold,start,mid);
        }
        else
        {
            return binarysearch(nums,threshold,mid+1,end);
        }
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
            }
        }
        if(threshold==nums.length)
        {
            return max;
        }

        return binarysearch(nums,threshold,1,max);
    }
}
