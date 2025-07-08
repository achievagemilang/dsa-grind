/*
 * @lc app=leetcode id=241 lang=java
 *
 * [241] Different Ways to Add Parentheses
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<expression.length(); i++){
            char c = expression.charAt(i);
            if(c == '-' || c == '+' || c == '*'){
                List<Integer> partisi1 = diffWaysToCompute(expression.substring(0, i));
                List<Integer> partisi2 = diffWaysToCompute(expression.substring(i+1));

                for(int p1: partisi1){
                    for(int p2: partisi2){
                        if(c == '-'){
                            ans.add(p1 - p2);
                        } else if(c == '+'){
                            ans.add(p1 + p2);
                            
                        } else {
                            ans.add(p1 * p2);

                        }
                    }
                }
            }
        }

        if(ans.isEmpty()) ans.add(Integer.parseInt(expression));
        return ans;
    }
}
// @lc code=end

/*
 * The idea is we loop through the string until we find an operaton, then split them and solve recursively
 * The base case would be when the splitted element doesn't have any operators left, we return the number
 * Merge the answers
 */
