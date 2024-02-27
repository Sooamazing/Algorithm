package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Maximum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
			if (o1[0] == o2[0]) {
				return o2[1] - o1[1];
			}
			return o2[0] - o1[0];
		});
		for (int i = 0; i < 9; i++) {

			pq.add(new int[] {Integer.parseInt(br.readLine()), i + 1});

		}

		int[] max = pq.poll();
		System.out.println(max[0] + "\n" + max[1]);

	}
}
