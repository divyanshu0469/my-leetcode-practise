/* URL : https://leetcode.com/problems/group-anagrams/description/ */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> myMap = new HashMap();
        for (String s: strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String keyS = String.valueOf(ca);
            if (!myMap.containsKey(keyS)) myMap.put(keyS, new ArrayList<>());
            myMap.get(keyS).add(s);
        }
        return new ArrayList<>(myMap.values());
    }
}
