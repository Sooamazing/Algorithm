package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10
// 5
// 1
// 4
// 1
// 3
// 1
// 2
// 1
// 1
// 1
// 24
// 24-07-15 25min
// https://www.acmicpc.net/problem/6198
public class DecoratingTheRooftopGarden {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());

		int[] buildingHeights = new int[size];
		for (int i = 0; i < size; i++) {
			buildingHeights[i] = Integer.parseInt(br.readLine());
		}

		// 10 3 7 4 12 2
		long result = 0;
		for (int i = 0; i < size; i++) {
			int cur = buildingHeights[i];
			int ans = 0;
			for (int j = i + 1; j < size; j++) {
				if (cur <= buildingHeights[j]) {
					// result += ans; -> 오류.
					break;
				}
				ans++;
			}
			result += ans;
		}

		System.out.println(result);

	}
}
