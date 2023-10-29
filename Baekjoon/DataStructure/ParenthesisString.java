package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ParenthesisString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {
			String bracket = br.readLine();
			String[] split = bracket.split("");
			int sum = 0;
			// boolean flag;
			for (int j = 0; j < split.length; j++) {
				// Queue<String> que = new LinkedList<>();
				// que.add(st.nextToken());

				if (split[j].equals("(") ) {
					sum += 1;
					// flag = true;
				} else {
					sum -= 1;
					if (sum < 0) {
						// flag = true;
						break;
					}
					// else {
					// 	flag = false;
					// }
				}

				// if(!flag){
				// 	break;
				// }
			}

			if (sum == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
