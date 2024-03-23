package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-03-23
// https://www.acmicpc.net/problem/11536
public class LineUp {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		String[] arr = new String[size];
		arr[0] = br.readLine();
		arr[1] = br.readLine();
		int prev = arr[0].compareTo(arr[1]);
		for (int i = 2; i < size; i++) {
			arr[i] = br.readLine();
			int cur = arr[i - 1].compareTo(arr[i]);
			if (prev * cur < 0) {
				System.out.println("NEITHER");
				return;
			}
			prev = cur;
		}
		System.out.println(prev > 0 ? "DECREASING" : "INCREASING");

	}

}
