/* URL : https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/ */
class Solution {
    public int[] sumZero(int n) {
        int[] array = new int[n];
        if(n%2 != 0){
            array[n/2] = 0;
            int a = 1;
            for(int i = 0; i < n/2; i++){
                array[i] = a;
                a++;
            }
            int b = -1;
            for(int i = (n/2)+1; i < n; i++){
                array[i] = b;
                b--;
            }
        }
        else{
            int a = 1;
            for(int i = 0; i < n/2; i++){
                array[i] = a;
                a++;
            }
            int b = -1;
            for(int i = n/2; i < n; i++){
                array[i] = b;
                b--;
            }

        }
        return array;
    }
}
