package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1
// 0 0 10 1 0 1
// 24-07-12 20min
// https://www.acmicpc.net/problem/1002
// 두 원이 만날 때 참고: https://blog.naver.com/honeyeah/110140815554
public class Turret {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());

		while (testCase-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());

			// 제곱근은 소수점 처리 확인 어려워 제곱 처리
			int distanceSquare = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
			int rPlusSquare = (r1 + r2) * (r1 + r2);
			int rMinusSquare = (r1 - r2) * (r1 - r2);

			if (r1 == r2
				&& x1 == x2
				&& y1 == y2) {
				// 두 원이 같은 경우, 무한대
				sb.append(-1).append("\n");
			} else if (rPlusSquare < distanceSquare
				|| rMinusSquare > distanceSquare) {
				// 서로 바깥에 있거나 한 원이 다른 원 내에 있는 경우, 만나지 않음.
				sb.append(0).append("\n");
			} else if (rPlusSquare == distanceSquare
				|| rMinusSquare == distanceSquare) {
				// 외접하거나 내접하는 경우, 한 점에서 만남
				sb.append(1).append("\n");
			} else if (rMinusSquare < distanceSquare
				&& distanceSquare < rPlusSquare) {
				// rMinusSquare < distanceSquare
				// 				&& distanceSquare < rPlusSquare
				// 두 점에서 만나는 경우
				sb.append(2).append("\n");
			}

			// 틀림.
			// if (x1 == x2 && y1 == y2) {
			// 	// 규현과 승환이 같은 위치에 있는 경우
			// 	if (r1 == r2) {
			// 		// 반지름까지 같으면 무한대
			// 		sb.append(-1).append("\n");
			// 	} else {
			// 		// 반지름이 다르면 만나지 않음
			// 		sb.append(0).append("\n");
			// 	}
			// } else if (distanceSquare < rSquare) {
			// 	// 규현이와 승환의 원이 두 점에서 만나는 경우
			// 	sb.append(2).append("\n");
			// } else if (distanceSquare == rSquare) {
			// 	// 한 점 에서 접한 경우
			// 	sb.append(1).append("\n");
			// } else if (distanceSquare > rSquare) {
			// 	// 접점이 없는 경우
			// 	sb.append(0).append("\n");
			// }

			// copilot
			// double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
			//
			// if (x1 == x2 && y1 == y2 && r1 == r2) {
			// 	System.out.println(-1);
			// } else if (distance > r1 + r2 || distance < Math.abs(r1 - r2)) {
			// 	System.out.println(0);
			// } else if (distance == r1 + r2 || distance == Math.abs(r1 - r2)) {
			// 	System.out.println(1);
			// } else {
			// 	System.out.println(2);
			// }
		}

		System.out.println(sb);
	}
}
