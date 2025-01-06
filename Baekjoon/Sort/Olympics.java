package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 25-01-06 15min
// https://www.acmicpc.net/problem/8979
public class Olympics {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int total = Integer.parseInt(st.nextToken());
		int goal = Integer.parseInt(st.nextToken());

		Country[] countries = new Country[total];
		for (int i = 0; i < total; i++) {
			st = new StringTokenizer(br.readLine());
			int number = Integer.parseInt(st.nextToken());
			int gold = Integer.parseInt(st.nextToken());
			int silver = Integer.parseInt(st.nextToken());
			int bronze = Integer.parseInt(st.nextToken());
			countries[i] = new Country(number, gold, silver, bronze);
		}

		Arrays.sort(countries, (c1, c2) -> {
			if (c1.gold == c2.gold) {
				if (c1.silver == c2.silver) {
					return c2.bronze - c1.bronze;
				}
				return c2.silver - c1.silver;
			}
			return c2.gold - c1.gold;
		});

		for (int i = 0; i < total; i++) {
			// 이전 등수와 금, 은, 동 메달이 같은 경우 동일한 Rank 할당
			if (i > 0 && countries[i].gold == countries[i - 1].gold && countries[i].silver == countries[i - 1].silver
				&& countries[i].bronze == countries[i - 1].bronze) {
				countries[i].rank = countries[i - 1].rank;
			} else {
				countries[i].rank = i + 1;
			}

			if (countries[i].number == goal) {
				System.out.println(countries[i].rank);
				break;
			}
		}
	}

	private static class Country {
		int number;
		int gold;
		int silver;
		int bronze;
		int rank;

		public Country(int number, int gold, int silver, int bronze) {
			this.number = number;
			this.gold = gold;
			this.silver = silver;
			this.bronze = bronze;
		}
	}
}
