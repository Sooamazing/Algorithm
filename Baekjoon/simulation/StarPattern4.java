package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-02-08 5min
// https://www.acmicpc.net/problem/2441
// *****
//  ****
//   ***
//    **
//     *
public class StarPattern4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int floor = Integer.parseInt(br.readLine());
		for (int i = 0; i < floor; i++) {
			sb.append(" ".repeat(i)).append("*".repeat(floor - i)).append("\n");
		}

		System.out.println(sb);
	}
}
