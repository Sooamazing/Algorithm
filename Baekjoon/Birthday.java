package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Birthday {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int personNum = Integer.parseInt(br.readLine());
		List<Person> list = new ArrayList<>();

		for (int i = 0; i < personNum; i++) {
			String[] split = br.readLine().split(" ");
			list.add(new Person(
				split[0]
				, Integer.parseInt(split[1])
				, Integer.parseInt(split[2])
				, Integer.parseInt(split[3])));
		}

		Collections.sort(list, ((o1, o2) -> {
				if (o1.year == o2.year) {
					if (o1.month == o2.month) {
						return o2.day - o1.day;
					}
					return o2.month - o1.month;
				}
				return o2.year - o1.year;
			})
		);

		System.out.print(list.get(0).name + "\n" + list.get(personNum - 1).name);

	}

	private static class Person {

		String name;
		int day;
		int month;
		int year;

		Person(String name, int day, int month, int year) {
			this.name = name;
			this.day = day;
			this.month = month;
			this.year = year;
		}

	}
}
