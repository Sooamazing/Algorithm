package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Rainwater {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int height = Integer.parseInt(st.nextToken());
		int width = Integer.parseInt(st.nextToken());
		int[] arr = new int[width];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < width; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

	}
}
