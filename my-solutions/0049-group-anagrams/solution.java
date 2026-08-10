class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            int[] count = new int[26];
            String s = strs[i];
            char[] arr = s.toCharArray();
            for(int j=0;j<arr.length;j++)
            {
                count[arr[j]-'a']++;
            }
            StringBuilder sb = new StringBuilder("");
            for(int j=0;j<26;j++)
            {
                sb.append("#");
                sb.append(count[j]);
            }
            String key = sb.toString();
            if(!ans.containsKey(key))
            {
                ans.put(key,new ArrayList());
            }
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
        
    }
}

