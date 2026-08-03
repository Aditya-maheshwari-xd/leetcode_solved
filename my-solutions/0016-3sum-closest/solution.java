class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int left=0;
        int right=0;
        int currsum = nums[0]+nums[1]+nums[2];
        int newsum=0;
        for(int i=0;i<nums.length-2;i++)
        {
            left=i+1;
            right=nums.length-1;
            while(right>left)
            {
                newsum = nums[i]+nums[left]+nums[right];
                if(Math.abs(currsum-target)>Math.abs(newsum-target))
                {
                    currsum = newsum;
                }
                if(newsum>target)
                {
                    right--;
                }    
                else
                {
                    left++;
                }
            }
        }
        return currsum;
    }
}
