class Solution {
    public boolean checker(int[] bloomDay,int day,int m,int k)
    {
        int kcount =0;
        int mcount =0;
        for(int i=0;i<bloomDay.length;i++)
        {
            if(day>=bloomDay[i])
            {
                kcount++;
            }
            else{
                kcount=0;
            }
            if(kcount == k)
            {
                mcount++;
                kcount =0;
            }
        }
        if(mcount>=m)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public int binarysearch(int[] bloomDay,int start,int end,int m,int k)
    {
        if(start==end)
        {
            return start;
        }
        int mid = start + (end-start)/2;
        if(checker(bloomDay,mid,m,k))
        {
            return binarysearch(bloomDay,start,mid,m,k);
        }
        else
        {
            return binarysearch(bloomDay,mid+1,end,m,k);
        }
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length)
        {
            return -1;
        }
        int max =0;
        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]>max)
            {
                max = bloomDay[i];
            }
        }
        int min = max;
        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]<min)
            {
                min = bloomDay[i];
            }
        }
        return binarysearch(bloomDay,min,max,m,k);
    }
}
