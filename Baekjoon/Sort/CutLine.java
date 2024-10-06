package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 24-10-06 5min
// https://www.acmicpc.net/problem/25305
public class CutLine {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int total = Integer.parseInt(st.nextToken());
		int maxPeople = Integer.parseInt(st.nextToken());

		int[] people = new int[total];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < total; i++) {
			people[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(people);

		System.out.println(people[total - maxPeople]);
	}
}
