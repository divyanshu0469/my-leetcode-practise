/* URL : https://leetcode.com/problems/top-k-frequent-elements/description/ */
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> my = new HashMap<>();
        for (int i: nums) {
            my.put(i, my.getOrDefault(i, 0) + 1);
        }
        
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key: my.keySet()){
            int value = my.get(key);
            if( bucket[value] == null) bucket[value] = new ArrayList<>();
            bucket[value].add(key);
        }
        int[] ans = new int[k];
        int n = 0;
        for(int i  = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                int m = 0;
                while (n < ans.length && m < bucket[i].size()) {
                    ans[n] = bucket[i].get(m);
                    n++;
                    m++;
                }
            }
        }
        return ans;
    }
}
