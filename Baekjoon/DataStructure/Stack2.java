package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-10-13 15min
// https://www.acmicpc.net/problem/28278
public class Stack2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st;
		int cmdNum = Integer.parseInt(br.readLine());
		int[] stack = new int[cmdNum];
		int idx = 0; // 가장 마지막 저장된 수의 idx, 실제 저장은 1부터 시작
		for (int i = 0; i < cmdNum; i++) {
			st = new StringTokenizer(br.readLine());
			int cmd = Integer.parseInt(st.nextToken());
			if (cmd == 1) {
				// 저장
				int num = Integer.parseInt(st.nextToken());
				stack[++idx] = num;
				continue; // 있어야 \n 공통 처리를 건너 뜀.
			} else if (cmd == 2) {
				// pop and print, 없다면 -1 출력
				if (idx == 0) {
					sb.append(-1);
				} else {
					sb.append(stack[idx--]);
				}
			} else if (cmd == 3) {
				// size 출력
				sb.append(idx);
			} else if (cmd == 4) {
				// 비어있는지 판별 (1/0 출력)
				if (idx == 0) {
					sb.append(1);
				} else {
					sb.append(0);
				}
			} else {
				// peek and print, 없다면 -1 출력
				if (idx == 0) {
					sb.append(-1);
				} else {
					sb.append(stack[idx]);
				}
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}
