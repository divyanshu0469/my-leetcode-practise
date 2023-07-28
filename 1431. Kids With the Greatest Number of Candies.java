/* URL : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/ */
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int max = candies[0];
        int value = 0;
        
        List<Boolean> Result = new ArrayList<Boolean>();
        for (int i = 0; i < n; i++){
            Boolean flag = true;
            value = candies[i] + extraCandies ;
            for (int j = 0; j<n; j++){
                if(candies[j]>value){
                    Result.add(false);
                    flag = false;
                    break;
                }
            }
            if(flag==true){
                Result.add(true);
            }
        }
        return Result;
    }
}
