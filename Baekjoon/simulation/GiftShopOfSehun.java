package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-09-12 30min
// https://www.acmicpc.net/problem/17225
public class GiftShopOfSehun {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int blueNum = Integer.parseInt(st.nextToken());
		int redNum = Integer.parseInt(st.nextToken());
		int customerNum = Integer.parseInt(st.nextToken());

		// Queue<Integer> blueQ = new LinkedList<>();
		// Queue<Integer> redQ = new LinkedList<>();

		int numToBeWrappedByBluePresent = 0;
		int numToBeWrappedByRedPresent = 0;
		int curTime;
		int blueTime = 0;
		int redTime = 0;
		for (int i = 0; i < customerNum; i++) {
			st = new StringTokenizer(br.readLine());
			curTime = Integer.parseInt(st.nextToken());
			boolean isBlue = st.nextToken().charAt(0) == 'B';
			int giftNum = Integer.parseInt(st.nextToken());
			if (isBlue) {
				numToBeWrappedByBluePresent += giftNum;
			} else {
				numToBeWrappedByRedPresent += giftNum;
			}

			if (i == 0) {
				blueTime = curTime;
				redTime = curTime;
				continue;
			}

			if (numToBeWrappedByBluePresent > 0) {
				// if(blueTime+blueNum<)
			}

		}

	}
}
