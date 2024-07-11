package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

// 24-07-11 45min
// https://www.acmicpc.net/problem/11578
public class RecruitmentOfTeamMembers {
	static List<Integer>[] students;
	static List<Integer>[] problems;
	// static boolean[] solvedP;
	static boolean[] solvedS;
	static int ans = 11;
	static int problemNum;
	static int studentNum;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		problemNum = Integer.parseInt(st.nextToken());
		studentNum = Integer.parseInt(st.nextToken());

		students = new List[studentNum + 1];
		for (int i = 1; i <= studentNum; i++) {
			students[i] = new ArrayList<Integer>();
		}
		problems = new List[problemNum + 1];
		for (int i = 1; i <= problemNum; i++) {
			problems[i] = new ArrayList<Integer>();
		}

		for (int i = 1; i <= studentNum; i++) {
			st = new StringTokenizer(br.readLine());
			int problemNum = Integer.parseInt(st.nextToken());
			for (int j = 0; j < problemNum; j++) {
				int problem = Integer.parseInt(st.nextToken());
				students[i].add(problem);
				problems[problem].add(i);
			}

			// 문제를 잘 읽자.
			// while (st.hasMoreTokens()) {
			// 	int problem = Integer.parseInt(st.nextToken());
			// 	students[i].add(problem);
			// 	problems[problem].add(i);
			// }
		}

		// solvedP = new boolean[problemNum + 1];
		solvedS = new boolean[studentNum + 1];

		dfs(0, 0, 0, new boolean[problemNum + 1]);

		System.out.println(ans == 11 ? -1 : ans);

		// copilot
		// st = new StringTokenizer(br.readLine());
		// for (int i = 0; i < studentNum; i++) {
		// 	problems[Integer.parseInt(st.nextToken()) - 1]++;
		// }
		//
		// int[] problemsCopy = problems.clone();
		// int ans = 0;
		// int min = Integer.MAX_VALUE;
		// for (int i = 0; i < (1 << studentNum); i++) {
		// 	int cnt = 0;
		// 	for (int j = 0; j < studentNum; j++) {
		// 		if ((i & (1 << j)) != 0) {
		// 			cnt++;
		// 			for (int k = 0; k < problemNum; k++) {
		// 				if (problemsCopy[k] > 0) {
		// 					problemsCopy[k]--;
		// 				}
		// 			}
		// 		}
		// 	}
		// 	boolean flag = true;
		// 	for (int j = 0; j < problemNum; j++) {
		// 		if (problemsCopy[j] > 0) {
		// 			flag = false;
		// 			break;
		// 		}
		// 	}
		// 	if (flag) {
		// 		if (cnt < min) {
		// 			min = cnt;
		// 			ans = cnt;
		// 		}
		// 	}
		// 	problemsCopy = problems.clone();
		// }
		//
		// System.out.println(ans);
	}

	static void dfs(int sIdx, int solvedPNum, int solvedSNum, boolean[] solvedP) {

		// 전부 푼 경우 ans 확인 후 return;
		if (solvedPNum == problemNum) {
			ans = Math.min(solvedSNum, ans);
			return;
		}
		// 전부 풀지 못했는데, 모든 학생을 다 포함한 경우 그냥 return;
		if (solvedSNum == studentNum) {
			return;
		}

		// 문제의 순서는 상관 없어서 sIdx+1부터 시작.
		for (int i = sIdx + 1; i <= studentNum; i++) {
			if (!solvedS[i]) {
				solvedS[i] = true;
				// 다음 for에서 현재의 visit 처리에 영향받지 않도록 복사해 이용.
				boolean[] copyOfSolvedP = Arrays.copyOf(solvedP, problemNum + 1);
				List<Integer> problemsByStd = students[i];
				int solvedPLen = 0;
				for (int j = 0; j < problemsByStd.size(); j++) {
					// 새로 풀게 된 문제 확인
					int curP = problemsByStd.get(j);
					if (!copyOfSolvedP[curP]) {
						solvedPLen++;
						copyOfSolvedP[curP] = true;
					}
				}
				dfs(i,
					solvedPNum + solvedPLen,
					solvedSNum + 1,
					copyOfSolvedP);

				solvedS[i] = false; // 학생 미방문 처리
				// for (int j = 0; j < solvedPLen; j++) {
				// 	solvedP[problemsByStd.get(j)] = false;
				// }
			}

		}
	}
}
