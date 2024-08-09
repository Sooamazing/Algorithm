package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// 24-08-09 25min
// https://www.acmicpc.net/problem/2872
public class IHavaALibraryInMyHouse {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int booksNum = Integer.parseInt(br.readLine());
		// int[] bookHeight = new int[booksNum];
		// for (int i = booksNum - 1; i >= 0; i--) {
		// 	bookHeight[i] = Integer.parseInt(br.readLine());
		// }
		Map<Integer, Integer> map = new HashMap<>(); // bookNum, height

		for (int i = booksNum; i > 0; i--) {
			map.put(Integer.parseInt(br.readLine()), i);
		}

		int ans = 0;
		int height = booksNum + 1; // 높이는 다음 높이 기준.
		for (int i = booksNum; i > 1; i--) {
			// 큰 숫자 책이 작은 숫자 책보다 높은 곳에 꽂혀 있으면, 작은 숫자 책을 빼 위로 꽂음.
			// 움직이기 때문에 ans++;
			if (map.get(i) > map.get(i - 1)) {
				ans++;
				map.put(i - 1, height++);
			}
		}

		System.out.println(ans);
	}
}
