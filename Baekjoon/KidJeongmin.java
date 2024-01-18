package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KidJeongmin {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		System.out.println(Long.parseLong(s[0]) + Long.parseLong(s[1]) + Long.parseLong(s[2]));
	}
}
