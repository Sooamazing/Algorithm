package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-01-01 1min
// https://www.acmicpc.net/problem/13866
public class TeamDivision {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[4];
		// 오름차순 정렬로 주어짐
		for (int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(Math.abs((arr[0] + arr[3]) - (arr[1] + arr[2])));
	}
}
