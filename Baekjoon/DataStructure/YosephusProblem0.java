package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;

// 24-11-24 10min
// https://www.acmicpc.net/problem/11866
public class YosephusProblem0 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringJoiner sj = new StringJoiner(", ", "<", ">");

		StringTokenizer st = new StringTokenizer(br.readLine());
		int people = Integer.parseInt(st.nextToken());
		int skip = Integer.parseInt(st.nextToken());
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= people; i++) {
			list.add(i);
		}

		int index = 0;
		while (people > 0) {
			index += skip - 1;
			if (index >= people) {
				index %= people;
			}
			sj.add(String.valueOf(list.get(index)));
			list.remove(index);
			people--;
		}

		// int[] arr = new int[people];
		// for (int i = 0; i < people; i++) {
		// 	arr[i] = i + 1;
		// }
		//
		// int index = 0;
		// int count = 0;
		// while (people > 0) {
		// 	if (arr[index] != 0) {
		// 		count++;
		// 	}
		// 	if (count == skip) {
		// 		sj.add(String.valueOf(arr[index]));
		// 		arr[index] = 0;
		// 		count = 0;
		// 		people--;
		// 	}
		// 	index++;
		// 	if (index == arr.length) {
		// 		index = 0;
		// 	}
		// }

		System.out.println(sj);

	}
}
