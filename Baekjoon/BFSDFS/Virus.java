package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

import jdk.dynalink.beans.StaticClass;

public class Virus {

	static boolean[] nodeArr;
	static boolean[][] canGo;
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());

		nodeArr = new boolean[N]; //노드 방문했는지 확인
		canGo = new boolean[N][N];

		StringTokenizer st = new StringTokenizer("");
		for (int i = 0; i < M; i++) {

			st = new StringTokenizer(br.readLine());
			int tmepX = Integer.parseInt(st.nextToken()) - 1;
			int tmepY = Integer.parseInt(st.nextToken()) - 1;

			canGo[tmepX][tmepY] = true;
			canGo[tmepY][tmepX] = true;

		}//입력 및 초기화


		Stack<Integer> stack = new Stack<>();
		nodeArr[0] = true;
		stack.push(0);

		while (!stack.isEmpty()) {
			int tmepX = stack.pop();

			for (int i = 0; i < N; i++) {
				if (canGo[tmepX][i]) {
					canGo[i][tmepX] = false;
					canGo[tmepX][i] = false;
					nodeArr[tmepX] = true;
					nodeArr[i] = true;
					stack.push(i);
				}
			}
		}

		for (int i = 0; i < N; i++) {
			if (nodeArr[i]) {
				cnt++;
			}
		}

		System.out.println(cnt-1);

	}

}
