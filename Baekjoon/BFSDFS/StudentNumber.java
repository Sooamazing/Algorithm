package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-07-10 23:40
// https://www.acmicpc.net/problem/1235
public class StudentNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 학생 수
		int studentNum = Integer.parseInt(br.readLine());

		String student = br.readLine();
		int length = student.length();
		// int[][] students = new int[studentNum][length];
		String[][] students = new String[studentNum][length];
		students[0][0] = student.charAt(0) + "";
		for (int j = 1; j < length; j++) {
			students[0][j] = students[0][j - 1] + (student.charAt(j));
		}

		for (int i = 1; i < studentNum; i++) {
			student = br.readLine();
			students[i][0] = (student.charAt(0) + "");
			for (int j = 1; j < length; j++) {
				students[i][j] = students[i][j - 1] + (student.charAt(j));
			}
		}

		for (int i = 0; i < length; i++) {
			boolean isSame = true;
			for (int j = 1; j < studentNum; j++) {
				if (!students[j][length - 1 - i].equals(students[j - 1][length - 1 - i])) {
					isSame = false;
					break;
				}
			}
			if (isSame) {
				System.out.println(i + 1);
				break;
			}
		}

	}
}
