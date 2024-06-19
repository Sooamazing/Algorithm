package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 4
// 17 63
// 32 95
// 38 129
// 11 104
// 24-06-19 50min
// https://www.acmicpc.net/problem/6068
// 참고: https://moonsbeen.tistory.com/367
public class TimeManagement {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int scheduleNum = Integer.parseInt(br.readLine());

		StringTokenizer st;
		PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

		int originStartTimeIdx = 0;
		int getUpTime = Integer.MAX_VALUE;
		int endTime = 0;
		for (int i = 0; i < scheduleNum; i++) {
			st = new StringTokenizer(br.readLine());
			int time = Integer.parseInt(st.nextToken());
			int dueTime = Integer.parseInt(st.nextToken());
			pq.add(new int[] {time, dueTime, i});
			if (getUpTime > (dueTime - time)) {
				getUpTime = Math.min(getUpTime, dueTime - time);
				endTime = dueTime;
				originStartTimeIdx = i;
			}
		}

		boolean allOk = true;

		int totalTime = 0;
		int ans = Integer.MAX_VALUE;
		while (!pq.isEmpty()) {
			int[] curSchedule = pq.poll();
			int time = curSchedule[0];
			int dueTime = curSchedule[1];
			totalTime += time;
			if (totalTime > dueTime) {
				allOk = false;
				break;
			}
			ans = Math.min(ans, dueTime - totalTime);
		}

		// 이거 왜 틀렸지? 31%...
		// while (!pq.isEmpty()) {
		// 	int[] curSchedule = pq.poll();
		// 	int time = curSchedule[0];
		// 	int dueTime = curSchedule[1];
		// 	if (originStartTimeIdx == curSchedule[2]) {
		// 		continue;
		// 	}
		// 	if (endTime + time <= dueTime) {
		// 		endTime += time;
		// 	} else {
		// 		long exceedTime = (endTime + time) - dueTime;
		// 		if (getUpTime - exceedTime >= 0) {
		// 			getUpTime -= exceedTime;
		// 			endTime = endTime + time - exceedTime;
		// 		} else {
		// 			allOk = false;
		// 			break;
		// 		}
		// 	}
		// }

		// 하루의 끝 시간은 언제?
		if (!allOk) {
			System.out.println(-1);
		} else {
			// System.out.println(getUpTime);
			System.out.println(ans);
		}

	}
}
