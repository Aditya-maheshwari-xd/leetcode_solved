class Solution {
    public int[] productExceptSelf(int[] nums) {
        int k = nums.length;
        int [] left = new int[k];
        int [] right = new int[k];
        int [] output = new int[k];
        left[0]=1;
        right[k-1]=1;
        for(int i=1;i<k;i++)
        {
            left[i]=left[i-1]*nums[i-1];
        }
        for(int i=k-2;i>=0;i--)
        {
            right[i] = right[i+1]*nums[i+1];
        }
        for(int i=0;i<k;i++)
        {
            output[i]=left[i]*right[i];
        }
        return output;
    }
}
