class Solution {
    public int minLengthAfterRemovals(String s) {
        int arr[] = new int[2];
        for(int i=0;i<s.length();i++)
            {
                char c = s.charAt(i);
                arr[c-'a']++;
            }
        if(arr[0]-arr[1]>0)
        {
            return arr[0]-arr[1];
        }
        else
        {
            return arr[1]-arr[0];
        }
        
    }
}
