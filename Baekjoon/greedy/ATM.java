package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-10-09 15min
// https://www.acmicpc.net/problem/11399
public class ATM {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int peopleNum = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < peopleNum; i++) {
			pq.add(Integer.parseInt(st.nextToken()));
		}

		int waitingTime = 0;
		int allPeopleWaitingTime = 0;
		for (int i = 0; i < peopleNum; i++) {
			int poll = pq.poll();
			waitingTime += poll;
			allPeopleWaitingTime += waitingTime;
		}
		System.out.println(allPeopleWaitingTime);
	}
}
