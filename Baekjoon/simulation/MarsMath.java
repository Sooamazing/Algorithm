package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-05-04 5min
// https://www.acmicpc.net/problem/5355
public class MarsMath {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int test = Integer.parseInt(br.readLine());
		while (test-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double number = Double.parseDouble(st.nextToken());
			while (st.hasMoreTokens()) {
				switch (st.nextToken()) {
					case "@":
						number *= 3;
						break;
					case "%":
						number += 5;
						break;
					case "#":
						number -= 7;
				}
			}
			sb.append(String.format("%.2f", number)).append("\n");
		}

		System.out.println(sb);
	}
}
