package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

// 24-08-18 5min
// https://www.acmicpc.net/problem/1417
public class ParliamentaryElection {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int candidatesNum = Integer.parseInt(br.readLine());
		int dasom = Integer.parseInt(br.readLine());
		candidatesNum--;

		// 가장 많은 득표수를 가진 후보보다 많기만 하면 됨
		// PriorityQueue, reverseOrder 순서 이용해 정렬.
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		for (int i = 0; i < candidatesNum; i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}

		int cnt = 0;
		// 다솜이 득표수가 가장 많은 후보보다 많을 때까지 반복
		while (!pq.isEmpty() && dasom <= pq.peek()) {
			int poll = pq.poll();

			pq.add(poll - 1); // 다른 후보 득표-1
			dasom++; // 다솜 득표+1
			cnt++; // 정답
		}

		System.out.println(cnt);
	}
}
