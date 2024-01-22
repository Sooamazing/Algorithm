package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class APlusBBig {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split(" ");
		BigInteger a = new BigInteger(s[0]);
		BigInteger b = new BigInteger(s[1]);
		System.out.println(a.add(b));
	}
}
