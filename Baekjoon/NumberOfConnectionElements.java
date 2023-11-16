// https://www.acmicpc.net/problem/11724
package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class NumberOfConnectionElements {

	static boolean[][] arr;
	static boolean[] visited;
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		arr = new boolean[N][N];
		visited = new boolean[N];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			arr[a - 1][b - 1] = true;
			arr[b - 1][a - 1] = true;

		}

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			if (visited[i]) {
				continue;
			}
			cnt += bfs(i);
		}

		System.out.println(cnt);

	}

	static int bfs(int cur) {

		Queue<Integer> que = new LinkedList<>();
		que.add(cur);

		while(!que.isEmpty()){
			int temp = que.poll();
			for (int i = 0; i < N; i++) {
				if(!visited[i] && arr[temp][i]){
					visited[i]=true;
					que.add(i);
				}
			}
		}

		return 1;
	}
}
