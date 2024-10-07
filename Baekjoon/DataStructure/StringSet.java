package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-10-07 10min
// https://www.acmicpc.net/problem/14425
public class StringSet {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int setNum = Integer.parseInt(st.nextToken());
		int stringNum = Integer.parseInt(st.nextToken());
		PriorityQueue<String> set = new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<String> string = new PriorityQueue<>(Comparator.reverseOrder());
		for (int i = 0; i < setNum; i++) {
			String str = br.readLine();
			set.add(str);
		}
		for (int i = 0; i < stringNum; i++) {
			string.add(br.readLine());
		}

		int count = 0;
		while (!string.isEmpty()) {
			if (set.contains(string.poll())) {
				count++;
			}
		}
		System.out.println(count);

	}
}
