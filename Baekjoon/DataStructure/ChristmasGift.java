package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

// 24-04-12 10min
// https://www.acmicpc.net/problem/14235
public class ChristmasGift {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int size = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

		for (int i = 0; i < size; i++) {
			String[] split = br.readLine().split(" ");
			if (split[0].equals("0")) {
				if (!pq.isEmpty()) {
					sb.append(pq.poll());
					sb.append('\n');
				} else {
					sb.append("-1");
					sb.append('\n');
				}
			} else {
				int queSize = Integer.parseInt(split[0]);
				for (int j = 1; j <= queSize; j++) {
					pq.add(Integer.parseInt(split[j]));
				}
			}

		}
		System.out.println(sb);
	}
}
