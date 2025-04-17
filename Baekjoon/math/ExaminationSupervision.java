package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-04-17 5min
// https://www.acmicpc.net/problem/13458
public class ExaminationSupervision {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		int[] students = new int[total];
		long result = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < total; i++) {
			students[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int supervisor = Integer.parseInt(st.nextToken());
		int subSupervisor = Integer.parseInt(st.nextToken());
		for (int student : students) {
			result++;
			student -= supervisor;
			if (student > 0) {
				result += student / subSupervisor;
				if (student % subSupervisor != 0) {
					result++;
				}
			}
		}

		System.out.println(result);
	}
}
