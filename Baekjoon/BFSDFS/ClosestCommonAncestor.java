package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-06-30 40min
// https://www.acmicpc.net/problem/3584
public class ClosestCommonAncestor {

	static int nodeNum;
	static int[] parents;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCaseNum = Integer.parseInt(br.readLine());

		while (testCaseNum-- > 0) {

			nodeNum = Integer.parseInt(br.readLine());

			parents = new int[nodeNum + 1];
			StringTokenizer st;
			for (int i = 0; i < nodeNum - 1; i++) {
				st = new StringTokenizer(br.readLine());
				int parent = Integer.parseInt(st.nextToken());
				int child = Integer.parseInt(st.nextToken());

				parents[child] = parent;
			}

			st = new StringTokenizer(br.readLine());
			int node_1 = Integer.parseInt(st.nextToken());
			int node_2 = Integer.parseInt(st.nextToken());

			// 최상위 depth: 0 으로 전제.
			int nodeDepth_1 = getDepth(node_1, 0);
			int nodeDepth_2 = getDepth(node_2, 0);

			int commonAncestor = getCommonAncestor(node_1, nodeDepth_1, node_2, nodeDepth_2);
			sb.append(commonAncestor).append("\n");

			// copilot
			// int nodeNum = Integer.parseInt(br.readLine());
			// int[] parents = new int[nodeNum + 1];
			// boolean[] isParent = new boolean[nodeNum + 1];
			//
			// for (int i = 0; i < nodeNum - 1; i++) {
			// 	String[] str = br.readLine().split(" ");
			// 	int parent = Integer.parseInt(str[0]);
			// 	int child = Integer.parseInt(str[1]);
			//
			// 	parents[child] = parent;
			// 	isParent[parent] = true;
			// }
			//
			// String[] str = br.readLine().split(" ");
			// int node1 = Integer.parseInt(str[0]);
			// int node2 = Integer.parseInt(str[1]);
			//
			// int[] node1Parents = new int[nodeNum + 1];
			// int[] node2Parents = new int[nodeNum + 1];
			//
			// int node1Idx = 0;
			// int node2Idx = 0;
			//
			// while (node1 != 0) {
			// 	node1Parents[node1Idx++] = node1;
			// 	node1 = parents[node1];
			// }
			//
			// while (node2 != 0) {
			// 	node2Parents[node2Idx++] = node2;
			// 	node2 = parents[node2];
			// }
			//
			// int result = 0;
			// for (int i = 0; i < node1Idx; i++) {
			// 	for (int j = 0; j < node2Idx; j++) {
			// 		if (node1Parents[i] == node2Parents[j]) {
			// 			result = node1Parents[i];
			// 			break;
			// 		}
			// 	}
			// 	if (result != 0) {
			// 		break;
			// 	}
			// }
			// System.out.println(result);
		}

		System.out.println(sb);

	}

	private static int getCommonAncestor(int node_1, int nodeDepth_1, int node_2, int nodeDepth_2) {

		// depth 맞추기
		while (nodeDepth_1 != nodeDepth_2) {
			if (nodeDepth_1 > nodeDepth_2) {
				node_1 = parents[node_1];
				nodeDepth_1--;
			} else {
				node_2 = parents[node_2];
				nodeDepth_2--;
			}
		}

		// 같은 depth에서 노드가 같다면 해당 노드의 부모를 공통 조상으로 출력 // 전제가 아닌 것 같긴 함.
		// 아, 자기 자신은 자손으로 간주한대.
		if (node_1 == node_2) {
			return node_1;
			// return parents[node_1];
		}

		// 공통 조상이 나올 때까지 거슬러 올라가기
		while (node_1 != node_2) {
			node_1 = parents[node_1];
			nodeDepth_1--;
			node_2 = parents[node_2];
			nodeDepth_2--;
		}

		return node_1;

		// copilot
		// if (nodeDepth_1 > nodeDepth_2) {
		// 	while (nodeDepth_1 != nodeDepth_2) {
		// 		node_1 = parents[node_1];
		// 		nodeDepth_1--;
		// 	}
		// } else {
		// 	while (nodeDepth_1 != nodeDepth_2) {
		// 		node_2 = parents[node_2];
		// 		nodeDepth_2--;
		// 	}
		// }
		//
		// while (node_1 != node_2) {
		// 	node_1 = parents[node_1];
		// 	node_2 = parents[node_2];
		// }
		//
		// return node_1;

	}

	private static int getDepth(int node, int depth) {
		if (parents[node] == 0) {
			return depth;
		} else {
			return getDepth(parents[node], depth + 1);
		}
	}
}
