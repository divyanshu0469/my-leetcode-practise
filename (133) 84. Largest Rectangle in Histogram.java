/* URL : https://leetcode.com/problems/largest-rectangle-in-histogram/description/ */
class Solution {
    public int largestRectangleArea(int[] h) {
        if(h.length == 0) {
            return 0;
        } else if(h.length == 1) {
            return h[0];
        }
        Stack<Integer> s = new Stack<>();
        int maxA = 0;
        for(int i = 0; i <= h.length; i++) {
            while(s.size() > 0 && (i == h.length || h[s.peek()] >= h[i])) {
                int height = h[s.pop()];
                int width = i - 1 - ((s.size() == 0) ? -1 : s.peek());
                maxA = Math.max(maxA, (height*width));
                System.out.println(i);
            }
            s.push(i);
        }
        return maxA;
    }
}
