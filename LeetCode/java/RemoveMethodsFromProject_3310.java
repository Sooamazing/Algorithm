package LeetCode.java;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// 26-08-05 55min
// https://leetcode.com/problems/remove-methods-from-project
public class RemoveMethodsFromProject_3310 {

// class Solution {
//     public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
//         List<Integer>[] downNodes = new LinkedList[n];
//         List<Integer>[] upNodes = new LinkedList[n];
//         boolean[] visited = new boolean[n];

//         List<Integer> answer = new LinkedList<>();
//         for (int i = 0; i < n; i++) {
//             downNodes[i] = new LinkedList<>();
//             upNodes[i] = new LinkedList<>();
//         }

//         for (int i = 0; i < invocations.length; i++) {
//             int node1 = invocations[i][0];
//             int node2 = invocations[i][1];
//             downNodes[node1].add(node2);
//             upNodes[node2].add(node1);
//         }

//         for (int i = 0; i < n; i++) {
//             Collections.sort(downNodes[i]);
//             Collections.sort(upNodes[i]);
//         }

//         // k 하위 방문.
//         Queue<Integer> que = new LinkedList<>();
//         que.add(k);
//         visited[k] = true;
//         while (!que.isEmpty()) {
//             int currentNode = que.poll();
//             for (int node : downNodes[currentNode]) {
//                 if (visited[node]) {
//                     continue;
//                 }
//                 // System.out.println(node);
//                 visited[node] = true;
//                 que.add(node);
//             }
//         }

//         for (int i = 0; i < n; i++) {
//             if (visited[i]) {
//                 for (int j = 0; j < n; j++) {
//                     int upNodeIndex = Collections.binarySearch(upNodes[i], j);
//                     // System.out.println(i + ", " + j + ", " + "upNode: " + upNodeIndex + ", ");
//                     if (upNodeIndex >= 0 && !visited[j]) {
//                         // System.out.println("visited: " + i + ", " + upNodeIndex);
//                         return Stream.iterate(0, num -> num + 1).limit(n).toList(); // 전체 반환
//                     }
//                 }
//                 continue;
//             }

//             // if (Collections.binarySearch(upNodes[i], i) >= 0) {
//             //     return Stream.iterate(0, num -> num + 1).limit(n).toList(); // 전체 반환
//             // }
//             answer.add(i);
//         }

//         return answer;
//     }
// }

    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {

        List<Integer>[] edges = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            edges[i] = new ArrayList<>();
        }
        int[] inDegree = new int[n];

        for (int[] inv : invocations) {
            edges[inv[0]].add(inv[1]);
            inDegree[inv[1]]++;
        }

        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(k);
        boolean[] suspicious = new boolean[n];
        suspicious[k] = true;

        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : edges[u]) {
                inDegree[v]--;

                if (!suspicious[v]) {
                    queue.offer(v);
                    suspicious[v] = true;
                }
            }
        }

        boolean canRemoveAll = true;
        List<Integer> remaining = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (suspicious[i] && inDegree[i] > 0) {
                canRemoveAll = false;
                break;
            } else if (!suspicious[i]) {
                remaining.add(i);
            }
        }

        if (!canRemoveAll) {
            List<Integer> allNodes = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                allNodes.add(i);
            }
            return allNodes;
        }

        return remaining;
    }
}