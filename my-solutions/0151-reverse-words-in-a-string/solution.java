class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" +");
        StringBuilder a = new StringBuilder();
        for(int i=words.length-1;i>=0;i--)
        {
            a.append(words[i]);
            a.append(" ");
        }
        return a.toString().trim();
    }
}
