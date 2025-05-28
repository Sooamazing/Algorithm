package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-05-28 10min
// https://www.acmicpc.net/problem/17388
public class RaspyAndSublime {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int soongsil = Integer.parseInt(st.nextToken());
		int korea = Integer.parseInt(st.nextToken());
		int hanyang = Integer.parseInt(st.nextToken());

		if (soongsil + korea + hanyang >= 100) {
			System.out.println("OK");
		} else if (soongsil < korea && soongsil < hanyang) {
			System.out.println("Soongsil");
		} else if (korea < soongsil && korea < hanyang) {
			System.out.println("Korea");
		} else {
			System.out.println("Hanyang");
		}
	}
}
