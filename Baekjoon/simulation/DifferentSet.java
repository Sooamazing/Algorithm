package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;

// 24-09-10 15min
// https://www.acmicpc.net/problem/1822
public class DifferentSet {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[] aArr = new int[a];
		Set<Integer> bArr = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < a; i++) {
			aArr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < b; i++) {
			bArr.add(Integer.parseInt(st.nextToken()));
		}

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < a; i++) {
			if (!bArr.contains(aArr[i])) {
				pq.add(aArr[i]);
			}
		}

		if (pq.isEmpty()) {
			System.out.println(0);
			return;
		}

		while (!pq.isEmpty()) {
			sb.append(pq.poll()).append(" ");
		}

		System.out.println(sb);
	}
}
