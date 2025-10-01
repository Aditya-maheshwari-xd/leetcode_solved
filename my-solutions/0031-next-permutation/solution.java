class Solution {
    public void nextPermutation(int[] nums) {
        int pivot=0;
        int pos =-1;
        int pos2=0;
        for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i-1]<nums[i])
            {
                pivot = nums[i-1];
                pos = i-1; 
                break;
            }
        }
        if(pos==-1)
        {
            reverse(nums,0,nums.length-1);
            return;
        }
        int max=101;
        for(int i=nums.length-1;i>pos;i--)
        {
            if(pivot<nums[i] && nums[i]<max)
           {
                max = nums[i];
                pos2=i;
            }
        }
        int temp = nums[pos];
        nums[pos] = nums[pos2];
        nums[pos2] = temp;
        reverse(nums,pos+1,nums.length-1);
    }
    public void reverse(int[] arr,int start,int end)
    {
        int left = start;
        int right = end;
        while(left<right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
