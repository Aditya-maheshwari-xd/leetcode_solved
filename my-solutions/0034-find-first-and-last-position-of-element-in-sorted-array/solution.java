class Solution {
    public int divide(int[] nums,int start,int end,int target)
    {
        if(start>end)
        {
            return -1;
        }
        int mid = start + (end-start)/2;
        if(nums[mid]>target)
        {
            return divide(nums,start,mid-1,target);
        }
        else if(nums[mid]<target){
            return divide(nums,mid+1,end,target);
        }
        return mid;
    }
    public int[] searchRange(int[] nums, int target) {
        int anskekareeb= divide(nums,0,nums.length-1,target);
        int s = anskekareeb, e = anskekareeb;
        int[] arr = new int[2];
        if(s == - 1)
        {
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        while(s>=0 && nums[s]== target )
        {
            s--;
        }
        while(e<nums.length && nums[e]==target )
        {
            e++;
        }
        arr[0]=s+1;
        arr[1]=e-1;
        return arr;
    }
}
