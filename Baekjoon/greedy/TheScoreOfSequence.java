package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

// 24-05-08 20min
// https://www.acmicpc.net/problem/2036
public class TheScoreOfSequence {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pList = new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<Integer> nList = new PriorityQueue<>();
		boolean existZero = false;

		for (int i = 0; i < size; i++) {
			int curNum = Integer.parseInt(br.readLine());
			if (curNum > 0) {
				// 양수이면
				pList.add(curNum);
			} else if (curNum < 0) {
				// 음수이면
				nList.add(curNum);
			} else {
				// 0이면
				existZero = true;
			}
		}

		long resultSum = 0;

		// 양수이면 1인 경우 제외하고 두 개씩 곱하기.
		while (pList.size() > 1) {
			int a = pList.poll();
			int b = pList.poll();
			// 1인 경우, 더해야 함.
			// 각 절댓값 최대가 1000000이므로, int 범위를 넘어갈 수 있음. long으로 형변환 필수.
			long sum = b == 1 ? a + b : (long)a * b;

			resultSum += sum;
		}

		if (pList.size() == 1) {
			resultSum += pList.poll();
		}

		// 음수인 경우, 2개씩 곱하기.
		while (nList.size() > 1) {
			int a = nList.poll();
			int b = nList.poll();
			// 각 절댓값 최대가 1000000이므로, int 범위를 넘어갈 수 있음. long으로 형변환 필수.
			long sum = (long)a * b;
			
			resultSum += sum;
		}

		// 0이 없고, 음수가 1개 남아 있으면, 그대로 더하기.
		if (!existZero && nList.size() > 0) {
			resultSum += nList.poll();
		}

		System.out.println(resultSum);
	}
}
