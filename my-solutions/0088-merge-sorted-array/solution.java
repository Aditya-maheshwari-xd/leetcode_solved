class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] result = new int[m+n];
       int j = 0;
       int k = 0;
       for(int i=0;i<m+n;i++)
       {
        if(j<m && k<n)
        {
            if(nums1[j]<=nums2[k])
            {
                result[i]=nums1[j];
                j++;
            }
            else
            {
                result[i]=nums2[k];
                k++;
            }
        }
        else if(j<m)
        {
            result[i]=nums1[j];
            j++;
        }
        else if (k<n)
        {
            result[i] = nums2[k];
            k++;
        }
       } 
       for(int i=0;i<m+n;i++)
       {
        nums1[i]=result[i];
       }
    }
}
