package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-05-31 20min
// https://www.acmicpc.net/problem/24484
public class AlgorithmClass_DFS6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int nodeNum = Integer.parseInt(st.nextToken());
		int edgeNum = Integer.parseInt(st.nextToken());
		int startNodeNum = Integer.parseInt(st.nextToken());

		PriorityQueue<Integer>[] edges = new PriorityQueue[nodeNum + 1];
		for (int i = 1; i <= nodeNum; i++) {
			edges[i] = new PriorityQueue<>(Comparator.reverseOrder());
		}

		for (int i = 0; i < edgeNum; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			edges[a].add(b);
			edges[b].add(a);
		}
		int[] visitOrders = new int[nodeNum + 1];

		calculate(visitOrders, edges, startNodeNum, 0);

		System.out.println(sum);

	}

	static long sum;
	static int visitOrder;

	static void calculate(int[] visitOrders, PriorityQueue<Integer>[] edges, int curNode, long depth) {

		sum += (++visitOrder * depth);
		visitOrders[curNode] = visitOrder;

		while (!edges[curNode].isEmpty()) {
			int tempNode = edges[curNode].poll();
			if (visitOrders[tempNode] == 0) {
				calculate(visitOrders, edges, tempNode, depth + 1);
			}
		}

	}
}
