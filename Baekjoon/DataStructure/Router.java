package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 25-02-02 10min
// https://www.acmicpc.net/problem/15828
public class Router {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int size = Integer.parseInt(br.readLine());
		Queue<Integer> que = new LinkedList<>();

		while (true) {
			int packet = Integer.parseInt(br.readLine());

			if (packet == -1) {
				break;
			}

			// 0일 때 처리
			if (packet == 0 && !que.isEmpty()) {
				que.poll();
				continue;
			}

			// 1 이상: 패킷 번호, size 내인 경우 넣고, 아니면 버림
			if (que.size() < size) {
				que.add(packet);
			}

		}

		if (que.isEmpty()) {
			sb.append("empty");
		} else {
			while (!que.isEmpty()) {
				sb.append(que.poll()).append("\n");
			}
		}

		System.out.println(sb);

	}
}
