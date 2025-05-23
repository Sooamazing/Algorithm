package Baekjoon.Implement;

import java.time.LocalDate;

// 25-05-23 10min
// https://www.acmicpc.net/problem/16170
public class WhatsTodayDate {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		LocalDate now = LocalDate.now();
		sb.append(now.toString().replace("-", "\n"));
		System.out.println(sb);
	}
}
