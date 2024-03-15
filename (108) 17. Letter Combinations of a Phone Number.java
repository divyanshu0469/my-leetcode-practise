/* URL : https://leetcode.com/problems/letter-combinations-of-a-phone-number/ */
class Solution {
    HashMap<Character, String> hm = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");
        if (digits.length() == 0) {
            return ans;
        }
        recursion(digits, "", ans);
        return ans;
    }
    public void recursion(String up, String p, List<String> ans) {
        if (up.length() == 0) {
            ans.add(p);
            return;
        }
        String s = hm.get(up.charAt(0));
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            recursion(up.substring(1), p+ch, ans);
        }
    }
}
