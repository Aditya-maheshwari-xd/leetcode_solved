class Solution {
    public int rob(int[] nums) {
        int[] loot = new int[nums.length];
        loot[0]=nums[0];
        if(nums.length>1)
        {
            loot[1]=Math.max(nums[1],nums[0]);
        }
        for(int i=2;i<nums.length;i++)
        {
            loot[i]= Math.max(loot[i-2]+nums[i],loot[i-1]);
        }
        return loot[nums.length-1];
    }
}
