package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

// https://www.acmicpc.net/problem/10815
public class NumberCard {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		String[] cards = br.readLine().split(" ");
		Set<String> cardSet = Set.of(cards);
		int M = Integer.parseInt(br.readLine());
		String[] numbers = br.readLine().split(" ");

		for (int i = 0; i < M; i++) {
			if (cardSet.contains(numbers[i])) {
				sb.append("1 ");
			} else {
				sb.append("0 ");
			}
		}
		System.out.println(sb);
	}
}
