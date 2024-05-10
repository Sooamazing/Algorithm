package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 24-05-10 12min
// https://www.acmicpc.net/problem/15665
public class NAndM11 {
	static int goalNum;
	static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int size = Integer.parseInt(st.nextToken());
		goalNum = Integer.parseInt(st.nextToken());
		temp = new int[goalNum];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < size; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (!list.contains(num)) {
				list.add(num);
			}
		}
		list.sort(Integer::compareTo);
		backtracking(0);

		System.out.println(sb);

	}

	static StringBuilder sb = new StringBuilder();

	static int[] temp;

	static void backtracking(int depth) {
		if (depth == goalNum) {
			for (int i = 0; i < goalNum; i++) {
				sb.append(temp[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 0; i < list.size(); i++) {
			temp[depth] = list.get(i);
			backtracking(depth + 1);
		}

	}
}
