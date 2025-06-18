package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-06-18 5min
// https://www.acmicpc.net/problem/16486
public class RoundaboutPlayground {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int width = Integer.parseInt(br.readLine());
		int radius = Integer.parseInt(br.readLine());

		double circumference = width * 2 + (3.141592) * 2 * radius;

		System.out.println(circumference);
	}
}
