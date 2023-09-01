/* URL : https://leetcode.com/problems/peak-index-in-a-mountain-array/ */
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length-1, mid;
        if(arr[0] > arr[1]){
            return 0;
        } else if(arr[end] > arr[end-1]){
            return end;
        }
        while(start <= end){
            mid = start + (end - start) / 2;
            if(   (arr[mid] > arr[mid - 1])    &&    (arr[mid] > arr[mid + 1])   ){
                return mid;
            } else if(   arr[mid] < arr[mid - 1]   ){
                end = mid;
            } else{
                start = mid;
            }
        }
        return -1;
    }
}
