// https://www.acmicpc.net/problem/18870

package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class CoordinateCompression {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		Set<Integer> set = new HashSet<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			arr[i] = tmp;
			set.add(tmp);
		}

		// st 다 뱉으면 st에 뭐 남아 있는지 보기 -> 아 그대로 남아 있네.

		int[] array = set.stream()
			.sorted().mapToInt(i -> i).toArray();

		for (int i = 0; i < N; i++) {

			int i1 = Arrays.binarySearch(array, arr[i]);
			sb.append(i1).append(" ");
		}

		System.out.println(sb);

	}
}
