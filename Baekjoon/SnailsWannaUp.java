package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2869
public class SnailsWannaUp {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] split = br.readLine().split(" ");

		int a = Integer.parseInt(split[0]);
		int b = Integer.parseInt(split[1]);
		int v = Integer.parseInt(split[2]);

		int day = (v - b) / (a - b);

		if ((v - b) % (a - b) != 0) {
			day++;
		}

		System.out.println(day);

	}

}
