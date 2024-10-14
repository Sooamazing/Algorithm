package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//24-10-14 20min
// https://www.acmicpc.net/problem/18258
public class Queue2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st;
		int cmdNum = Integer.parseInt(br.readLine());
		int[] queue = new int[cmdNum];
		int lastIdx = -1; // 마지막으로 들어 있는 idx
		int firstIdx = 0; // 빠져나갈 idx
		while (cmdNum-- > 0) {
			st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();
			switch (cmd) {
				case "push":
					int num = Integer.parseInt(st.nextToken());
					queue[++lastIdx] = num;
					break;
				case "pop":
					if (lastIdx < firstIdx) {
						sb.append(-1).append("\n");
					} else {
						sb.append(queue[firstIdx++]).append("\n");
					}
					break;
				case "size":
					sb.append(lastIdx - firstIdx + 1).append("\n");
					break;
				case "empty":
					if (lastIdx < firstIdx) {
						sb.append(1).append("\n");
					} else {
						sb.append(0).append("\n");
					}
					break;
				case "front":
					if (lastIdx < firstIdx) {
						sb.append(-1).append("\n");
					} else {
						sb.append(queue[firstIdx]).append("\n");
					}
					break;
				case "back":
					if (lastIdx < firstIdx) {
						sb.append(-1).append("\n");
					} else {
						sb.append(queue[lastIdx]).append("\n");
					}
					break;
				default:
			}

		}

		System.out.println(sb);
	}
}
