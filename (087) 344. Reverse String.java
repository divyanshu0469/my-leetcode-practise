/* URL : https://leetcode.com/problems/reverse-string/description/ */
class Solution {
    public void swap(char[] arr, int first, int second) {
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public void rev(char[] arr, int start, int end) {
        if (start > end) {
            return;
        } else {
            swap(arr, start, end);
            rev(arr, start+1, end-1);
        }
        
    }
    public void reverseString(char[] s) {
        rev(s, 0, s.length-1);
    }
    
}
