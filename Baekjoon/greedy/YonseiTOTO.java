package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-09-12 25min
// https://www.acmicpc.net/problem/12018
public class YonseiTOTO {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int subjectNum = Integer.parseInt(st.nextToken());
		int myMileage = Integer.parseInt(st.nextToken());

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < subjectNum; i++) {
			st = new StringTokenizer(br.readLine());
			int applyNum = Integer.parseInt(st.nextToken());
			int maxNum = Integer.parseInt(st.nextToken());
			// 지원자 수가 최대 가능한 수보다 적은 경우 1만 넣어도 가능
			if (applyNum < maxNum) {
				pq.add(1);
				br.readLine(); // 날리는 과정 필요.
				continue;
			}
			int[] applyMileages = new int[applyNum];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < applyNum; j++) {
				applyMileages[j] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(applyMileages);
			pq.add(applyMileages[applyNum - maxNum]);
		}

		int ans = 0;
		while (!pq.isEmpty()) {
			int poll = pq.poll();
			if (myMileage - poll >= 0) { // 같은 경우 포함 필요
				myMileage -= poll;
				ans++;
			}
		}

		System.out.println(ans);
	}
}
