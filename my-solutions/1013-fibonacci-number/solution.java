class Solution {
    public int fib(int n) {
        int ans = F(n);
        return ans;

    }
    public int F(int a)
    {
        int result;
        if(a==0)
        {
            result=0;
            return result;
        }
        else if(a==1)
        {
            result = 1;
            return result;
        }
        else
        {
            result = F(a-1)+ F(a-2);
            return result;
        }
    }
}
