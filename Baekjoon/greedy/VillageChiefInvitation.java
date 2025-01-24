package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 25-01-24 15min
// https://www.acmicpc.net/problem/9237
public class VillageChiefInvitation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tree = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int result = 0;
		int[] trees = new int[tree];
		for (int i = 0; i < tree; i++) {
			trees[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(trees);
		for (int i = 1; i <= tree; i++) {
			result = Math.max(i + trees[tree - i] + 1, result);
		}

		System.out.println(result);
	}
}
