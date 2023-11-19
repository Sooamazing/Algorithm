package CodingTest.Goorm;

import java.io.*;
import java.util.*;

class RollABall {

	static int N, S, K;
	static int[] arr, sArr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		arr = new int[N + 1];
		sArr = new int[N + 1];

		int s = S;
		sArr[s] = 1;
		int k = K;

		while (k-- > 0) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < N + 1; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			// System.out.println(Arrays.toString(arr));
			dfs(arr);

			// for(int i = 1 ; i < N+1; i++){
			// 	sb.append(sArr[i]).append(' ');
			// }
			// sb.append('\n');

		}

		for (int i = 1; i < N + 1; i++) {
			sb.append(sArr[i]).append(' ');
		}

		System.out.println(sb);

	}

	static void dfs(int[] arr) {

		Queue<Integer> que = new LinkedList<>();

		// 시작점 que에 담기 및 초기화
		for (int i = 1; i < N + 1; i++) {
			if (sArr[i] == 1) {
				que.add(i);
			}
		}
		sArr = new int[N + 1];

		// 시작점에서 <- , -> 구현! 멈추는 곳을 sArr에 저장.
		while (!que.isEmpty()) {
			int temp = que.poll();

			// 1, N 번째는 out 멈춤 처리
			// 왼쪽
			int cur = temp;
			while (true) {

				if (arr[cur - 1] <= arr[cur]) {
					if (cur == 1) {
						sArr[1] = 1;
						break;
					}
					cur--;
				} else {
					sArr[cur] = 1;
					break;
				}
			}

			cur = temp;
			// 오른쪽
			while (true) {

				if (arr[cur] >= arr[cur + 1]) {
					if (cur == N) {
						sArr[N] = 1;
						break;
					}
					cur++;
				} else {
					sArr[cur] = 1;
					break;
				}
			}

		}

	}
}


