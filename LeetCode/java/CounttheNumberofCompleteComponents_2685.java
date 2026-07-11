package LeetCode.java;

import java.util.HashSet;
import java.util.Set;

// 26-07-11 47min
// https://leetcode.com/problems/count-the-number-of-complete-components
public class CounttheNumberofCompleteComponents_2685 {

    public int countCompleteComponents(int n, int[][] edges) {

        int[] parents = new int[n];
        int[] connected = new int[n];
        for (int i = 0; i < n; i++) {
            parents[i] = i;
        }

        for (int i = 0; i < edges.length; i++) {
            union(parents, edges[i][0], edges[i][1]);
            connected[edges[i][0]]++;
            connected[edges[i][1]]++;
        }

        // 경로 압축 필수
        for (int i = 0; i < n; i++) {
            parents[i] = find(parents, i);
        }

        Set<Integer> parentSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int currentRoot = parents[i];
            int connectedNumber = 0;
            boolean isConnected = true;
            if (parents[i] == -1) {
                continue;
            }
            // int currentRoot = find(parents, i);
            int prevConnected = connected[currentRoot];
            System.out.println(
                    "-- i: " + i + ", parents: " + parents[i] + ", connected: " + connected[i]
                            + ", prevConnected: " + prevConnected);
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (parents[j] == currentRoot) {
                    System.out.println(
                            "j: " + j + ", currentRoot: " + currentRoot + ", connectedNumber: "
                                    + connectedNumber + ", connected[j]: " + connected[j]);

                    if (connected[j] != prevConnected) {
                        System.out.println("j: " + j + ", currentRoot: " + currentRoot
                                + ", isConnected false ");
                        isConnected = false;
                    }
                    parents[j] = -1;
                    connectedNumber++;
                }
            }
            parents[i] = -1;
            if (connectedNumber == prevConnected && isConnected) {
                parentSet.add(currentRoot);
            }
        }

        return parentSet.size();
    }

    void union(int[] parents, int i, int j) {

        int x = find(parents, i);
        int y = find(parents, j);

        if (x > y) {
            parents[x] = y;
            return;
        }

        parents[y] = x;
    }

    int find(int[] parents, int i) {

        if (parents[i] == i) {
            return i;
        }
        return parents[i] = find(parents, parents[i]);
    }
}