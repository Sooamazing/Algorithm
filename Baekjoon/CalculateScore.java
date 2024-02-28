package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// https://www.acmicpc.net/problem/2822
public class CalculateScore {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<int[]> list = new ArrayList<>();

		for (int i = 0; i < 8; i++) {
			list.add(new int[] {i + 1, Integer.parseInt(br.readLine())});
		}

		list.sort((o1, o2) -> {
			return o2[1] - o1[1];
		});

		int sum = 0;
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			sum += list.get(i)[1];
			result.add(list.get(i)[0]);
		}

		result.sort((o1, o2) -> {
			return o1 - o2;
		});

		System.out.println(sum);

		for (int i : result) {
			System.out.print(i + " ");
		}

	}

}
