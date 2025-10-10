class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> hi = new ArrayList<>();
        HashMap<Integer,Integer> res = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(res.containsKey(nums[i]))
            {
                res.put(nums[i],res.get(nums[i])+1);
            }
            else
            {
                res.put(nums[i],1);
            }
            if(res.get(nums[i])>(nums.length)/3 && res.get(nums[i])-(nums.length)/3==1)
                {
                    hi.add(nums[i]);
                    res.put(nums[i],-nums.length);
                }
            }
        if(res.get(nums[nums.length-1])>(nums.length)/3 && res.get(nums[nums.length-1])-(nums.length)/3==1)
        {
            hi.add(nums[nums.length-1]);
        }
        return hi;
    }
}
