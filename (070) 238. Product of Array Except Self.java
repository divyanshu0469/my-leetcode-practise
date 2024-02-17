/* URL : https://leetcode.com/problems/product-of-array-except-self/ */
class Solution {
    public int[] productExceptSelf(int[] arr) {
        
        int[] leftProduct = new int[arr.length];
        int[] rightProduct = new int[arr.length];
        int[] answer = new int[arr.length];

        //for left product
        int left = 1;
        for (int i = 0; i < arr.length; i++) {
            leftProduct[i] = left;
            left *= arr[i];
        }
        //for right product
        int right = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            rightProduct[i] = right;
            right *= arr[i];
        }
        //for final answer
        for (int i = 0; i < arr.length; i++) {
            answer[i] = leftProduct[i] * rightProduct[i];
        }
        return answer;
    }
}
