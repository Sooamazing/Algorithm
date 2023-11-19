package CodingTest.Goorm;

import java.io.*;
import java.util.*;

// 18
// 5 6 4 1 4 12 4 11 5 4 3 2 4 13 5 4 2 5

// 10
// 1 2 3 10 4 3 13 12 8 7

class OneCardStairs {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] result = new int[13 + 1];
		int prev = -1;
		int cur = -1;

		int cnt = 0;
		boolean flag = false;

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			cur = arr[i] = Integer.parseInt(st.nextToken());

			if (Math.abs(cur - prev) == 1) {
				result[prev] += 1;
				flag = true;
			} else {
				if (flag) {
					result[prev] += 1;
					cnt++;
					flag = false;
				}
			}

			prev = cur;

		}

		if (flag) {
			result[prev] += 1;
			cnt++;
			flag = false;
		}

		for (int i = 1; i < 13 + 1; i++) {
			sb.append(result[i]).append(' ');
		}

		System.out.println(cnt);
		System.out.println(sb);

	}
}
