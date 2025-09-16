class Solution {
    public int maxProduct(int[] nums) {
        int minProduct=nums[0];
        int maxProduct = nums[0];
        int Result = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<=0)
            {
                int temp=minProduct;
                minProduct=Math.min(nums[i],maxProduct*nums[i]);
                maxProduct=Math.max(nums[i],temp*nums[i]);
            }
            if(nums[i]>=0)
            {
                minProduct=Math.min(nums[i],minProduct*nums[i]);
                maxProduct=Math.max(nums[i],maxProduct*nums[i]);
            }
            Result = Math.max(Result,maxProduct);
        }
        return Result;
    }
}
