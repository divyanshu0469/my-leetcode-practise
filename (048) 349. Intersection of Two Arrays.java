/* URL : https://leetcode.com/problems/intersection-of-two-arrays/ */
class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        List<Integer> li = new ArrayList<>();
        li
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if(hs.contains(arr2[i])) {
                fi.add(arr2[i]);
            }
        }
        int[] arr = new int[fi.size()];
        int i = 0;
        for (Integer num : fi) {
            arr[i++] = num;
        }
        return arr;
    }
}
