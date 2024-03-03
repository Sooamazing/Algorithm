package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Treasure {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		int[] b = new int[n];

		String[] split = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(split[i]);
		}

		split = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(split[i]);
		}        // 입력 완료

		int sum = 0;

		Arrays.sort(a);
		// Collections.reverseOrder()는 Primitive type에 대해서는 사용 X
		Arrays.sort(b);
		for (int i = 0; i < n; i++) {
			sum += a[i] * b[n - i - 1];
		}

		// copilot's solution
		// for (int i = 0; i < n; i++) {
		// 	int max = 0;
		// 	int maxIndex = 0;
		// 	for (int j = 0; j < n; j++) {
		// 		if (max < a[j]) {
		// 			max = a[j];
		// 			maxIndex = j;
		// 		}
		// 	}
		// 	a[maxIndex] = 0;
		//
		// 	int min = 1001;
		// 	int minIndex = 0;
		// 	for (int j = 0; j < n; j++) {
		// 		if (min > b[j]) {
		// 			min = b[j];
		// 			minIndex = j;
		// 		}
		// 	}
		// 	b[minIndex] = 1001;
		// 	sum += max * min;
		// }

		System.out.println(sum);
	}
}
