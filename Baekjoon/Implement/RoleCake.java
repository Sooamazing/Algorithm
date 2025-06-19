package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-06-19 10min
// https://www.acmicpc.net/problem/3985
public class RoleCake {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int roleCakeLength = Integer.parseInt(br.readLine());
		int people = Integer.parseInt(br.readLine());
		int expectedPeopleResult = 0;
		int expectedMaxResult = 0;
		int realMaxResult = 0;

		int[] roleCakes = new int[roleCakeLength + 1];
		int[] peoples = new int[people + 1];
		for (int i = 1; i <= people; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int min = Integer.parseInt(st.nextToken());
			int max = Integer.parseInt(st.nextToken());
			if ((max - min) > expectedMaxResult) {
				expectedMaxResult = max - min;
				expectedPeopleResult = i;
			}

			for (int j = min; j <= max; j++) {
				if (roleCakes[j] != 0) {
					continue;
				}
				roleCakes[j] = i;
				peoples[i]++;
			}
		}

		int realPeopleResult = 0;
		for (int i = 1; i <= people; i++) {
			if (realMaxResult < peoples[i]) {
				realPeopleResult = i;
				realMaxResult = peoples[i];
			}
		}

		System.out.println(expectedPeopleResult);
		System.out.println(realPeopleResult);
	}
}
