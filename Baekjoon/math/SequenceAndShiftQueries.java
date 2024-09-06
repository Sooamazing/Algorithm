package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-09-06 20min
// https://www.acmicpc.net/problem/17499
public class SequenceAndShiftQueries {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		int[] arr = new int[size];
		int operNum = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int idx = 0;
		for (int i = 0; i < operNum; i++) {
			st = new StringTokenizer(br.readLine());
			int cmd = Integer.parseInt(st.nextToken());
			int distance;
			if (cmd == 1) {
				distance = Integer.parseInt(st.nextToken()) - 1;
				int plusNum = Integer.parseInt(st.nextToken());
				arr[(idx + distance) % size] += plusNum;
			} else if (cmd == 2) {
				distance = Integer.parseInt(st.nextToken());
				idx = (idx - distance) < 0 ? idx - distance + size : idx - distance;
			} else {
				distance = Integer.parseInt(st.nextToken());
				idx = (idx + distance) % size;
			}
		}

		for (int i = 0; i < size; i++) {
			sb.append(arr[(i + idx) % size]).append(" ");
		}

		System.out.println(sb);

	}
}
