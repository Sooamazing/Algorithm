package Baekjoon.slidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 24-07-13 15min
// https://www.acmicpc.net/problem/15565
public class CuteLion {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int totalNum = Integer.parseInt(st.nextToken());
		int minLionNum = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int curLionNum = 0;
		List<Integer> lions = new ArrayList<>();
		lions.add(-1); // idx와 lion 수 맞추기 위해 임의값 맨 처음에 넣어줌.
		// int ans = Integer.MAX_VALUE;
		int ans = totalNum + 1; // 최대는 totalNum + 1 충분.
		for (int i = 1; i <= totalNum; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (num == 1) {
				lions.add(i);
				curLionNum++; // lions size와 같음.
				int leftLionIdx = curLionNum - minLionNum + 1;
				if (leftLionIdx >= 0) {
					int rightLion = lions.get(curLionNum);
					int leftLion = lions.get(leftLionIdx);
					ans = Math.min(ans, rightLion - leftLion + 1);
				}
			}
		}

		// 만족하는 경우가 없었다면 -1 출력.
		System.out.println(ans == totalNum + 1 ? -1 : ans);

	}
}
