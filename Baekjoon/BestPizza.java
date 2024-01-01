// https://www.acmicpc.net/problem/5545

package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BestPizza {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String[] split = br.readLine().split(" ");
		int A = Integer.parseInt(split[0]);
		int B = Integer.parseInt(split[1]);
		int dough = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

		for (int i = 0; i < N; i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}

		int prevWeight = dough;
		int prevPrice = A;
		int result = 0;

		while (!pq.isEmpty()) {

			// 62%  틀림.. 왜지.
			int curWeight = prevWeight + pq.poll();
			int curPrice = prevPrice + B;

			if (prevWeight * curPrice <= curWeight * prevPrice) {
				prevWeight = curWeight;
				prevPrice = curPrice;
			} else {
				break;
			}

		}
		result = prevWeight / prevPrice;
		System.out.println(result);
	}
}
