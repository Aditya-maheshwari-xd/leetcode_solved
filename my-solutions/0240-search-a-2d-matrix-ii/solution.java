class Solution {
    public int binarysearch(int[][] matrix ,int i ,int start,int end ,int target)
    {
        if(start>end)
        {
            return -1;
        }
        int mid = start + (end-start)/2;
        if(matrix[i][mid]>target)
        {
            return binarysearch(matrix,i,start,mid-1,target);
        }
        else if(matrix[i][mid]<target)
        {
            return binarysearch(matrix,i,mid+1,end,target);
        }
        else 
        {
            return 1;
        }
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int ans=0;
        int i=0;
        while(i<row)
        {
            ans = binarysearch(matrix,i,0,col-1,target);
            if(ans==1)
            {
                return true;
            }
            i++;
        }
        return false;
    }
}
