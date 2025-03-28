package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-03-28 10min
// https://www.acmicpc.net/problem/9655
public class StoneGame {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int restStones = Integer.parseInt(br.readLine());

		boolean isSKTurn = true;

		// 3개씩 묶어 차례 확인
		isSKTurn = (restStones / 3) % 2 == 0 ? !isSKTurn : isSKTurn;
		// 나머지로 차례 확인
		restStones %= 3;
		isSKTurn = restStones % 2 == 0 ? isSKTurn : !isSKTurn;

		System.out.println(isSKTurn ? "SK" : "CY");
	}
}
