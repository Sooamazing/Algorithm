package Baekjoon.dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-05-13 120min 참고
// https://www.acmicpc.net/problem/13549
public class HideAndSeek3 {

	static int locationOfOther;
	static int arrSize;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int locationOfSubin = Integer.parseInt(st.nextToken());
		locationOfOther = Integer.parseInt(st.nextToken());
		// arrSize = Math.max(locationOfOther, locationOfSubin) * 2 + 1;
		// times = new int[arrSize];
		// Arrays.fill(times, Integer.MAX_VALUE);

		// getTime(locationOfSubin, 0);

		boolean[] visited = new boolean[100_001];
		PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
			return o1[1] - o2[1];
		});
		pq.add(new int[] {locationOfSubin, 0});
		visited[locationOfSubin] = true;
		int result = 0;

		while (!pq.isEmpty()) {

			int[] cur = pq.poll();

			int location = cur[0];
			int time = cur[1];

			if (location == locationOfOther) {
				result = time;
				break;
			}

			visited[location] = true;

			if (location * 2 <= 100_000 && !visited[location * 2]) {
				pq.add(new int[] {location * 2, time});
			}
			if (location > 0 && !visited[location - 1]) {
				pq.add(new int[] {location - 1, time + 1});

			}
			if (location + 1 < 100_001 && !visited[location + 1]) {
				pq.add(new int[] {location + 1, time + 1});
			}

		}

		System.out.println(result);

	}

	static int[] times;

	// static void getTime(int distance, int time) {
	//
	// 	// 동생 위치와 같다면 종료
	// 	// 수빈이의 위치가 0이면 종료
	// 	if (distance == locationOfOther || distance == 0) {
	// 		times[distance] = Math.min(times[distance], time);
	// 		return;
	// 	}
	//
	// 	if (distance > 0 && distance < arrSize - 1) {
	//
	// 		times[distance] = Math.min(times[distance], time);
	//
	// 		if (distance * 2 < arrSize) {
	// 			// 순간이동
	// 			getTime(distance * 2, time);
	// 		}
	//
	// 		// 이전으로 위치 이동
	// 		getTime(distance - 1, time + 1);
	//
	// 		// 다음으로 위치 이동
	// 		getTime(distance + 1, time + 1);
	//
	// 	}
	//
	// }

}
