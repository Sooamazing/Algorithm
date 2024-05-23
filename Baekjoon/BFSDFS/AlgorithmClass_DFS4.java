package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-05-24 20min
// https://www.acmicpc.net/problem/24482
public class AlgorithmClass_DFS4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int nodeNum = Integer.parseInt(st.nextToken());
		int edgeNum = Integer.parseInt(st.nextToken());
		int startNodeNum = Integer.parseInt(st.nextToken());

		int[] depths = new int[nodeNum + 1];
		Arrays.fill(depths, -1); // 방문하지 않은 depth == -1
		PriorityQueue<Integer>[] pqArr = new PriorityQueue[nodeNum + 1];
		for (int i = 1; i < nodeNum + 1; i++) {
			pqArr[i] = new PriorityQueue<>(Comparator.reverseOrder());
		}

		for (int i = 0; i < edgeNum; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			pqArr[a].add(b);
			pqArr[b].add(a);
		}

		dfs(depths, pqArr, startNodeNum, 0);

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < nodeNum + 1; i++) {
			sb.append(depths[i]).append("\n");
		}

		System.out.println(sb);

	}

	static void dfs(int[] depths, PriorityQueue<Integer>[] pqArr, int curNodeNum, int curDepth) {

		depths[curNodeNum] = curDepth; // curDepth++;

		PriorityQueue<Integer> curNodeEdges = pqArr[curNodeNum];
		while (!curNodeEdges.isEmpty()) {
			int tempNode = curNodeEdges.poll();
			// 시작 정점과 무조건 연결되어 있으면 여기서 depths[tempNode] = depths[curNodeNum] + 1 ; 가능.
			if (depths[tempNode] == -1) {
				dfs(depths, pqArr, tempNode, curDepth + 1);
			}
		}

	}
}
