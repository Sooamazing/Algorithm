package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-12-31 1min
// https://www.acmicpc.net/problem/14581
public class HongjunSurroundedByFans {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String id = br.readLine();
		sb.append(":fan::fan::fan:\n");
		sb.append(":fan::").append(id).append("::fan:\n");
		sb.append(":fan::fan::fan:\n");

		System.out.println(sb);
	}
}
