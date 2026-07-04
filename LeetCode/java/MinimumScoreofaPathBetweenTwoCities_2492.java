package LeetCode.java;

// 26-07-04 20min
// https://leetcode.com/problems/minimum-score-of-a-path-between-two-cities
// hint: union find
public class MinimumScoreofaPathBetweenTwoCities_2492 {

    public int minScore(int n, int[][] roads) {

        int[] root = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            root[i] = i;
        }

        for (int[] r : roads) {
            root[find(root, r[0])] = find(root, r[1]);
        }

        int min = 10001;
        for (int[] r : roads) {
            if (find(root, r[0]) == find(root, 1)) {
                min = Math.min(min, r[2]);
            }
        }

        return min;

    }

    int find(int[] root, int i) {

        if (root[i] == i) {
            return i;
        }
        return root[i] = find(root, root[i]);
    }
}