class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] nums = new int[arr[arr.length-1]];
        int j=0;
        int count =0;
        for(int i=1;i<=arr[arr.length-1];i++)
        {
            if(arr[j]!=i)
            {
                count++;
                if(count == k)
                {
                    return i;
                }
            }
            else{
                j++;
            }
        }
        return arr[arr.length-1]+k-count;
    }
}
