/* URL : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/ */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int indexOne = -1, indexTwo = -1;
        for(int i = 0; i < (numbers.length-1); i++){
            if((numbers[i]*2) != target && numbers[i] == numbers[i+1]){
                    continue;
                }
            for(int j = i+1; j < (numbers.length); j++){
                
                if(numbers[i]+numbers[j]==target){
                    indexOne = i+1;
                    indexTwo = j+1;
                    break;
                }
            }
        }
        int[] arr = {indexOne, indexTwo};
        return arr;
    }
}
