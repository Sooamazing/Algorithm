package Baekjoon.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 25-01-16 15min
// https://www.acmicpc.net/problem/1940
public class Jumong {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 재료
		int material = Integer.parseInt(br.readLine());
		// 갑옷
		int armor = Integer.parseInt(br.readLine());
		int[] materials = new int[material];
		boolean[] check = new boolean[material];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < material; i++) {
			materials[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(materials);

		int count = 0;
		for (int i = 0; i < material; i++) {
			if (check[i]) {
				continue;
			}
			check[i] = true;
			int pairIndex = Arrays.binarySearch(materials, armor - materials[i]);
			// 같은 값이 있을 경우 대비해 !check[pairIndex] 조건 추가
			if (pairIndex >= 0 && !check[pairIndex]) {
				count++;
				check[pairIndex] = true;
			}
		}

		System.out.println(count);

	}
}
