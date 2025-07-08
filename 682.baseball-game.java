/*
 * @lc app=leetcode id=682 lang=java
 *
 * [682] Baseball Game
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int calPoints(String[] operations) {
        List<Integer> tmp = new ArrayList<>();
        for(String s: operations){
            if(s.equals("C")){
                tmp.remove(tmp.size() - 1);
            } else if(s.equals("D")){
                tmp.add(tmp.get(tmp.size() - 1) * 2);
            } else if(s.equals("+")){
                int n1 = tmp.get(tmp.size() - 1);
                int n2 = tmp.get(tmp.size() - 2);

                int sum = n1 + n2;
                tmp.add(sum);

            } else{
                tmp.add(Integer.parseInt(s));
            }
        }
        int sum = 0;
        for (int n: tmp){
            sum += n;
        }
        return sum;
    }
}
// @lc code=end

