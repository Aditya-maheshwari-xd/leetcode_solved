class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int current =1;
        int ans=nums[0];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                current++;
            }
            else if(nums[i]!= nums[i+1])
            {
                current=1;
            }
            if(current>count)
                {
                    count=current;
                    ans=nums[i];
                    
                }
        }
        return ans;
        
    }
}
