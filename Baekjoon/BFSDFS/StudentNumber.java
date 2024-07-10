package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// 3
// 123
// 213
// 323 -> 문제 이해에서 계속 실수. 같/다
// 24-07-10 35min
// https://www.acmicpc.net/problem/1235
public class StudentNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 학생 수
		int studentNum = Integer.parseInt(br.readLine());

		String[] students = new String[studentNum]; // 00 때문에 int X
		for (int i = 0; i < studentNum; i++) {
			students[i] = br.readLine();
		}
		// set 자료 구조 이용
		// Set<String> set = new HashSet<>();
		int len = students[0].length();
		for (int i = len - 1; i >= 0; i--) {
			Set<String> set = new HashSet<>();
			for (int j = 0; j < studentNum; j++) {
				set.add(students[j].substring(i));
			}
			if (set.size() == studentNum) {
				System.out.println(len - i);
				return;
			}
			// set.clear();
		}

		// 3중 for 문 사용해 전체 비교하는 방식
		// String student = br.readLine();
		// int length = student.length();
		// String[][] students = new String[studentNum][length];
		// students[0][0] = student.charAt(length - 1) + "";
		// for (int j = 1; j < length; j++) {
		// 	students[0][j] = student.charAt(length - 1 - j) + students[0][j - 1];
		// }
		//
		// for (int i = 1; i < studentNum; i++) {
		// 	student = br.readLine();
		// 	students[i][0] = student.charAt(length - 1) + "";
		// 	for (int j = 1; j < length; j++) {
		// 		students[i][j] = student.charAt(length - 1 - j) + students[i][j - 1];
		// 	}
		// }
		//
		// for (int numIdx = 0; numIdx < length; numIdx++) {
		// 	boolean isSame = false;
		// 	for (int stdStd = 0; stdStd < studentNum; stdStd++) {
		// 		String cur = students[stdStd][numIdx];
		// 		for (int tempStd = stdStd + 1; tempStd < studentNum; tempStd++) {
		// 			String temp = students[tempStd][numIdx];
		// 			if (cur.equals(temp)) {
		// 				isSame = true;
		// 				break;
		// 			}
		// 		}
		// 	}
		// 	if (!isSame) {
		// 		System.out.println(numIdx + 1);
		// 		break;
		// 	}
		// }

	}
}
