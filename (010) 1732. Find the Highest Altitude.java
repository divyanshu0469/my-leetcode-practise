/* URL : https://leetcode.com/problems/find-the-highest-altitude/ */
class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] arr = new int[n];
        int max = 0;
        for(int i = 0; i < n; i++){
            max = max + gain[i];
            arr[i] = max;
        }
        max = 0;
        for(int i = 0 ; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
