class Solution {
    public int jump(int[] nums) {
        int max_index=0;
        int target = nums.length-1;
        int total_count=0;
        int coverage =0;
        if(nums.length==1)
        {
            return 0;
        }
        for(int i=0;i<nums.length;i++)
        {
            coverage = Math.max(coverage,i+nums[i]);
            if(i==max_index)
            {
                max_index=coverage;
                total_count++;
            }
            if(max_index>=target)
            {
                return total_count;
            }
        }
        return total_count;
    }
}
