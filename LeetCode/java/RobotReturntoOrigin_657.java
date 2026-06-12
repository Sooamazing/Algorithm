package LeetCode.java;

import java.util.Map;

// 26-06-12 3min
// https://leetcode.com/problems/robot-return-to-origin
class RobotReturntoOrigin_657 {

    public boolean judgeCircle(String moves) {

        Map<Character, Integer> map = Map.of(
                'R', 0,
                'D', 1,
                'L', 2,
                'U', 3
        );
        int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[] current = {0, 0};

        for (char c : moves.toCharArray()) {
            int index = map.get(c);
            int r = dir[index][0];
            int col = dir[index][1];

            current[0] += r;
            current[1] += col;
        }

        return (current[0] == 0) && (current[1] == 0);
    }
}