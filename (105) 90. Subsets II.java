/* URL : https://leetcode.com/problems/subsets-ii/description/ */
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        subSet(arr, 0, outer, 0);
        return outer;
    }
    public void subSet(int[] arr, int index, List<List<Integer>> outer, int e) {
        if (index == arr.length) {
            return;
        }
        int s = 0;
        int n = outer.size();
        if (index > 0 && arr[index] == arr[index-1]) {
            s = e+1;
        }
        e = outer.size()-1;
        for (int i = s; i < n; i++) {
            List<Integer> internal = new ArrayList<>(outer.get(i));
            internal.add(arr[index]);
            outer.add(internal);
        }
        subSet(arr, ++index, outer, e);
    }
}
