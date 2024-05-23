package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-01-09, 05-23 75min
// https://www.acmicpc.net/problem/24480
public class AlgorithmClass_DFS2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int nodeNum = Integer.parseInt(st.nextToken());
		int edgeNum = Integer.parseInt(st.nextToken());
		int startNodeNum = Integer.parseInt(st.nextToken());

		int[] visitOrder = new int[nodeNum + 1];

		PriorityQueue<Integer>[] pqArr = new PriorityQueue[nodeNum + 1];
		for (int i = 1; i < nodeNum + 1; i++) {
			pqArr[i] = new PriorityQueue<>(Comparator.reverseOrder()); // 내림차순
		}
		for (int i = 0; i < edgeNum; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			pqArr[a].add(b);
			pqArr[b].add(a);
		}

		dfs(visitOrder, pqArr, startNodeNum);

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < nodeNum + 1; i++) {
			sb.append(visitOrder[i]).append("\n");
		}

		System.out.println(sb);
	}

	// 재귀 메서드 모두에서 공유해야 하기 때문에 필드로 사용
	static int orderIdx = 1;

	static void dfs(int[] visitOrder, PriorityQueue<Integer>[] pqArr, int curNodeNum) {

		// 들어오자마자 방문 처리
		visitOrder[curNodeNum] = orderIdx++;

		PriorityQueue<Integer> curNodeEdges = pqArr[curNodeNum];
		while (!curNodeEdges.isEmpty()) {
			int tempNode = curNodeEdges.poll();
			if (visitOrder[tempNode] == 0) {
				dfs(visitOrder, pqArr, tempNode);
			}
		}
	}
}
