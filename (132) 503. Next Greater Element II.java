/* URL : https://leetcode.com/problems/next-greater-element-ii/ */
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] a = new int[nums.length];
        Stack<Integer> s = new Stack<>();
        Arrays.fill(a,-1);
        for(int i = 0; i < nums.length*2; i++) {
            while(s.size() > 0 && nums[i%nums.length] > nums[s.peek()]) {
                a[s.pop()] = nums[i%nums.length];
            }
            s.push(i%nums.length);
        }
        return a;
    }
}
