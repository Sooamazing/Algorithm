package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-05-23, 06-08 80min
// https://www.acmicpc.net/problem/24447
public class AlgorithmClass_BFS4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int nodeSize = Integer.parseInt(st.nextToken());
		int edgeSize = Integer.parseInt(st.nextToken());
		int startNode = Integer.parseInt(st.nextToken());

		long[][] visitOrderDepths = new long[nodeSize + 1][2];
		// for (int i = 1; i < nodeSize + 1; i++) {
		// 	visitOrderDepths[i] = new int[] {0, -1}; // visitOrder, depth
		// }
		PriorityQueue<Integer>[] listArr = new PriorityQueue[nodeSize + 1]; // 오름차순 방문
		for (int i = 1; i < nodeSize + 1; i++) {
			listArr[i] = new PriorityQueue<>(Comparator.naturalOrder());
		}

		for (int i = 0; i < edgeSize; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			listArr[a].add(b);
			listArr[b].add(a);
		}

		bfs(visitOrderDepths, listArr, startNode);

		long result = 0; // 범위 주의
		for (int i = 1; i < nodeSize + 1; i++) {
			long temp = (visitOrderDepths[i][0] * visitOrderDepths[i][1]);
			result += temp;
		}

		System.out.println(result);

	}

	static void bfs(long[][] visitOrderDepths, PriorityQueue<Integer>[] listArr, int startNode) {
		Queue<Integer> bfsQue = new LinkedList<>();
		bfsQue.add(startNode);
		int orderIdx = 1;
		visitOrderDepths[startNode][0] = orderIdx++; // visitOrder
		int depth = 0;
		visitOrderDepths[startNode][1] = depth; // depth

		while (!bfsQue.isEmpty()) {
			int curNode = bfsQue.poll();
			depth++;
			PriorityQueue<Integer> curNodeEdges = listArr[curNode];
			while (!curNodeEdges.isEmpty()) {
				int tempNode = curNodeEdges.poll();
				if (visitOrderDepths[tempNode][0] == 0) {
					visitOrderDepths[tempNode][0] = orderIdx++;
					visitOrderDepths[tempNode][1] = visitOrderDepths[curNode][1] + 1;
					bfsQue.add(tempNode);
				}
			}
		}

	}
}
