package Baekjoon.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-05-07 25min
// https://www.acmicpc.net/problem/3107
public class IPv6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String iPv6Addr = br.readLine();

		// regex
		// Pattern pattern = Pattern.compile("");

		// split
		String[] split = iPv6Addr.split(":");
		int splitSize = split.length; // 최대 8개

		for (int i = 0; i < splitSize; i++) {

			String curStr = split[i];
			int curLen = curStr.length();

			// :: 때문에 blank인 경우 처리
			if (curStr.isBlank()) {
				// "::9999" 처음에 :: 나오는 경우 예외 처리 / ::1
				if (i == 0) {
					sb.append("0000:");
					continue;
				}

				// 중간에 :: 나올 때는 현재 split 배열 크기를 고려해 총 8개가 되도록 0000: 추가 후 continue
				for (int j = 0; j < 8 - splitSize + 1; j++) {
					sb.append("0000:");
				}
				continue;
			} else if (curLen < 4) {
				// 현재 배열의 Str 길이가 4개를 채우지 못하면 채우지 못한 만큼 앞에 0 추가.
				for (int j = curLen; j < 4; j++) {
					sb.append("0");
				}
			}
			// 현재 Str과 : 추가
			sb.append(curStr);
			sb.append(":");
		}

		// 마지막에 ::이 있는 경우, split에서는 마지막 blank를 배열에 포함시키지 않음.
		// aa:091:4846:374::
		if (iPv6Addr.endsWith("::")) {
			for (int j = 0; j < 8 - splitSize; j++) {
				sb.append("0000:");
			}
		}

		// 가장 마지막 : 제거
		int lastIndex = sb.lastIndexOf(":");
		sb.deleteCharAt(lastIndex);

		System.out.println(sb);
	}
}
