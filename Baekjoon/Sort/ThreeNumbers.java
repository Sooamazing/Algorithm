package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-12-12 5min
// https://www.acmicpc.net/problem/10817
public class ThreeNumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < 3; i++) {
			pq.add(Integer.parseInt(st.nextToken()));
		}

		pq.poll();

		System.out.println(pq.poll());
	}
}
