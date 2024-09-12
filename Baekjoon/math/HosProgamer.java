package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-07-26 25min 시간초과
// https://www.acmicpc.net/problem/16564
public class HosProgamer {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int characterNum = Integer.parseInt(st.nextToken());
		int couldLevelNum = Integer.parseInt(st.nextToken());

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < characterNum; i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}

		if (characterNum == 1) {
			System.out.println(pq.poll() + couldLevelNum);
			return;
		}

		int ans = 0;
		while (couldLevelNum > 0 && !pq.isEmpty()) {
			int poll = pq.poll();
			int next = pq.peek();
			int diff = next - poll;
			if (diff > 0) {
				if (couldLevelNum > diff) {
					couldLevelNum -= (diff + 1);
					pq.add(next + 1);
				} else {
					System.out.println(poll + couldLevelNum);
					return;
				}
				// copilot
				// int diff = next - poll - 1;
				// if (diff * (characterNum - 1) <= couldLevelNum) {
				// 	ans += diff;
				// 	couldLevelNum -= diff * (characterNum - 1);
				// } else {
				// 	ans += couldLevelNum / (characterNum - 1);
				// 	couldLevelNum = 0;
				// }
			} else {
				pq.add(poll + 1);
				couldLevelNum--;
			}
		}

		System.out.println(pq.poll());
	}
}
