class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int[] index = new int[queries.length];
        int i = 0;
        for (int[] query : queries) {
            PriorityQueue<String> pq = new PriorityQueue<>();
            HashMap<String, List<Integer>> numbers = new HashMap<>();
            int digit = query[1]; // total digits needed from the right
            int j = 0;
            for (String s : nums) {
                s = s.substring(s.length()-digit);
                pq.add(s);
                numbers.computeIfAbsent(s, v->new ArrayList<>()).add(j++);
            }
            String ans = "";
            int k = query[0]; // k for kth smallest in the final answer array
            while(k-->0) {
                ans = pq.poll();
                List<Integer> positions = numbers.get(ans);
                int a = 0;
                while (positions.get(a) == -1) {
                    a++;
                }
                if (k >= 1) {
                    positions.set(a, -1);
                }
            }
            List<Integer> positions = numbers.get(ans);
            int a = 0;
            while (positions.get(a) == -1) {
                a++;
            }
            index[i++] = positions.get(a);
        }
        return index;
    }
}
