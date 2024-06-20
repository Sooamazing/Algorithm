package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// aababcefcefd
// aabcefd
// 24-06-20 45min
// https://www.acmicpc.net/problem/2195
public class StringCopy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String originStr = br.readLine();
		String goalStr = br.readLine();

		int ans = 0;
		for (int i = 0; i < goalStr.length(); i++) {
			int curIdx = i;

			int maxSize = 0;
			int tempSize = 0;
			for (int j = 0; j < originStr.length(); j++) {
				if (originStr.charAt(j) != goalStr.charAt(curIdx)) {
					maxSize = Math.max(maxSize, tempSize);
					tempSize = 0;
					curIdx = i;
					if (originStr.charAt(j) == goalStr.charAt(curIdx)) {
						tempSize++;
						curIdx++;
					}
				} else {
					tempSize++;
					curIdx++;
					if (curIdx == goalStr.length())
						curIdx = i;
					// break;
				}
			}
			maxSize = Math.max(maxSize, tempSize);
			i = i + maxSize - 1;
			ans++;
		}
		System.out.println(ans);
	}
}
