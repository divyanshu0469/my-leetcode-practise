/* URL : https://leetcode.com/problems/defanging-an-ip-address/ */
class Solution {
    public String defangIPaddr(String address) {
        String str = address.replace(".","[.]");
        return str;
    }
}
