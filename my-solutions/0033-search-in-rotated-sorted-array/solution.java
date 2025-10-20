class Solution {
    public int binarysearch(int[] nums,int target,int start,int end)
    {
        if(start>end)
        {
            return -1;
        }
        int mid = start + (end-start)/2;
        if(nums[mid] == target)
        {
            return mid;
        }
        else if(nums[mid]>target)
        {
            return binarysearch(nums,target,start,mid-1);
        }
        else if(nums[mid]<target)
        {
            return binarysearch(nums,target,mid+1,end);
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        int count =0;
        for(int i=1;i<n;i++)
        {
            count++;
            if(nums[i-1]>nums[i])
            {
                break;
            }
        }
        int[] arr = Arrays.copyOf(nums,nums.length);
        Arrays.sort(arr);
        int ans = binarysearch(arr,target,0,n-1);
        if(ans==-1)
        {
            return -1;
        }
        boolean max = true;
        for(int i=0;i<nums.length;i++)
        {
            if(arr[i]!=nums[i])
            {
                max = false;
            }
        }
        if(count==nums.length-1 && max)
        {
            return ans;
        }   
        return (count+ans)%n;
    }
}
