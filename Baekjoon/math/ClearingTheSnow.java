package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-08-29 23:15
// https://www.acmicpc.net/problem/26215
public class ClearingTheSnow {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int housesNum = Integer.parseInt(br.readLine());
		if (housesNum == 1) {
			System.out.println(housesNum > 1440 ? -1 : Integer.parseInt(br.readLine()));
			return;
		}

		StringTokenizer st = new StringTokenizer(br.readLine());

		PriorityQueue<Integer> houses = new PriorityQueue<>(Comparator.reverseOrder());
		for (int i = 0; i < housesNum; i++) {
			int cur = Integer.parseInt(st.nextToken());
			houses.add(cur);
		}
		// 5 5 5
		// 5 4 3 -> 2 2 3
		int poll_1 = houses.poll();
		int minutes = 0;
		while (!houses.isEmpty()) {
			int poll_2 = houses.poll();
			minutes += (poll_1 - poll_2) + 1;
			while (!houses.isEmpty()
				&& houses.peek() <= poll_2
				&& poll_2 != 0) {
				poll_1 = poll_2-- - 1;
				minutes++;
			}
			if (!houses.isEmpty()) {
				poll_1 = houses.poll();
			}
			if (poll_2 != 0) {
				houses.add(poll_2);
			}
		}
		System.out.println(minutes - 1 > 1440 ? -1 : minutes - 1);
	}
}
