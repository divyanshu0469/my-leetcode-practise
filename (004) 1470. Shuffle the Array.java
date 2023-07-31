/* URL = https://leetcode.com/problems/shuffle-the-array/ */
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int mid = n;
        int a;
        int b;
        int[] fin = new int[2*n];
        int s1 = 0;
        for(int start = 0; start<n; start++){
            a=nums[start];
            b=nums[mid];
            mid++;
            
            while(s1<(2*n)){
                fin[s1]=a;
                fin[s1+1]=b;
                s1+=2;
                break;
            }
        }
        return fin;
    }
}
