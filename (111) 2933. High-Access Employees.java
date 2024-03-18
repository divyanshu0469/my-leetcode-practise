/* URL : https://leetcode.com/problems/high-access-employees/description/ */
class Solution {
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        HashMap<String, List<Integer>> emp_at = new HashMap<>();

        for (int i = 0; i < access_times.size(); i++) {
            String name = access_times.get(i).get(0);
            int time = Integer.parseInt(access_times.get(i).get(1));
            emp_at.computeIfAbsent(name, v -> new ArrayList<>()).add(time);
        }

        List<String> ans = new ArrayList<>();
        for (String name : emp_at.keySet()) {
            List<Integer> times = emp_at.get(name);
            Collections.sort(times);
            if (times.size() >= 3) {
                boolean flag = false;
                for (int i = 2; i < times.size(); i++) {
                    int j = i-2;
                    if (times.get(i)-times.get(j) < 100) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    ans.add(name);
                }
            }
        }
        return ans;

        
    }
}
