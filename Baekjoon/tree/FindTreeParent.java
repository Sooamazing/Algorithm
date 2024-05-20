package Baekjoon.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

// 7
// 6 3
// 3 5
// 4 1
// 2 4
// 4 7
// 1 6
// 24-05-19, 20 80min
// https://www.acmicpc.net/problem/11725
public class FindTreeParent {
	static int nodeNum;
	static int[] parent;
	// static boolean[][] visit;
	static Queue<Integer> que;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		nodeNum = Integer.parseInt(br.readLine());
		parent = new int[nodeNum + 1];
		// visit = new boolean[nodeNum + 1][nodeNum + 1];
		// for (int i = 1; i <= nodeNum; i++) {
		// 	parent[i] = i;
		// }
		// List<List<Integer>> list = new ArrayList<>();
		// for (int i = 0; i < nodeNum; i++) {
		// 	list.add(new ArrayList<>());
		// }
		List<Integer>[] listArr = new LinkedList[nodeNum + 1];
		que = new LinkedList<>();
		for (int i = 0; i <= nodeNum; i++) {
			listArr[i] = new LinkedList<>();
		}
		for (int i = 0; i < nodeNum - 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			listArr[a].add(b);
			listArr[b].add(a);

			// que.add(new int[] {a, b});
			// if (parent[a] > b || parent[a] == 0) {
			// 	parent[a] = b;
			// } else if (parent[b] > a || parent[b] == 0) {
			// 	parent[b] = a;
			// }
			// union(a, b);
		}

		parent[1] = 1;

		for (int v : listArr[1]) {
			parent[v] = 1;
			que.add(v);
		}

		while (!que.isEmpty()) {
			int curNode = que.poll();
			for (int v : listArr[curNode]) {
				if (parent[v] == 0) {
					parent[v] = curNode;
					que.add(v);
				}
			}
		}

		// while (!que.isEmpty()) {
		// 	int[] poll = que.poll();
		// 	int a = poll[0];
		// 	int b = poll[1];
		//
		// 	// 둘 다 못 찾았으면 continue
		// 	if (parent[a] == 0 && parent[b] == 0) {
		// 		que.add(new int[] {a, b});
		// 		continue;
		// 	}
		//
		// 	if (parent[a] == 0 && parent[b] != 0) {
		// 		// b는 부모가 있고, a는 부모가 없으면
		// 		parent[a] = b;
		// 	} else if (parent[a] != 0 && parent[b] == 0) {
		// 		parent[b] = a;
		// 	}
		//
		// 	// 둘 다 부모가 있으면 그냥 continue
		//
		// }
		// getTree(1);

		for (int i = 2; i < nodeNum + 1; i++) {
			sb.append(parent[i]).append("\n");
		}

		System.out.println(sb);

	}

	// static void getTree(int prevNode) {
	//
	// 	for (int j = 1; j <= nodeNum; j++) {
	// 		if (!visit[prevNode][j] && parent[j] == 0) {
	// 			visit[prevNode][j] = true;
	// 			parent[j] = prevNode;
	// 			getTree(j);
	// 		}
	// 	}
	//
	// }

	// static int find(int v) {
	// 	if (parent[v] == v) {
	// 		return v;
	// 	}
	// 	return find(parent[v]);
	// }
	//
	// static void union(int a, int b) {
	// 	int parentA = find(a);
	// 	int parentB = find(b);
	// 	if (parentA > parentB) {
	// 		parent[a] = b;
	// 	} else if (parentA < parentB) {
	// 		parent[b] = a;
	// 	}
	// }
}
