package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// 24-10-11 5min
// https://www.acmicpc.net/problem/10919
public class MinMax {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		List<Integer> nums = new ArrayList<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num; i++) {
			nums.add(Integer.parseInt(st.nextToken()));
		}

		Collections.sort(nums);

		System.out.println(nums.get(0) + " " + nums.get(num - 1));
	}
}
