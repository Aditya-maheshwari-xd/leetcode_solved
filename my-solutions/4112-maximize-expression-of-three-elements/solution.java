class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int max =-101;
        int min=101;
        for(int i=0;i<nums.length;i++)
            {
                if(nums[i]>max)
                {
                    max=nums[i];
                }
                if(nums[i]<min)
                {
                    min= nums[i];
                }
            }
        int max2=-101;
        int count =0;
        for(int i=0;i<nums.length;i++)
            {
                if(max==nums[i] && count==0)
                {
                    nums[i]=-101;
                    count++;
                }
                if(max2<nums[i])
                {
                    max2=nums[i];
                }
            }
        return max+max2-min;
    }
}
