class Solution {
    public int rob(int[] nums) {
        int[] loot = new int[nums.length-1];
        int[] loot_1 = new int[nums.length-1];
        if(nums.length==1)
        {
            return nums[0];
        }
        if(nums.length==2)
        {
            return Math.max(nums[1],nums[0]);
        }
        loot_1[0]=nums[1];
        loot_1[1]=Math.max(nums[2],nums[1]);
        loot[0]=nums[0];
        loot[1]=Math.max(nums[1],nums[0]);
        for(int i=2;i<nums.length-1;i++)
        {
            loot[i]=Math.max(loot[i-2]+nums[i],loot[i-1]);
        }
        for(int i=3;i<nums.length;i++)
        {
            loot_1[i-1]=Math.max(loot_1[i-3]+nums[i],loot_1[i-2]);
        }
        return Math.max(loot_1[nums.length-2],loot[nums.length-2]);
    }
}
