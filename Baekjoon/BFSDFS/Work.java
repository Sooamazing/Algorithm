package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-08-11 10min
// https://www.acmicpc.net/problem/21937
public class Work {
	static int nodeNum;
	static int edgeNum;
	static Queue<Integer>[] edges; // 한 번만 사용할 거라 배열이 아닌 Queue로 진행.
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		nodeNum = Integer.parseInt(st.nextToken());
		edgeNum = Integer.parseInt(st.nextToken());
		edges = new Queue[nodeNum + 1];
		visited = new boolean[nodeNum + 1];
		for (int i = 1; i <= nodeNum; i++) {
			edges[i] = new java.util.LinkedList<>();
		} // queue[] 초기화

		for (int i = 0; i < edgeNum; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			edges[b].add(a); // b를 하기 위해 a를 먼저 해야 함.
		}

		System.out.println(howManyPreviousWorksNum(Integer.parseInt(br.readLine())));

	}

	static int howManyPreviousWorksNum(int goal) {

		int ans = 0;

		Queue<Integer> workStation = new LinkedList<>(); // 작업대

		workStation.add(goal);
		visited[goal] = true;

		while (!workStation.isEmpty()) {
			int poll = workStation.poll();
			Queue<Integer> works = edges[poll]; // 해야 할 이전 작업들
			while (!works.isEmpty()) {
				int temp = works.poll();
				// 작업한 적 없으면, 작업대에 올리고, 방문 처리 및 정답++
				if (!visited[temp]) {
					workStation.add(temp);
					visited[temp] = true;
					ans++;
				}
			}
		}
		return ans;
	}
}
