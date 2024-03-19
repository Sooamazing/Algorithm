package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/3568
public class iSharp {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line = br.readLine();
		line = line.substring(0, line.length() - 1);
		line = line.replace(",", "");

		String[] vars = line.split(" ");

		String common = vars[0];
		for (int i = 1; i < vars.length; i++) {

			sb.append(common);
			String[] cur = vars[i].split("");
			for (int j = cur.length - 1; j > 0; j--) {
				if (cur[j].equals("*") || cur[j].equals("&")) {
					sb.append(cur[j]);
				} else if (cur[j].equals("]")) {
					sb.append("[]");
					j--;
				} else {
					break;
				}
			}

			sb.append(" ").append(cur[0]).append(";\n");
		}
		System.out.println(sb);
	}
}
