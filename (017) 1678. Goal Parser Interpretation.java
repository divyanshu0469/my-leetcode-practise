/* URL : https://leetcode.com/problems/goal-parser-interpretation/ */
class Solution {
    public String interpret(String command) {
        int n = command.length();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++){
            if(command.charAt(i)=='G'){
                str.append("G");
            }
            else if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                    str.append("o");
                }
                else if(command.charAt(i+1)=='a'){
                    str.append("al");
                }
                }
                
            }
            String strfinal = str.toString();
        return strfinal;
        }
        
    }
