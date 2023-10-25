//https://certi.programmers.co.kr/about/sample

package Programmers.PCCP1;

//체육대회
class AthleticsCompetition {
	public static void main(String[] args) {
		int[][] ability = {{40, 10, 10}, {20, 5, 0}, {30, 30, 30}, {70, 0, 70}, {100, 100, 100}};
		int[][] ability2 = {{20, 30}, {30, 20}, {20, 30}};
		System.out.println(solution(ability2));
	}

	public static int solution(int[][] ability) {
		int answer = 0;

		categoryNum = ability[0].length;
		studentNum = ability.length;
		visited = new boolean[studentNum];
		arr = new int[categoryNum];

		perm(ability, 0);
		answer = max;
		return answer;
	}

	static int max;
	static int[] arr;
	static boolean[] visited;
	static int categoryNum;
	static int studentNum;

	private static void perm(int[][] ability, int depth) {
		if (depth == categoryNum) {
			int sum = 0;
			for (int i = 0; i < categoryNum; i++) {
				sum += arr[i];
			}
			max = Math.max(max, sum);
			return;
		}

		for (int i = 0; i < studentNum; i++) {
			if (visited[i]) {
				continue;
			}
			visited[i] = true;
			arr[depth] = ability[i][depth];
			perm(ability, depth + 1);
			visited[i] = false;
		}
	}
}
