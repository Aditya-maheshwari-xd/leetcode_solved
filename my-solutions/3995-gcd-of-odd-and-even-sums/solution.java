class Solution {
    public int hcf(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return hcf(b%a,a);
    }
    public int gcdOfOddEvenSums(int n) {
        int oddsum=0,evensum=0;
        for(int i=1;i<=2*n;i++)
        {
            if(i%2==1)
            {
                oddsum = oddsum+i;
            }
            else{
                evensum=evensum+i;
            }
        }
        return hcf(oddsum,evensum);

    }
}
