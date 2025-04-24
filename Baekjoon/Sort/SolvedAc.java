package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 25-04-24 10min
// https://www.acmicpc.net/problem/18110
public class SolvedAc {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		int round = (int)Math.round(total * 0.15);
		int[] array = new int[total];
		for (int i = 0; i < total; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(array);

		int sum = 0;
		for (int i = round; i < total - round; i++) {
			sum += array[i];
		}
		int average = (int)Math.round((sum) / (double)(total - 2 * round));
		System.out.println(average);

	}
}
