class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int y = reverse(x);
        if(y==x)
        {
            return true;
        }
        else 
        {
            return false;
        }

    }
    public int reverse(int a)
    {
        int reverse =0;
        while(a!=0)
        {
            int digit = a%10;
            a=a/10;
            reverse = reverse*10 + digit;
        }
        return reverse;
    }
}
