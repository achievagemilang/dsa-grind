/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */

// @lc code=start

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> seen = new HashSet<>();
        int row = board.length;
        int col = board.length;
        for(int i=0; i<row; i++){
            seen.clear();
            for(int j=0; j<col; j++){
                char c = board[i][j];
                if(c == '.') continue;
                if(seen.contains(c)) return false;
                seen.add(c);
            }
        }

        for(int i=0; i<col; i++){
            seen.clear();
            for(int j=0; j<row; j++){
                char c = board[j][i];
                if(c == '.') continue;
                if(seen.contains(c)) return false;
                seen.add(c);
            }
        }

        HashMap<String, HashSet<Character>> bMap = new HashMap<>();
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                String key = String.format("%d, %d", i, j);
                bMap.put(key, new HashSet<>());
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                int rBox = i / 3;
                int cBox = j / 3;
                
                HashSet<Character> tmpSeen = bMap.get(String.format("%d, %d", rBox, cBox));
                char c = board[i][j];
                if(c == '.') continue;
                if(tmpSeen.contains(c)) return false;
                tmpSeen.add(c);
            }
        }

        return true;
    }
}

/*
1. The idea is to actually check these straight forward:
- Check every row if there's any duplicate
- Check every column if there's any duplicate
- Check every subsquares is there's any duplicate
*/
// @lc code=end

