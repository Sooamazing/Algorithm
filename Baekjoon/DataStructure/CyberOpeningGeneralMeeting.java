package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 24-04-20 60min
// https://www.acmicpc.net/problem/19583
public class CyberOpeningGeneralMeeting {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		LocalTime startMeeting = strArrToLocalTime(st.nextToken().split(":"));
		LocalTime endMeeting = strArrToLocalTime(st.nextToken().split(":"));
		LocalTime endStreaming = strArrToLocalTime(st.nextToken().split(":"));

		Set<String> entranceNameSet = new HashSet<>();
		Set<String> resultSet = new HashSet<>();

		// 중복일 수 있기 때문에 set으로 관리
		// int result = 0;

		String tempStrBr = null;
		while ((tempStrBr = br.readLine()) != null) {

			st = new StringTokenizer(tempStrBr);
			LocalTime curTime = strArrToLocalTime(st.nextToken().split(":"));
			String name = st.nextToken();
			if (!curTime.isAfter(startMeeting)) {
				entranceNameSet.add(name);
			} else if (!curTime.isBefore(endMeeting)
				&& !curTime.isAfter(endStreaming)
				&& entranceNameSet.contains(name)) {
				resultSet.add(name);
			}
		}

		System.out.println(resultSet.size());

	}

	static LocalTime strArrToLocalTime(String[] temp) {
		return LocalTime.of(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
	}

}
