/* URL : https://leetcode.com/problems/number-of-recent-calls/description/ */
class RecentCounter {
    // first thing to note is that the input order is strictly increasing
    ArrayList<Integer> data;
    public RecentCounter() {
        data = new ArrayList<>();
    }
    public int adder(int t) {
        // removing all the values in the arraylist which are not in range of [t-3000, t]
        while(data.size() > 0 && data.get(0) < t-3000) {
            data.remove(0);
        }
        data.add(t);
        return data.size();
    }
    public int ping(int t) {
        return adder(t);
    }
}
