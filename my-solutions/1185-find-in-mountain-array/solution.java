/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {

        int n = mountainArr.length();

        int peak = findPeak(mountainArr, n);

        int left = binarySearch(mountainArr, target, 0, peak, true);
        if(left != -1) return left;

        return binarySearch(mountainArr, target, peak + 1, n - 1, false);
    }

    private int findPeak(MountainArray arr, int n) {

        int left = 0;
        int right = n - 1;

        while(left < right){

            int mid = (left + right) / 2;

            if(arr.get(mid) < arr.get(mid + 1)){
                left = mid + 1;
            } else{
                right = mid;
            }
        }

        return left;
    }

    private int binarySearch(MountainArray arr, int target, int left, int right, boolean asc){

        while(left <= right){

            int mid = (left + right) / 2;
            int val = arr.get(mid);

            if(val == target) return mid;

            if(asc){
                if(val < target) left = mid + 1;
                else right = mid - 1;
            } else{
                if(val > target) left = mid + 1;
                else right = mid - 1;
            }
        }

        return -1;
    }
}
