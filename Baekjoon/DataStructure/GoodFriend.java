package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class GoodFriend {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int totalFriendNum = Integer.parseInt(st.nextToken());
		int stdDistance = Integer.parseInt(st.nextToken());

		Map<Integer, List<Person>> map = new HashMap<>();
		// List<Person> list = new ArrayList<>();

		for (int i = 1; i <= totalFriendNum; i++) {
			String name = br.readLine();
			int nameLen = name.length();

			if (map.containsKey(nameLen)) {
				List<Person> list = map.get(nameLen);
				list.add(Person.of(i, name));
			} else {
				List<Person> list = new ArrayList<>();
				list.add(Person.of(i, name));
				map.put(nameLen, list);
			}

		}

		int goodFriendPair = 0;
		for (List<Person> list : map.values()) {
			for (int i = 0; i < list.size(); i++) {
				Person stdPerson = list.get(i);
				for (int j = i + 1; j < list.size(); j++) {
					Person friend = list.get(j);
					if (friend.grade - stdPerson.grade <= stdDistance) {
						goodFriendPair++;
					} else {
						break;
					}
				}
			}

		}

		System.out.println(goodFriendPair);

	}

	private static class Person {
		String name;
		int grade;
		int length;

		public static Person of(int grade, String name) {
			Person person = new Person();
			person.grade = grade;
			person.name = name;
			person.length = name.length();
			return person;
		}
	}

}
