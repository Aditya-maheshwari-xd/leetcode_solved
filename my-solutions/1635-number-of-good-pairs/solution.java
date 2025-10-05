class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodpairs =0;
        Arrays.sort(nums);
        int count=0;
        int left=0;
        for(int right=1;right<nums.length;right++){
            if(nums[left]==nums[right])
                {
                    count++;
                }
            else{
                goodpairs = goodpairs + (count*(count+1))/2;
                count=0;
                left=right;
            }
            
        }
        if(count!=0)
        {
            goodpairs = goodpairs + (count*(count+1))/2;
        }
        return goodpairs;
        
    }
}
