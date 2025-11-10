class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) freq.put(c, freq.getOrDefault(c, 0) + 1);
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue())); 
        for (Map.Entry<Character,Integer> e : list) {
            char c = e.getKey();
            int count = e.getValue();
            for (int i = 0; i < count; i++) sb.append(c);
        }
        return sb.toString();
    }
}
