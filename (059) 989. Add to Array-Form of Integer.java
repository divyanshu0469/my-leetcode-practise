/* URL : https://leetcode.com/problems/add-to-array-form-of-integer/description/ */
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> li=new ArrayList<>();
        for (int i = num.length - 1; i >= 0; i--) {
            li.add((num[i] + k)%10);
            k = (num[i] + k) / 10;
        }
        while ( k > 0) {
            li.add(k%10);
            k /= 10;
        }
        Collections.reverse(li);
        return li;
    }
}
