class Solution {
    public int maxSubArray(int[] nums) {
        int CurrentSum=nums[0];
        int SumSoFar = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(CurrentSum<0)
            {
                CurrentSum=0;
            }
            CurrentSum+=nums[i];
            if(CurrentSum>SumSoFar)
            {
                SumSoFar = CurrentSum;
            }
        }
        return SumSoFar;
    }
}
