class Solution {
    public int[] sortColors(int[] nums) {
        int k=0;
        int count=0;
        int n=nums.length -1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i]=temp;
                k++;
                count++;

            }
        }
        for(int i=count;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                int temp1 = nums[count];
                nums[count] = nums[i];
                nums[i] = temp1;
                count++;
            }
        }
        return nums;
    }
}
