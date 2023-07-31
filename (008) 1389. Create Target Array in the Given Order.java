/* URL : https://leetcode.com/problems/create-target-array-in-the-given-order/ */
class Solution {
    public int[] shiftArray(int[] arr, int index, int value){
        int n = arr.length;
        int i = n-1;
        while(i > index){
            arr[i]=arr[i-1];
            i--;
        }
        arr[index] = value;
        return arr;
    }
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int target[] = new int[n];
        int a;
        int max=0;
        for (int i = 0; i<n; i++){
            a = index[i];
            if(max<a){
                target[a]= nums[i];
                max=a;
            }
            else{
                shiftArray(target, a, nums[i]);
                max++;
            }
        }
        return target;
    }
}
