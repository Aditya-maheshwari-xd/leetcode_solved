class Solution {
    public boolean sumchecker(int[] weights,int days,int mid,int max)
    {
        if(mid<max)
        {
            return false;
        }
        int sum = mid;
        int count =0;
        for(int i=0;i<weights.length;i++)
        {
            sum = sum-weights[i];
            if(sum<0)
            {
                sum = mid-weights[i];
                count++;
            }
        }
        if(sum>=0)
        {
            count++;
        }
        if(count<=days)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public int binarysearch(int[] weights, int days,int start,int end,int max)
    {
        if(start==end)
        {
            return start;
        }
        int mid = start + (end-start)/2;
        if(sumchecker(weights,days,mid,max))
        {
            return binarysearch(weights,days,start,mid,max);
        }
        else{
            return binarysearch(weights,days,mid+1,end,max);
        }
    }
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum=0;
        for(int i=0;i<weights.length;i++)
        {
            sum = sum+weights[i];
            if(max<weights[i])
            {
                max=weights[i];
            }
        }
        return binarysearch(weights,days,max,sum,max);
                
    }
}
