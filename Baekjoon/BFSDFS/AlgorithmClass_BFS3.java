package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-05-22 20min
// https://www.acmicpc.net/problem/24446
public class AlgorithmClass_BFS3 {
	static int[] depthResult;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int nodeSize = Integer.parseInt(st.nextToken());
		int edgeSize = Integer.parseInt(st.nextToken());
		int startNode = Integer.parseInt(st.nextToken()) - 1; // 배열 사이즈를 nodeSize로 했기 때문에 -1 필수!
		Queue<Integer>[] listArr = new Queue[nodeSize];
		boolean[] visit = new boolean[nodeSize];
		depthResult = new int[nodeSize];
		Arrays.fill(depthResult, -1); // 미방문 정점은 -1

		// Queue 배열 초기화
		for (int i = 0; i < nodeSize; i++) {
			listArr[i] = new LinkedList<>();
		}

		for (int i = 0; i < edgeSize; i++) {
			st = new StringTokenizer(br.readLine());

			// 배열 사이즈를 nodeSize로 했기 때문에 -1 필수!
			int a = Integer.parseInt(st.nextToken()) - 1;
			int b = Integer.parseInt(st.nextToken()) - 1;

			listArr[a].add(b);
			listArr[b].add(a);
		}

		bfs(visit, listArr, startNode);

		StringBuilder sb = new StringBuilder();
		for (int depth : depthResult) {
			sb.append(depth).append("\n");
		}

		System.out.println(sb);

	}

	static void bfs(boolean[] visit, Queue<Integer>[] listArr, int startNode) {
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {startNode, 0});
		visit[startNode] = true;
		depthResult[startNode] = 0;

		while (!que.isEmpty()) {
			int[] poll = que.poll();
			int curNode = poll[0];
			int curDepth = poll[1];
			Queue<Integer> curNodeQueue = listArr[curNode];

			while (!curNodeQueue.isEmpty()) {
				int tempNode = curNodeQueue.poll();
				if (!visit[tempNode]) {
					visit[tempNode] = true;
					depthResult[tempNode] = curDepth + 1;
					que.add(new int[] {tempNode, curDepth + 1});
				}
			}

		}

	}

}
