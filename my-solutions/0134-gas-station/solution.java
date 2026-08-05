class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] sum = new int[gas.length];
        int sum_1=0;
        int index=0;
        for(int i=0;i<gas.length;i++)
        {
            sum[i]=gas[i]-cost[i];
            sum_1+=sum[i];
        }
        if(sum_1<0)
        {
            return -1;
        }
        else
        {
            sum_1=0;
        }
        for(int i=0;i<gas.length;i++)
        {
            sum_1+=sum[i];
            if(sum_1<0)
            {
                index=i+1;
                sum_1=0;
            }
        }
        return index;
    }
}
