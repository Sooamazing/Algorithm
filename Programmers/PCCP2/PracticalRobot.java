package Programmers.PCCP2;

public class PracticalRobot {
	public static void main(String[] args) {
		int[] ans = new int[2];
		// ans = solution("GRGLGRG");
		ans = solution("GRGRGRB");
		System.out.println("ans[0]+\" \"+ans[1] = " + ans[0] + " " + ans[1]);
	}

	static public int[] solution(String command) {
		int[] answer = {};

		int[][] dxdy = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

		int[] temp = {0, 0};
		int idx = 0;
		for (int i = 0; i < command.length(); i++) {
			char c = command.charAt(i);
			switch (c) {
				case 'R':
					idx = (idx + 1) % 4;
					break;
				case 'L':
					idx = ((idx - 1) % 4) == -1 ? 3 : (idx - 1) % 4;
					break;
				case 'G':
					temp[0] += dxdy[idx][0];
					temp[1] += dxdy[idx][1];
					break;
				case 'B':
					temp[0] -= dxdy[idx][0];
					temp[1] -= dxdy[idx][1];
					break;
				default:
					break;
			}
		}

		answer = temp;

		return answer;
	}
}
