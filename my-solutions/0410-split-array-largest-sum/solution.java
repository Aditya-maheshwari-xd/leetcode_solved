class Solution {
    public boolean sumcheck(int[] nums , int k , int mid)
    {
        int sum = mid;
        int count =0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum-nums[i];
            if(sum<0)
            {
                count++;
                sum=mid-nums[i];
            }
        }
        if(sum>=0)
        {
            count++;
        }
        if(count<=k)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int binarysearch(int[] nums,int k ,int start,int end)
    {
        if(start==end)
        {
            return start;
        }
        int mid = start + (end-start)/2;
        if(sumcheck(nums,k,mid))
        {
            return binarysearch(nums,k,start,mid);
        }
        else
        {
            return binarysearch(nums,k,mid+1,end);
        }
    }
    public int splitArray(int[] nums, int k) {
        int max=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum = sum+nums[i];
            if(max<nums[i])
            {
                max=nums[i];
            }
        }
        return binarysearch(nums,k,max,sum);
    }
}
