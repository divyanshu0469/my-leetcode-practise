/* URL : https://leetcode.com/problems/intersection-of-two-arrays-ii/ */
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> al = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                al.add(nums1[i]);
                i++;
                j++;
            }
        }
        
        int[] ans = new int[al.size()];
        int k = 0;
        while (k < ans.length) {
            ans[k] = al.get(k);
            k++;
        }
        return ans;
    }
}
