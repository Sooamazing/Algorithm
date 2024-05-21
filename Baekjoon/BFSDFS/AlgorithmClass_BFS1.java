package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-01-11, 05-21 40min
// https://www.acmicpc.net/problem/24444
public class AlgorithmClass_BFS1 {
	static boolean[] visit;
	static int[] visitOrder;
	static List<Integer>[] nodeListArr;
	static int nodeNum;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		nodeNum = Integer.parseInt(st.nextToken());
		int edgeNum = Integer.parseInt(st.nextToken());
		int startNodeNum = Integer.parseInt(st.nextToken());

		visitOrder = new int[nodeNum + 1];
		visit = new boolean[nodeNum + 1];
		nodeListArr = new ArrayList[nodeNum + 1];

		for (int i = 0; i < nodeNum + 1; i++) {
			nodeListArr[i] = new ArrayList<>();
		}
		for (int i = 0; i < edgeNum; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			// 양방향 간선
			nodeListArr[a].add(b);
			nodeListArr[b].add(a);
		}

		// 오름차순 방문을 위한 정렬
		for (List<Integer> list : nodeListArr) {
			list.sort(Comparator.naturalOrder());
		}

		bfs(startNodeNum);

		// String[] s = br.readLine().split(" ");
		// int N = Integer.parseInt(s[0]);
		// int M = Integer.parseInt(s[1]);
		// int R = Integer.parseInt(s[2]);
		//
		// int[] visited = new int[N + 1];
		// List<int[]> list = new ArrayList<>();
		// for (int i = 0; i < M; i++) {
		//
		// 	s = br.readLine().split(" ");
		// 	int a = Integer.parseInt(s[0]);
		// 	int b = Integer.parseInt(s[1]);
		//
		// 	list.add(new int[] {a, b});
		// 	list.add(new int[] {b, a});
		// }
		//
		// list.sort((o1, o2) -> {
		// 	if (o1[0] == o2[0]) {
		// 		return o2[1] - o1[1];
		// 	} else {
		// 		return o2[0] - o1[0];
		// 	}
		// });
		//
		// visited[R] = 1;
		// bfs(R, visited, list, 2);

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < nodeNum + 1; i++) {
			// sb.append(visited[i]).append("\n");
			sb.append(visitOrder[i]).append("\n");
		}
		System.out.println(sb);

	}

	static void bfs(int r) {

		// for (int i)
		Queue<Integer> que = new LinkedList<>();
		visit[r] = true;
		int order = 1;
		visitOrder[r] = order++;
		que.add(r);
		while (!que.isEmpty()) {
			int poll = que.poll();
			List<Integer> curList = nodeListArr[poll];
			int size = curList.size();
			for (int i = 0; i < size; i++) {
				int curNum = curList.get(i);
				if (!visit[curNum]) {
					visit[curNum] = true;
					visitOrder[curNum] = order++;
					que.add(curNum);
				}
			}
		}

	}
	// static void bfs(int x, int[] visited, List<int[]> list, int cnt) {
	//
	// 	Queue<Integer> que = new LinkedList<>();
	// 	que.add(x);
	//
	// 	while (!que.isEmpty()) {
	// 		int pop = que.poll();
	// 		for (int i = list.size() - 1; i >= 0; i--) {
	// 			int[] ints = list.get(i);
	// 			if (ints[0] == pop && visited[ints[1]] == 0) {
	// 				visited[ints[1]] = cnt++;
	// 				que.add(ints[1]);
	// 			}
	// 		}
	// 	}
	//
	// 	//
	// 	// for (int i = list.size() - 1; i >= 0; i--) {
	// 	// 	int[] ints = list.get(i);
	// 	// 	if (ints[0] == x && visited[ints[1]] == 0) {
	// 	// 		visited[ints[1]] = cnt;
	// 	// 		bfs(ints[1], visited, list, ++cnt);
	// 	// 	}
	// 	// }
	// }
}
