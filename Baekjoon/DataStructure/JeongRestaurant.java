package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

// 24-09-21 15min
// https://www.acmicpc.net/problem/17479
public class JeongRestaurant {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int generalMenuNum = Integer.parseInt(st.nextToken());
		int specialMenuNum = Integer.parseInt(st.nextToken());
		int serviceMenuNum = Integer.parseInt(st.nextToken());
		Map<String, Integer> generalMenu = new java.util.HashMap<>();
		Map<String, Integer> specialMenu = new java.util.HashMap<>();
		Map<String, Integer> serviceMenu = new java.util.HashMap<>();

		for (int i = 0; i < generalMenuNum; i++) {
			st = new StringTokenizer(br.readLine());
			generalMenu.put(st.nextToken(), Integer.parseInt(st.nextToken()));
		}
		for (int i = 0; i < specialMenuNum; i++) {
			st = new StringTokenizer(br.readLine());
			specialMenu.put(st.nextToken(), Integer.parseInt(st.nextToken()));
		}
		for (int i = 0; i < serviceMenuNum; i++) {
			st = new StringTokenizer(br.readLine());
			serviceMenu.put(st.nextToken(), 0); // service는 가격이 없음.
		}

		int order = Integer.parseInt(br.readLine());
		long generalPrice = 0;
		long specialPrice = 0;
		boolean existService = false;
		for (int i = 0; i < order; i++) {
			String menu = br.readLine();
			if (generalMenu.containsKey(menu)) {
				generalPrice += generalMenu.get(menu);
			} else if (specialMenu.containsKey(menu)) {
				specialPrice += specialMenu.get(menu);
			} else {
				// serviceMenu는 하나만 주문 가능.
				if (existService) {
					System.out.println("No");
					return;
				}
				existService = true;
			}
		}

		// 특별메뉴는 일반메뉴에서 총 20,000원 이상을 주문해야 주문할 수 있다.
		// generalPrice와 specialPrice의 합이 50000원 이상이어야 함.
		if ((generalPrice < 20000 && specialPrice > 0)
			|| (generalPrice + specialPrice < 50000 && existService)) {
			System.out.println("No");
			return;
		}

		System.out.println("Okay");
	}
}
