package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 24-04-16 120min (Hint)
// https://www.acmicpc.net/problem/2785
public class Chain {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int numSize = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[numSize];
		for (int i = 0; i < numSize; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);

		int startIdx = 0;
		int endIdx = numSize - 1;

		int answer = 0;

		// startIdx가 endIdx를 넘어가면 종료.
		while (startIdx < endIdx) {

			arr[endIdx--] = 0;
			arr[startIdx]--;
			answer++;

			if (arr[startIdx] == 0) {
				++startIdx;

				// if (arr[startIdx] == 0)
				// 	break;
			}

		}

		// splitNum이 남아 있으면 그것과 연결 - 1개, 2개 이상(answer+=2) 구분.
		// if (arr[startIdx] >= 1) {
		// 	answer++;
		// }

		System.out.println(answer);

	}
}
