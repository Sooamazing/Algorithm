package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-08-06 23:40
// https://www.acmicpc.net/problem/1292
public class EasyProblem {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());

		// int idx = 1;
		// int sum = 0;
		// int ans = 0;
		// while (true) {
		// 	sum += idx++;
		// 	if (sum >= start)
		// 		break;
		// }
		//
		// ans += ((idx - 1) * (sum - start + 1));
		// if (end <= sum) {
		// 	System.out.println(ans+((end-start+1)*(idx-1)));
		// 	return;
		// }
		//
		// while (true) {
		// 	sum += idx;
		// 	if (sum > end)
		// 		break;
		// 	ans += (idx * (idx + 1) / 2);
		// 	idx++;
		// }
		//
		// System.out.println(ans);

		int sum = 0;
		int[] arr = new int[end + 1];
		int num = 1;
		for (int i = 1; i <= end; i++) {
			arr[i] = num;
			if (num == i) {
				num++;
			}
		}

		sum = 0;
		for (int i = start; i <= end; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
