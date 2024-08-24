package Baekjoon.TwoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 24-08-24 5min
// https://www.acmicpc.net/problem/26091
public class HyundaiMobisSoftwareAcademy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int memberNum = Integer.parseInt(st.nextToken());
		int minCapacity = Integer.parseInt(st.nextToken()); // 만족해야 하는 최소 능력치
		int[] memberCapacity = new int[memberNum];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < memberNum; i++) {
			memberCapacity[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(memberCapacity);

		int ans = 0;
		int start = 0;
		int end = memberNum - 1;
		while (start < end) {
			if (memberCapacity[start] + memberCapacity[end] >= minCapacity) {
				// 최소 능력치 이상이면, 정답, 양쪽 인원 전부 빠짐.
				ans++;
				start++;
				end--;
			} else {
				// 최소 능력치 미만이면, 낮은 쪽을 ++;
				start++;
			}
		}

		System.out.println(ans);
	}
}
