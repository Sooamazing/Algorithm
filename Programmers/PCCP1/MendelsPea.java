//https://certi.programmers.co.kr/about/sample
package Programmers.PCCP1;

public class MendelsPea {

	public static void main(String[] args) {
		// 완두콩의 세대와 해당 세대에서 몇 번째 개체인지를 알면 형질을 바로 계산하는 프로그램을 만들려 합니다.
		// int[][] arr = {{3,5}};
		int[][] arr = {{3, 1}, {2, 3}, {3, 9}};
		solution(arr);

	}

	static public String[] solution(int[][] queries) {
		int queryLength = queries.length;
		String[] answer = new String[queryLength];

		for (int i = 0; i < queryLength; i++) {
			int gen = queries[i][0];
			int individual = queries[i][1];
			answer[i]=findOne(gen, individual);
		}

		return answer;
	}

	private static String findOne(int gen, int individual) {
		if (gen == 1) {
			return "Rr";
		}
		int prevOrder = (individual - 1) / 4 + 1;
		String parent = findOne(gen - 1, prevOrder);
		if (parent == "RR" || parent == "rr")
			return parent;
		switch (individual%4){
			case 1:
				return "RR";
			case 2: case 3:
				return "Rr";
			case 0:
				return "rr";
			default: return "0";
		}
	}

}
