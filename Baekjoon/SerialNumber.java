package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// https://www.acmicpc.net/problem/1431
public class SerialNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int serialNumber = Integer.parseInt(br.readLine());

		PriorityQueue<String> pq = new PriorityQueue<>(
			(o1, o2) -> {
				if (o1.length() == o2.length()) {
					int sum1 = getSumPerChar(o1);
					int sum2 = getSumPerChar(o2);

					if (sum1 == sum2) {
						return o1.compareTo(o2);
					} else if (sum1 > sum2) {
						return 1;
					} else {
						return -1;
					}
				}
				return o1.length() - o2.length();
			}
		);

		for (int i = 0; i < serialNumber; i++) {
			pq.add(br.readLine());
		}

		while (!pq.isEmpty()) {
			sb.append(pq.poll()).append('\n');
		}

		System.out.println(sb);

	}

	private static int getSumPerChar(String o1) {
		int sum = 0;
		for (int i = 0; i < o1.length(); i++) {
			int cur = o1.charAt(i) - '0';
			if (cur >= 0 && cur <= 9) {
				sum += cur;
			}
		}
		return sum;
	}
	
}
