/* URL : https://leetcode.com/problems/maximum-population-year/ */
class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[101];
        for(int i = 0; i < logs.length; i++){
            years[logs[i][0]-1950] += 1;
            years[logs[i][1]-1950] -= 1;
        }
        int maxnum =years[0];int maxyear = 1950;
        for(int i =1; i < 101; i++){
            years[i] += years[i-1];
            if(years[i] > maxnum){
                maxnum = years[i];
                maxyear = i+1950;
            }
        }
        return maxyear;
    }
}
