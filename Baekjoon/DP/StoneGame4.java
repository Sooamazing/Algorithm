package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-03-29 5min
// https://www.acmicpc.net/problem/9658
// 참고: https://www.acmicpc.net/board/view/26161
public class StoneGame4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		boolean isSKTurn = total % 7 == 1 || total % 7 == 3;
		// total %= 8; // 8개 주기
		// switch (total) {
		// 	case 0, 2, 5, 7:
		// 		isMyTurn = false;
		// 		break;
		// 	default:
		// 		break;
		// }
		System.out.println(isSKTurn ? "CY" : "SK");
	}
}
