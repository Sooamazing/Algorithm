package Baekjoon.slidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 24-06-15 80min
// https://www.acmicpc.net/problem/2531
public class ConveyorBeltSushi {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int sushiOnConveyorNum = Integer.parseInt(st.nextToken());
		int sushiCategoryNum = Integer.parseInt(st.nextToken());
		int continuousNum = Integer.parseInt(st.nextToken());
		int couponNum = Integer.parseInt(st.nextToken());

		int[] sushis = new int[sushiOnConveyorNum];
		int[] categories = new int[sushiCategoryNum + 1];
		// Queue<Integer> coupons = new LinkedList<>();
		Set<Integer> coupons = new HashSet<>();
		for (int i = 0; i < sushiOnConveyorNum; i++) {
			sushis[i] = Integer.parseInt(br.readLine());
			if (sushis[i] == couponNum) {
				coupons.add(i);
			}
		}

		// sushis[couponNum] = sushiOnConveyorNum;
		// 시도...
		int left = 0;
		Set<Integer> curSelects = new HashSet<>();
		int curCategorySum = 0; // 카테고리
		int ans = 0;
		for (int i = 0; i < sushiOnConveyorNum + continuousNum - 1; i++) {
			int right = i % sushiOnConveyorNum;
			if (i - left < continuousNum) {
				// 현재 스시 총 4개 이하이면
				if (categories[sushis[right]] == 0 && sushis[right] != couponNum) {
					curCategorySum++;
				}
				categories[sushis[right]]++;
			} else {
				// 현재 4개 초과면
				if (categories[sushis[right]] == 0 && sushis[right] != couponNum) {
					curCategorySum++;
				}
				categories[sushis[right]]++;

				categories[sushis[left]]--;
				if (categories[sushis[left]] == 0 && sushis[left] != couponNum) {
					curCategorySum--;
				}
				left++;
			}

			ans = Math.max(ans, curCategorySum);

		}

		System.out.println(ans + 1);

		// 시간 초과.
		// int ans = 0;
		// Set<Integer> resultSet = new HashSet<>();
		// for (int i = 0; i < sushiOnConveyorNum + continuousNum - 1; i++) {
		// 	resultSet = new HashSet<>();
		// 	int curIdx = i;
		// 	for (int j = 0; j < continuousNum; j++) {
		// 		resultSet.add(sushis[++curIdx % sushiOnConveyorNum]);
		// 	}
		// 	ans = Math.max(ans, resultSet.size());
		// }
		// if (!resultSet.contains(couponNum)) {
		// 	ans++;
		// }

		// 조건 틀림. 중복 X.
		// if (coupons.isEmpty()) {
		// 	System.out.println(continuousNum + 1);
		// 	return;
		// }
		// while (!coupons.isEmpty()) {
		// 	int cnt = 1;
		// 	int curIdx = coupons.poll();
		//
		// Queue<Integer> set = new LinkedList<>();
		// int curTotal = 0;
		// int couponT
		// for (int i = 0; i < sushiOnConveyorNum; i++) {
		// 	for (int j = i; j < i + 4; j++) {
		// 		int idx = j % sushiOnConveyorNum;
		// 		if (sushis[idx] != couponNum) {
		// 			cnt++;
		// 			set.add(idx);
		// 			categories[idx] = true;
		// 		}
		//
		// 	}
		// }
		// 	ans = Math.max(ans, set.size());
		// }

		// System.out.println(ans);

	}
}
