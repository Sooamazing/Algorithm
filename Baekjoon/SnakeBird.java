package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 24-03-31
// https://www.acmicpc.net/problem/16435
public class SnakeBird {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		String[] split = br.readLine().split(" ");

		int fruitNum = Integer.parseInt(split[0]);
		int snakeLength = Integer.parseInt(split[1]);

		split = br.readLine().split(" ");

		for (int i = 0; i < fruitNum; i++) {
			pq.add(Integer.parseInt(split[i]));
		}

		while (!pq.isEmpty()) {
			int cur = pq.poll();
			if (cur <= snakeLength) {
				snakeLength++;
			} else {
				break;
			}
		}
		System.out.println(snakeLength);

	}
}
