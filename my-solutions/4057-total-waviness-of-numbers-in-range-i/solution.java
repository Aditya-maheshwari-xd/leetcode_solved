class Solution {
    public int waviness(int n) {
        String s = Integer.toString(n); 
        int len = s.length();
        if (len < 3) 
        {
            return 0;
        }
        int count = 0;
        for (int i = 1; i < len - 1; i++) {
            int left  = s.charAt(i - 1)-'0';
            int curr  = s.charAt(i)- '0';
            int right = s.charAt(i + 1)-'0';
            if (curr > left && curr > right) 
            {
                count++;
            }
            else if (curr < left && curr < right) 
            {
                count++;
            }
        }
        return count;
    }
    public int totalWaviness(int num1, int num2) {
        int total = 0;
        for (int i = num1; i <= num2; i++) {
            total += waviness(i);
        }
        return total;
    }
    
}

