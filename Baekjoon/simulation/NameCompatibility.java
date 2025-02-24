package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 25-02-24 15min
// https://www.acmicpc.net/problem/15312
public class NameCompatibility {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String jongmin = br.readLine();
		String lover = br.readLine();
		int length = jongmin.length();

		int[] alphabet = new int[] {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		Queue<Integer> que = new LinkedList<>();
		for (int i = 0; i < length; i++) {
			// 처음은 종민부터
			que.add(alphabet[jongmin.charAt(i) - 'A']);
			que.add(alphabet[lover.charAt(i) - 'A']);
		}

		for (int i = 0; i < length * 2 - 2; i++) {
			int prev = que.poll();
			int size = que.size();
			for (int j = 0; j < size; j++) {
				int current = que.poll();
				que.add((prev + current) % 10);
				prev = current;
			}
		}

		System.out.println(que.poll() + "" + que.poll());
	}
}
