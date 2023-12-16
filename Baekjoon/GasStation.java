package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GasStation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		long[] distance = new long[N - 1];
		long[] price = new long[N - 1];

		StringTokenizer stDistance = new StringTokenizer(br.readLine());
		StringTokenizer stPrice = new StringTokenizer(br.readLine());
		long minPrice = Integer.MAX_VALUE;
		long resultSum = 0;
		for (int i = 0; i < N - 1; i++) {

			long distanceTemp = distance[i] = Integer.parseInt(stDistance.nextToken());

			// price는 이전과 비교해서 가장 작은 수로 구매해야 하기 때문에 min으로 저장.
			minPrice = price[i] = Math.min(minPrice, Integer.parseInt(stPrice.nextToken()));

			// resultSum + = 거리 * 최소 비용
			resultSum += distanceTemp * minPrice;

		}

		System.out.println(resultSum);

	}
}
