package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// 24-04-24 15min
// https://www.acmicpc.net/problem/15666
public class NAndM12 {

	static int targetSize;
	static int arrSize;
	static StringBuilder sb;
	static List<Integer> list;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());

		arrSize = Integer.parseInt(st.nextToken());
		targetSize = Integer.parseInt(st.nextToken());

		list = new ArrayList<>();
		int[] originArr = new int[arrSize];
		temp = new int[targetSize];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arrSize; i++) {
			Integer curNum = Integer.parseInt(st.nextToken());
			if (!list.contains(curNum)) {
				list.add(curNum);
			}
		}
		Collections.sort(list);

		arrSize = list.size();

		backtracking(0, 0);
		System.out.println(sb);

	}

	static int[] temp;

	static void backtracking(int depth, int curIdx) {

		if (depth == targetSize) {
			for (int cur : temp) {
				sb.append(cur).append(' ');
			}
			sb.append('\n');
			return;
		}

		// 중복 O, 비내림차순
		for (int i = curIdx; i < arrSize; i++) {
			temp[depth] = list.get(i);
			backtracking(depth + 1, i);

		}

	}

}
