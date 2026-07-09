package LeetCode.java;

// 26-07-09 30min
// https://leetcode.com/problems/path-existence-queries-in-a-graph-i
public class PathExistenceQueriesinaGraphI_3532 {

    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {

        boolean[] answers = new boolean[queries.length];

        int[] parents = new int[n + 1];
        // for(int i = 0 ;i<n+1;i++){
        //     parents[i]=i;
        // }

        // for(int i = 0 ; i<nums.length;i++){
        //     for(int j = i+1 ; j<nums.length;j++){
        //         if(nums[j] - nums[i] > maxDiff){
        //             continue;
        //         }
        //         union(parents, j, i);
        //         // System.out.println("i: "+i+", "+parents[i]+".   j: "+j+", "+parents[j]);
        //     }
        // }

        for (int i = 1; i < n; i++) {
            if (nums[i] - nums[i - 1] <= maxDiff) {
                parents[i] = parents[i - 1];
            } else {
                parents[i] = parents[i - 1] + 1;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            answers[i] = (parents[query[0]] == parents[query[1]]);
        }

        return answers;
    }

    private void union(int[] parents, int i, int j) {

        int x = parents[i];
        int y = parents[j];

        parents[x] = y;
    }

    private int find(int[] parents, int i) {

        if (parents[i] == i) {
            return i;
        }
        return parents[i] = find(parents, parents[i]);
    }
}