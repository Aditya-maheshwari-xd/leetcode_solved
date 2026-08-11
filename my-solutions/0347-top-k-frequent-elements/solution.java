class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> result = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(result.containsKey(nums[i]))
            {
                result.put(nums[i], result.get(nums[i]) + 1);
            }
            else
            {
                result.put(nums[i],1);
            }
        }
        int[] values = new int[result.size()];
        int i = 0;
        Iterator<Integer> it = result.values().iterator();
        while (it.hasNext()) {
            values[i] = it.next();
            i++;
            }
        Arrays.sort(values);

        int[] ans = new int[k];

        int j = 0;

        while(j < k)
        {
            int frequency = values[values.length - 1 - j];

            Iterator<Integer> it2 = result.keySet().iterator();

            while(it2.hasNext())
            {
                int key = it2.next();

                if(result.get(key) == frequency)
                {
                    ans[j] = key;
                    result.remove(key);
                    break;
                }
            }

            j++;
        }

        return ans;
    }
}

