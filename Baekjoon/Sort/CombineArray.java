package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 25-04-14 10min
// https://www.acmicpc.net/problem/11728
public class CombineArray {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int total1 = Integer.parseInt(st.nextToken());
		int total2 = Integer.parseInt(st.nextToken());
		int totalAll = total1 + total2;
		int[] array1 = new int[total1];
		int[] array2 = new int[total2];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < total1; i++) {
			array1[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < total2; i++) {
			array2[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(array1);
		Arrays.sort(array2);

		int index1 = 0;
		int index2 = 0;
		for (int i = 0; i < totalAll; i++) {
			if (index1 >= total1) {
				sb.append(array2[index2]).append(" ");
				index2++;
				continue;
			}
			if (index2 >= total2) {
				sb.append(array1[index1]).append(" ");
				index1++;
				continue;
			}
			if (array1[index1] <= array2[index2]) {
				sb.append(array1[index1]).append(" ");
				index1++;
				continue;
			}
			sb.append(array2[index2]).append(" ");
			index2++;
		}

		System.out.println(sb);
	}
}
