/* URL : https://leetcode.com/problems/valid-anagram/description/ */
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray(); Arrays.sort(arr1);
        char[] arr2 = t.toCharArray(); Arrays.sort(arr2);
        return new String(arr1).equals(new String(arr2));
    }
}
