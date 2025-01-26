package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-01-26 5min
// https://www.acmicpc.net/problem/1817
public class ShomPacking {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int books = Integer.parseInt(st.nextToken()); // 0<= books <=50
		int maxWeight = Integer.parseInt(st.nextToken()); // maxWeight <= 1000

		if (books == 0) {
			System.out.println(0);
			return;
		}

		int box = 1;
		int currentWeightSum = 0;
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < books; i++) {
			int weight = Integer.parseInt(st.nextToken());
			if (currentWeightSum + weight <= maxWeight) {
				currentWeightSum += weight;
				continue;
			}
			box++;
			currentWeightSum = weight;
		}

		System.out.println(box);

	}
}
