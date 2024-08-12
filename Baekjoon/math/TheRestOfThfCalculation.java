package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-08-12 20min
// https://www.acmicpc.net/problem/3944
public class TheRestOfThfCalculation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCaseNum = Integer.parseInt(br.readLine());
		while (testCaseNum-- > 0) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int radix = Integer.parseInt(st.nextToken()); // 진수
			String num = st.nextToken();

			int length = num.length();
			int modCal = 0;
			int mod = radix - 1;
			for (int i = 0; i < length; i++) {
				int curNum = num.charAt(i) - '0';
				modCal = (modCal + curNum) % mod;
			}

			// method 추출
			// int modCal = getModCal(num, radix);

			// 틀림 - int 범위 초과 8 37777777777777773
			// for (int i = 0; i < length; i++) {
			// 	int curNum = num.charAt(i) - '0';
			// 	int pow = (int)Math.pow(radix, length - i - 1);
			// 	modCal = (modCal + (curNum * pow) % (radix - 1));
			// }
			sb.append(modCal).append("\n");
		}
		System.out.println(sb);
	}

	private static int getModCal(String num, int radix) {
		int length = num.length();
		int modCal = 0;
		int mod = radix - 1;
		for (int i = 0; i < length; i++) {
			int curNum = num.charAt(i) - '0';
			modCal = (modCal + curNum) % mod;
		}
		return modCal;
	}

}
