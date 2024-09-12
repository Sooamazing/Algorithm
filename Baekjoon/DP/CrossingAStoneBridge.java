package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-07-25 20min
// https://www.acmicpc.net/problem/2602
public class CrossingAStoneBridge {
	static String scroll;
	static String demon;
	static String angel;
	static int bridgeLen;
	static int scrollLen;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		scroll = br.readLine();
		scrollLen = scroll.length();
		demon = br.readLine();
		angel = br.readLine();
		bridgeLen = demon.length();

		int ans = crossing(0, 0, true);
		ans += crossing(0, 0, false);
		System.out.println(ans);

	}

	static int crossing(int scrollIdx, int bridgeIdx, boolean wasDemon) {
		int sum = 0;
		if (scrollIdx == scrollLen) {
			// 두루마리 길이보다 길어지면 성공으로 종료
			return 1;
		}
		if (bridgeIdx == bridgeLen) {
			// 다리 길이보다 길어지면 실패로 종료
			return 0;
		}

		for (int i = bridgeIdx; i < bridgeLen; i++) {
			if (wasDemon) {
				if (scroll.charAt(scrollIdx) == angel.charAt(i)) {
					sum += crossing(scrollIdx + 1, i + 1, !wasDemon);
				}
			} else {
				if (scroll.charAt(scrollIdx) == demon.charAt(i)) {
					sum += crossing(scrollIdx + 1, i + 1, !wasDemon);
				}
			}
		}

		return sum;

		// copilot
		// if (scrollIdx == scrollLen) {
		// 	return 1;
		// }
		// if (idx == bridgeLen) {
		// 	return 0;
		// }
		//
		// int ret = 0;
		// if (scroll.charAt(scrollIdx) == demon.charAt(idx)) {
		// 	ret += crossing(idx + 1, scrollIdx + 1, 1);
		// }
		// if (scroll.charAt(scrollIdx) == angel.charAt(idx)) {
		// 	ret += crossing(idx + 1, scrollIdx + 1, 0);
		// }
		// return ret;
	}
}
