package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

// https://www.acmicpc.net/problem/2548
public class RepresentativeNaturalNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] count = new int[N];
		Set<Integer> set = new TreeSet<>();

		String[] split = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			count[i] = Integer.parseInt(split[i]);
			set.add(count[i]);
		}

		int min = Integer.MAX_VALUE;
		int result = 0;
		for (Integer std : set) {
			int resultDiff = 0;
			for (int naturalNum : count) {
				resultDiff += Math.abs(std - naturalNum);
			}
			if (resultDiff < min) {
				min = resultDiff;
				result = std;
			}
		}
		System.out.println(result);
	}
}
