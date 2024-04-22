package Baekjoon.TwoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 24-04-22 50min
// https://www.acmicpc.net/problem/2230
public class ChooseTheNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		int targetDifference = Integer.parseInt(st.nextToken());
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);

		int startIdx = 0;
		int endIdx = 1; // size==1 ?
		int minDifference = Integer.
			MAX_VALUE;
		while (endIdx <= size - 1) {
			int startValue = arr[startIdx];
			int endValue = arr[endIdx];
			int difference = endValue - startValue;
			if (difference > targetDifference) {
				// M보다 차이가 큰 경우, 왼쪽을 이동한다.
				startIdx++;
				minDifference = Math.min(minDifference, difference);
			} else if (difference < targetDifference) {
				// M보다 차이가 작은 경우, 오른쪽을
				endIdx++;
			} else {
				// 같으면
				minDifference = difference;
				break;
			}
		}

		System.out.println(minDifference);

	}
}
