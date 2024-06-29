package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 24-06-29 45min
// https://www.acmicpc.net/problem/1068
public class Tree {

	static List[] childrens;
	static int nodeNum;

	static int[] parents;
	static boolean[] isParent;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		nodeNum = Integer.parseInt(br.readLine());

		childrens = new List[nodeNum];
		for (int i = 0; i < nodeNum; i++) {
			childrens[i] = new ArrayList<Integer>();
		}
		parents = new int[nodeNum]; // leafs로 dfs하려다 영감.
		isParent = new boolean[nodeNum];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < nodeNum; i++) {
			int parent = Integer.parseInt(st.nextToken());
			parents[i] = parent;
			if (parent != -1) {
				isParent[parent] = true;
				childrens[parent].add(i);
			}
		}

		int removeNode = Integer.parseInt(br.readLine());

		// 최상위 노드인 경우 바로 종료
		if (parents[removeNode] == -1) {
			System.out.println(0);
			return;
		}

		int leafNumFromRemoval = getLeafNumFrom(removeNode);
		isParent[removeNode] = true;

		int totalLeafNum = 0;
		for (boolean b : isParent) {
			totalLeafNum = b ? totalLeafNum : totalLeafNum + 1;
		}

		// 지운 노드의 부모가 여러 개의 leaf를 갖고 있는 경우와 하나였던 경우 나눠 관리.
		if (childrens[parents[removeNode]].size() == 1) {
			// 최상위 노드인 경우는 가정 X.
			totalLeafNum++;
		}

		System.out.println(totalLeafNum);
	}

	static int getLeafNumFrom(int startNode) {

		int sum = 0;
		List<Integer> children = childrens[startNode];
		for (int i = 0; i < children.size(); i++) {
			int child = children.get(i);
			if (isParent[child]) {
				sum += getLeafNumFrom(child);
			} else {
				isParent[child] = true; // parent로 간주.. 아 이래서 isLeaf가 맞았구나.
				sum++;
			}
		}

		return sum;
	}

}
