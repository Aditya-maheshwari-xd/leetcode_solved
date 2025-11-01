class Solution {
    public boolean colgreater(int[][] matrix,int target ,int mid , int col)
    {
        if(matrix[mid][col-1]>=target)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int binarysearch(int[][] matrix , int target,int start,int end,int col)
    {
        if(start>end)
        {
            return -1;
        }
        if(start==end)
        {
            return start;
        }
        int mid = start + (end-start)/2;
        if(colgreater(matrix,target,mid,col))
        {
            return binarysearch(matrix,target,start,mid,col);
        }
        else
        {
            return binarysearch(matrix,target,mid+1,end,col);
        }
    }
    public boolean rowgreater(int[][] matrix,int target ,int mid , int prev)
    {
        if(matrix[prev][mid]==target)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int binarysearch1(int[][] matrix , int target,int start,int end,int prev)
    {
        if(start>end)
        {
            return -1;
        }
        int mid = start + (end-start)/2;
        if(rowgreater(matrix,target,mid,prev))
        {
            return 1;
        }
        else if(matrix[prev][mid]>target)
        {
            return binarysearch1(matrix,target,start,mid-1,prev);
        }
        else
        {
            return binarysearch1(matrix,target,mid+1,end,prev);
        }
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int prev = binarysearch(matrix,target,0,row-1,col);
        if(prev==-1)
        {
            return false;
        }
        int ans = binarysearch1(matrix,target,0,col-1,prev);
        if(ans==-1)
        {
            return false;
        }
        else{
            return true;
            }
    }
}
