/* URL : https://leetcode.com/problems/kth-missing-positive-number/ */
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int start = 0, end = n-1, mid, missing;
        while(start <= end){
            mid = start + (end - start) / 2;
            missing = arr[mid] - (mid + 1);
            if(missing < k){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return (end + k + 1);
    }
}
