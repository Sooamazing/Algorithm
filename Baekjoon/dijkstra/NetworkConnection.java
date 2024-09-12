package Baekjoon.dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-06-19 30min
// https://www.acmicpc.net/problem/1922
// 왜 다익스트라가 아니지? 시간 초과...
// union-find 참고 https://www.acmicpc.net/board/view/41655
public class NetworkConnection {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int computerNum = Integer.parseInt(st.nextToken());
		int lineNum = Integer.parseInt(br.readLine());

		List[] computers = new List[computerNum + 1];
		for (int i = 1; i <= computerNum; i++) {
			computers[i] = new ArrayList<int[]>();
		}

		for (int i = 0; i < lineNum; i++) {

			// 무방향, 본인과 연결하는 선도 존재.
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if (a == b)
				continue;

			computers[a].add(new int[] {b, c});
			computers[b].add(new int[] {a, c});
		}

		int minExpense = Integer.MAX_VALUE;
		for (int i = 1; i <= computerNum; i++) {
			PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
			pq.add(new int[] {i, 0});
			boolean[] visit = new boolean[computerNum + 1];
			int[] result = new int[computerNum + 1];

			int sum = 0;
			while (!pq.isEmpty()) {
				int[] curInfo = pq.poll();
				int curComNum = curInfo[0];
				int curExpense = curInfo[1];
				if (visit[curComNum]) {
					continue;
				}
				visit[curComNum] = true;
				List<int[]> adjs = computers[curComNum];
				for (int j = 0; j < adjs.size(); j++) {
					int[] adjInfo = adjs.get(j);
					int adjComNum = adjInfo[0];
					int adjExpense = adjInfo[1];
					int nowExpense = curExpense + adjExpense;
					if (adjComNum != i && !visit[adjComNum]) {
						// visit[adjComNum] = nowExpense;
						// visit[adjComNum] = true;
						result[adjComNum] = adjExpense;
						// sum += adjExpense;
						pq.add(new int[] {adjComNum, nowExpense});
					}
				}
			}

			boolean isAllConnected = true;
			for (int j = 1; j <= computerNum; j++) {
				// if (i != j) {
				if (!visit[j]) {
					isAllConnected = false;
					break;
				}
				sum += result[j];
				// }
			}
			if (isAllConnected) {
				minExpense = Math.min(minExpense, sum);
			}
		}

		System.out.println(minExpense);

	}
}
