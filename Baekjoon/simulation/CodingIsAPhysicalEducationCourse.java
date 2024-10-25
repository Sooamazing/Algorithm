package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-10-25 5min
// https://www.acmicpc.net/problem/25314
public class CodingIsAPhysicalEducationCourse {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		int time = Integer.parseInt(br.readLine()) / 4;

		for (int i = 0; i < time; i++) {

			sb.append("long ");

		}

		sb.append("int");

		System.out.println(sb);
	}
}
