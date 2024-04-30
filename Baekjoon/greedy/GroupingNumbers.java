package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

// 24-04-30 35min
// https://www.acmicpc.net/problem/1744
public class GroupingNumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> positivePq = new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<Integer> negativePq = new PriorityQueue<>();

		boolean existZero = false;
		for (int i = 0; i < size; i++) {
			int curNum = Integer.parseInt(br.readLine());

			if (curNum == 0) {
				existZero = true;
			} else if (curNum > 0) {
				// 양수
				positivePq.add(curNum);
			} else {
				// 음수
				negativePq.add(curNum);
			}

		}

		int sum = 0;

		// 1개 이하일 때까지 더해주기
		while (positivePq.size() > 1) {

			int cur1 = positivePq.poll();
			int cur2 = positivePq.poll();

			if (cur2 == 1) {
				// 1이 포함된 경우 무조건 더해야 함. (1, 1), (1, 2) ...
				sum += (cur1 + cur2);
			} else {
				sum += (cur1 * cur2);
			}

		}
		// 1개인 경우, 따로 더하기.
		if (positivePq.size() == 1) {
			sum += positivePq.poll();
		}

		// 1개 이하일 때까지 더해주기
		while (negativePq.size() > 1) {

			int cur1 = negativePq.poll();
			int cur2 = negativePq.poll();

			sum += (cur1 * cur2);

		}

		// 1개 남았고, 0이 없으면 음수 그대로 더하기. (0이 있으면 0이라 아무 처리도 안 함)
		if (negativePq.size() == 1 && !existZero) {
			sum += negativePq.poll();
		}

		System.out.println(sum);

	}
}
