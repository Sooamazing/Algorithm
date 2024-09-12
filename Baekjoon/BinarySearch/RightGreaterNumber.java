package Baekjoon.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RightGreaterNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			int curNum = arr[i];

			int idx = Arrays.binarySearch(arr, i, size - 1, curNum + 1);

			if (idx != -1) {
				// curNum + 1 숫자가 있으면
				sb.append(curNum).append(" ");
			} else {
				// +1 숫자가 없으면
				idx = -(idx + 1);
				if (idx <= i) {
					sb.append(-1).append(" ");
				} else {
					sb.append(arr[idx]).append(" ");
				}

			}

		}
		System.out.println(sb);

	}
}
