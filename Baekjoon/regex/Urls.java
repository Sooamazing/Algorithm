package Baekjoon.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 24-05-04 90min
// https://www.acmicpc.net/problem/6324
// :, / 순서로 확인 시 반례 http://www.acmicpc.net/abc://def
// 참고: https://aorica.tistory.com/197
public class Urls {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());

		// String regex = "(http|ftp|gopher)://([\\w.-]+)(?::([\\d]+))?(?:/([\\S]+))?";
		String regex = "(http|ftp|gopher)://([a-zA-Z0-9_.-]+)(:([0-9]+))?(/[\\S]+)?";
		// _위치에 따라 Host가 달라짐.
		// ?: 필수! ?:는 찾지만, 그룹에 포함되지는 않음!

		Pattern pattern = Pattern.compile(regex);

		// 매칭되는 문구를 순서대로 arr에 담아줌.
		String[] strArr = new String[] {"Protocol = ", "Host     = ", "Port     = ", "Path     = "};

		for (int i = 1; i <= testCase; i++) {
			sb.append("URL #").append(i).append("\n");
			String curStr = br.readLine();
			Matcher matcher = pattern.matcher(curStr);
			boolean find = matcher.find();

			for (int j = 1; j <= 4; j++) {
				// matcher로 빼지 않고 pattern.으로 계속 사용 시  IllegalStateException: No match found

				// 내 regex는 find 들어가야 에러가 안 남. 왜?
				if (find) {
					String curGroup = matcher.group(j);
					if (curGroup != null) {
						sb.append(strArr[j - 1]).append(curGroup).append("\n");
					} else {
						sb.append(strArr[j - 1]).append("<default>").append("\n");
					}
				}

			}
			sb.append("\n");
		}

		// System.out.println(sb);

		// < protocol > "://" < host > [ ":" < port > ] [ "/" < path > ]
		// for (int i = 1; i <= testCase; i++) {
		// 	String curUrl = br.readLine();
		//
		// 	// URL 순서
		// 	sb.append("URL #").append(i).append("\n");
		//
		// 	// protocol 추가
		// 	String[] protocolSplit = curUrl.split("://");
		// 	sb.append("Protocol = ").append(protocolSplit[0]).append("\n");
		//
		// 	// path 찾기
		// 	int indexOfSlash = protocolSplit[1].indexOf("/");
		//
		// 	if (indexOfSlash != -1) {
		// 		// path가 있으면
		//
		// 		String hostAndPort = protocolSplit[1].substring(0, indexOfSlash);
		// 		String path = protocolSplit[1].substring(indexOfSlash + 1);
		//
		// 		// port 찾기
		// 		int indexOfColon = hostAndPort.indexOf(":");
		// 		if (indexOfColon != -1) {
		//
		// 			// port가 있으면
		// 			String host = hostAndPort.substring(0, indexOfColon);
		// 			String port = hostAndPort.substring(indexOfColon + 1);
		//
		// 			sb.append("Host     = ").append(host).append("\n");
		// 			sb.append("Port     = ").append(port).append("\n");
		// 			sb.append("Path     = ").append(path).append("\n");
		//
		// 		} else {
		// 			// port가 없으면
		// 			sb.append("Host     = ").append(hostAndPort).append("\n");
		// 			sb.append("Port     = ").append("<default>").append("\n");
		// 			sb.append("Path     = ").append(path).append("\n");
		// 		}
		// 	} else {
		// 		// path가 없으면
		//
		// 		// port 찾기
		// 		int indexOfColon = protocolSplit[1].indexOf(":");
		// 		if (indexOfColon != -1) {
		//
		// 			// port가 있으면
		// 			String host = protocolSplit[1].substring(0, indexOfColon);
		// 			String port = protocolSplit[1].substring(indexOfColon + 1);
		//
		// 			sb.append("Host     = ").append(host).append("\n");
		// 			sb.append("Port     = ").append(port).append("\n");
		// 			sb.append("Path     = ").append("<default>").append("\n");
		//
		// 		} else {
		// 			// port가 없으면
		// 			sb.append("Host     = ").append(protocolSplit[1]).append("\n");
		// 			sb.append("Port     = ").append("<default>").append("\n");
		// 			sb.append("Path     = ").append("<default>").append("\n");
		// 		}
		//
		// 	}
		//
		// }
		System.out.println(sb);
	}
}
