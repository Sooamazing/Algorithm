package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

// https://www.acmicpc.net/problem/2548
public class RepresentativeNaturalNumber {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] count = new int[N];
		String[] split = br.readLine().split(" ");

		for (int i = 0; i < N; i++) {
			count[i] = Integer.parseInt(split[i]);
		}

		Set<Integer> set = Arrays.stream(count).boxed().collect(Collectors.toCollection(TreeSet::new));
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
