package Baekjoon.TwoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// abxxbxa 1
// abcddadca 2
// 24-06-17 70min
// https://www.acmicpc.net/problem/17609
public class Palindromes {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCaseNum = Integer.parseInt(br.readLine());

		while (testCaseNum-- > 0) {
			String str = br.readLine();
			int length = str.length();

			isPalindromes = true;
			isDeleted = false;
			int left = 0;
			int right = length - 1;
			ans = 2;
			isPalindromes(str, left, right, true, false);
			sb.append(ans).append("\n");
			// while (left < right) {
			// 	// 중앙값 포함 미포함 확인
			// 	if (str.charAt(left) == str.charAt(right)) {
			// 		left++;
			// 		right--;
			// 	} else {
			// 		if (isDeleted) {
			// 			isPalindromes = false;
			// 			break;
			// 		}
			// 		if (str.charAt(left + 1) == str.charAt(right)) {
			// 			isDeleted = true;
			// 			left++;
			// 		} else if (str.charAt(left) == str.charAt(right - 1)) {
			// 			isDeleted = true;
			// 			right--;
			// 		} else {
			// 			// 아예 유사도 안 되는 것.
			// 			isPalindromes = false;
			// 			break;
			// 		}
			// 	}
			// }
			//
			// if (!isPalindromes) {
			// 	sb.append(2).append("\n");
			// } else if (isDeleted) {
			// 	sb.append(1).append("\n");
			// } else {
			// 	sb.append(0).append("\n");
			// }

			// copilot
			// int left = 0;
			// int right = length - 1;
			// boolean isPalindrome = true;
			// boolean isPseudoPalindrome = true;
			// while (left < right) {
			// 	if (str.charAt(left) != str.charAt(right)) {
			// 		isPalindrome = false;
			// 		break;
			// 	}
			// 	left++;
			// 	right--;
			// }
			//
			// if (isPalindrome) {
			// 	System.out.println(0);
			// 	continue;
			// }
			//
			// left = 0;
			// right = length - 1;
			// while (left < right) {
			// 	if (str.charAt(left) != str.charAt(right)) {
			// 		isPseudoPalindrome = false;
			// 		break;
			// 	}
			// 	left++;
			// 	right--;
			// }
			//
			// if (isPseudoPalindrome) {
			// 	System.out.println(1);
			// 	continue;
			// }
			//
			// left = 0;
			// right = length - 1;
			// boolean isPseudoPalindrome2 = true;
			// while (left < right) {
			// 	if (str.charAt(left) != str.charAt(right)) {
			// 		isPseudoPalindrome2 = false;
			// 		break;
			// 	}
			// 	left++;
			// 	right--;
			// }
			//
			// if (isPseudoPalindrome2) {
			// 	System.out.println(1);
			// 	continue;
			// }

			// System.out.println(2);
		}

		System.out.println(sb);

	}

	static boolean isPalindromes, isDeleted;
	static int ans;

	static void isPalindromes(String str, int left, int right, boolean isPalindromes, boolean isDeleted) {

		if (left >= right) {
			if (!isPalindromes) {
				ans = Math.min(2, ans);
			} else if (isDeleted) {
				ans = Math.min(1, ans);
			} else {
				ans = Math.min(0, ans);
			}
			return;
			// if (!isPalindromes) {
			// 	ans = 2;
			// } else if (isDeleted) {
			// 	ans = 1;
			// } else {
			// 	ans = 0;
			// }
		}

		if (str.charAt(left) == str.charAt(right)) {
			isPalindromes(str, left + 1, right - 1, isPalindromes, isDeleted);
		} else {
			if (isDeleted) {
				// isPalindromes = false;
				ans = Math.min(2, ans);
				return;
			}
			if (str.charAt(left + 1) == str.charAt(right)) {
				// isDeleted = true;
				isPalindromes(str, left + 1, right, isPalindromes, true);
			}
			if (str.charAt(left) == str.charAt(right - 1)) {
				// isDeleted = true;
				isPalindromes(str, left, right - 1, isPalindromes, true);
			}
			if (str.charAt(left + 1) != str.charAt(right) && str.charAt(left) != str.charAt(right - 1)) {
				// 아예 유사도 안 되는 것.
				// isPalindromes = false;
				ans = Math.min(2, ans);
				return;
			}
		}
	}
}
