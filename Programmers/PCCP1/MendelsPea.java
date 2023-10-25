//https://certi.programmers.co.kr/about/sample
package Programmers.PCCP1;

public class MendelsPea {

	public static void main(String[] args) {
		// 완두콩의 세대와 해당 세대에서 몇 번째 개체인지를 알면 형질을 바로 계산하는 프로그램을 만들려 합니다.
	}

	public String[] solution(int[][] queries) {
		String[] answer = {};
		for (int i = 0; i < queries.length; i++) {
			int N = queries[i][0];
			int M = queries[i][1];

			String[][] dp = new String[N][M];
			dp[0][0] = "Rr";
			for (int j = 0; j < queries.length; j++) {
				// if()
			}

		}

		return answer;
	}

}
