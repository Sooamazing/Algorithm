package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

// 24-08-06 5min
// https://www.acmicpc.net/problem/17219
public class FindPassword {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int passwordNum = Integer.parseInt(st.nextToken());
		int passwordSite = Integer.parseInt(st.nextToken());
		Map<String, String> passwordMap = new java.util.HashMap<>();

		for (int i = 0; i < passwordNum; i++) {
			st = new StringTokenizer(br.readLine());
			passwordMap.put(st.nextToken(), st.nextToken());
		}

		for (int i = 0; i < passwordSite; i++) {
			sb.append(passwordMap.get(br.readLine())).append("\n");
		}

		System.out.println(sb);
	}
}
