package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-06-11 40min
// https://www.acmicpc.net/problem/2564
public class SecurityGuard {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int width = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken());

		int shopNum = Integer.parseInt(br.readLine());
		int[][] shop = new int[shopNum][2];
		for (int i = 0; i < shopNum; i++) {
			st = new StringTokenizer(br.readLine());
			int shopDir = Integer.parseInt(st.nextToken());
			int shopDistance = Integer.parseInt(st.nextToken());
			shop[i] = new int[] {shopDir, shopDistance};
		}
		st = new StringTokenizer(br.readLine());
		int guardDir = Integer.parseInt(st.nextToken());
		int guardDistance = Integer.parseInt(st.nextToken());

		int result = 0;
		for (int i = 0; i < shopNum; i++) {
			int shopDir = shop[i][0];
			int shopDistance = shop[i][1];

			int directionMult = shopDir * guardDir;
			if (shopDir == guardDir) {
				// 같은 방향에 있는 경우
				result += (Math.abs(shopDistance - guardDistance));
			} else if (directionMult == 2 || directionMult == 12) {
				// 마주보는 경우
				if (directionMult == 2) {
					result += Math.min((shopDistance + guardDistance), (2 * width - (shopDistance + guardDistance)));
					result += height;
				} else {
					result += Math.min((shopDistance + guardDistance), (2 * height - (shopDistance + guardDistance)));
					result += width;
				}
			} else {
				// 옆에 붙어 있는 경우
				if (directionMult == 3) {
					result += (shopDistance + guardDistance);
				} else if (directionMult == 6) {
					if (guardDir == 2) {
						result += (guardDistance + height - shopDistance);
					} else {
						result += (shopDistance + height - guardDistance);
					}
				} else if (directionMult == 4) {
					if (guardDir == 1) {
						result += (shopDistance + width - guardDistance);
					} else {
						result += (guardDistance + width - shopDistance);
					}
				} else {
					// 8
					result += (height + width - (shopDistance + guardDistance));
				}

			}
		}
		System.out.println(result);

	}
}
