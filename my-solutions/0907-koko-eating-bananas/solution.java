class Solution {
    public boolean hourcheck(int[]piles,int num,int h)
    {
        int total =0;
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i]%num==0)
            {
                total = total + piles[i]/num;
            }
            else
            {
                total = total + piles[i]/num +1;
            }
        }
        if(total<=h)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int binarysearch(int[] piles,int start,int end,int h)
    {
        if(start==end)
        {
            return start;
        }
        int mid = start + (end-start)/2;
        if(hourcheck(piles,mid,h))
        {
            return binarysearch(piles,start,mid,h);
        }
        else
        {
            return binarysearch(piles,mid+1,end,h);
        }

    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0;i<piles.length;i++)
        {
            if(max<piles[i])
            {
                max = piles[i];
            }
        }
        int ans = binarysearch(piles,1,max,h);
        return ans;
    }
}
