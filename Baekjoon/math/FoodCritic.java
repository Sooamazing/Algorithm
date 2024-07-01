package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 5 8
// 24-07-01 50min
// https://www.acmicpc.net/problem/1188
public class FoodCritic {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sausageNum = Integer.parseInt(st.nextToken());
		int criticNum = Integer.parseInt(st.nextToken());

		int ans = 0;
		// 나머지를 구하고, 1개의 소시지에서 (나머지 소시지) / (평론가 수)를 자를 수 있는 만큼 자름(총 자른 길이가 1 미만이어야 함.). 그리고, 나머지 소시지의 개수를 해당 자르기 수에 곱함.
		// 소수 7로 계산해 볼 때는 가능하나, 5 8인 경우 불가능.
		// for (int i = 1; i <= criticNum; i++) {
		// 	if (sausageNum * i / criticNum >= 1) {
		// 		ans = (i - 1) * sausageNum;
		// 		break;
		// 	}
		// }

		// 한 소시지를 평론가의 수만큼 미리 잘라서 총 소시지의 개수는 criticNum * sausageNum이고, 실제 자르는 경우(답)는 그 중 원래 소시지를 자른 경우라고 가정함.
		// 소시지의 배수 중 평론가의 배수가 아닌 경우 실제로 자름.
		for (int i = sausageNum; i < criticNum * sausageNum; i += sausageNum) {
			if (i % criticNum != 0) {
				ans++;
			}
		}

		System.out.println(ans);

	}
}
