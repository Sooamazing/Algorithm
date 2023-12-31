// https://www.acmicpc.net/problem/1138

package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class StandingInALine {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		String[] split = br.readLine().split(" ");
		List<Integer> list = new LinkedList<>();
		int cnt = N;
		for (int i = split.length - 1; i >= 0; i--) {
			int idx = Integer.parseInt(split[i]);
			list.add(idx, cnt--);
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append(' ');
		}
		System.out.println(sb);

	}
}
