package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-04-05
// https://www.acmicpc.net/problem/11779
public class GetMinimumExpense2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cityNum = Integer.parseInt(br.readLine());
		int busNum = Integer.parseInt(br.readLine());
		int[] expenses = new int[cityNum + 1];
		int[] previous = new int[cityNum + 1];
		PriorityQueue<int[]> pq = new PriorityQueue<>();
		// List<List<int[]>> list = new ArrayList<>(); // list 배열도 만드나?

		Map<Integer, List<int[]>> busMap = new HashMap<>();
		for (int i = 1; i <= busNum; i++) {
			busMap.put(i, new ArrayList<>());
		}

		StringTokenizer st;
		for (int i = 0; i < busNum; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int expense = Integer.parseInt(st.nextToken());

			// 어디에 담지?
			List<int[]> startList = busMap.get(start);
			// 비용, 도착지
			startList.add(new int[] {expense, end});

		}
		st = new StringTokenizer(br.readLine());

		int startCity = Integer.parseInt(st.nextToken());
		int endCity = Integer.parseInt(st.nextToken());

		int curIdx = 1;
		for (int[] temp : busMap.get(1)) {
			pq.add(temp);
		}
		while (!pq.isEmpty()) {

			int[] cur = pq.poll();
			int curExpense = cur[0];
			int curEndCity = cur[1];

			// 도착지 비용이 expenses의 도시와 같으면 pass
			if (curExpense == expenses[curEndCity]) {
				continue;
			}

			//

		}

	}
}
