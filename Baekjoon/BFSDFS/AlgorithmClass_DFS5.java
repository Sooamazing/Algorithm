package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-05-25 15min
// https://www.acmicpc.net/problem/24483
public class AlgorithmClass_DFS5 {
	static final int ORDER = 0;
	static final int DEPTH = 1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int nodeNum = Integer.parseInt(st.nextToken());
		int edgeNum = Integer.parseInt(st.nextToken());
		int startNodeNum = Integer.parseInt(st.nextToken());

		int[][] visitOrderDepth = new int[nodeNum + 1][2];

		PriorityQueue<Integer>[] edgesArr = new PriorityQueue[nodeNum + 1];

		// pq 초기화 필수!
		for (int i = 1; i < nodeNum + 1; i++) {
			edgesArr[i] = new PriorityQueue<>();
		}

		for (int i = 0; i < edgeNum; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			edgesArr[a].add(b);
			edgesArr[b].add(a);
		}

		dfs(visitOrderDepth, edgesArr, startNodeNum, 0);

		long resultSum = 0;
		for (int i = 1; i < nodeNum + 1; i++) {
			resultSum += ((long)visitOrderDepth[i][0] * visitOrderDepth[i][1]);
		}

		System.out.println(resultSum);

	}

	static int visitIdx;

	static void dfs(int[][] visitOrderDepth, PriorityQueue<Integer>[] edgesArr, int curNodeNum, int depth) {

		// 방문 처리
		visitOrderDepth[curNodeNum][ORDER] = ++visitIdx;
		visitOrderDepth[curNodeNum][DEPTH] = depth;

		// resultSum = ++visitOrder * depth;

		PriorityQueue<Integer> curNodeEdges = edgesArr[curNodeNum];
		while (!curNodeEdges.isEmpty()) {
			int tempNode = curNodeEdges.poll();
			if (visitOrderDepth[tempNode][ORDER] == 0) {
				dfs(visitOrderDepth, edgesArr, tempNode, depth + 1);
			}
		}

	}
}
