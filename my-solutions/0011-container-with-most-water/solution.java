class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right=height.length-1;
        int result =0;
        int ans =0;
        while(left<right)
        {
            result = Math.min(height[left],height[right])*(right-left);
            if(result>ans)
            {
                ans = result;
            }
            if(height[left]>height[right])
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return ans;
    }
}
