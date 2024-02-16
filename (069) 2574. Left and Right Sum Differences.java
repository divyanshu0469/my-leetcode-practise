/* URL : https://leetcode.com/problems/left-and-right-sum-differences/description/ */
class Solution {
    public int[] leftRightDifference(int[] arr) {
        int[] leftSum = new int[arr.length];
        int[] rightSum = new int[arr.length];
        int[] answer = new int[arr.length];
        //for left sum
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            leftSum[i] = left;
            left += arr[i];
        }
        //for right sum
        int right = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            rightSum[i] = right;
            right += arr[i];
        }
        //for final answer
        for (int i = 0; i < arr.length; i++) {
            answer[i] = leftSum[i] - rightSum[i];
            if (answer[i] < 0) {
                answer[i] *= -1;
            }
        }
        return answer;
    }
}
