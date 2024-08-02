package Baekjoon.dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-08-02 20min
// https://www.acmicpc.net/problem/5972
public class ParcelDeliveryService {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int shedNum = Integer.parseInt(st.nextToken());
		int roadNum = Integer.parseInt(st.nextToken());
		int[] expenses = new int[shedNum + 1];
		List[] roads = new ArrayList[shedNum + 1];
		for (int i = 1; i <= shedNum; i++) {
			roads[i] = new ArrayList<int[]>();
			expenses[i] = Integer.MAX_VALUE;
		}

		for (int i = 0; i < roadNum; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			roads[a].add(new int[] {b, c});
			roads[b].add(new int[] {a, c});
		}

		// 의미 없는 시도.
		// for (int i = 1; i <= roadNum; i++) {
		// 	List<int[]> road = roads[i];
		// 	// 바로 roads[i] 넣으면 <int[]>인지 Generic이 아닌 일반(?)으로 인식돼서 o1[1] 등 배열로 사용 불가.
		// 	Collections.sort(road, (o1, o2) ->
		// 	{
		// 		if (o1[1] == o2[1]) {
		// 			return o1[0] - o2[0];
		// 		}
		// 		return o1[1] - o2[1];
		// 	});
		// }

		PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
			if (o1[1] == o2[1]) {
				return o1[0] - o2[0];
			}
			return o1[1] - o2[1];
		}); // 비용 오름차순
		pq.add(new int[] {1, 0}); // 1부터 시작.
		while (!pq.isEmpty()) {
			int[] poll = pq.poll();
			int curShed = poll[0];
			int curExpense = poll[1];

			if (curShed == shedNum) {
				System.out.println(curExpense);
				return;
			}

			List<int[]> nextRoads = roads[curShed];
			for (int i = 0; i < nextRoads.size(); i++) {
				int[] nextInfo = nextRoads.get(i);
				int nextShed = nextInfo[0];
				int nextExpense = nextInfo[1] + curExpense;
				if (expenses[nextShed] > nextExpense) {
					pq.add(new int[] {nextShed, nextExpense});
					expenses[nextShed] = nextExpense;
				}
			}
		}

	}
}
