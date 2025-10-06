class Solution {
    public int subarraySum(int[] nums, int k) {
    Map<Integer, Integer> sumCountMap = new HashMap<>();
    sumCountMap.put(0, 1);
    int result = 0;
    int uptillSum = 0;

    for (int i = 0; i < nums.length; i++) {
      uptillSum += nums[i];
      if (sumCountMap.containsKey(uptillSum - k)) {
        result += sumCountMap.get(uptillSum - k);
      }

      sumCountMap.put(uptillSum,
          sumCountMap.getOrDefault(uptillSum, 0) + 1);
    }

    return result;
    }
}
