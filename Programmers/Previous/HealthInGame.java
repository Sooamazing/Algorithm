package Programmers.Previous;

public class HealthInGame {
	public static void main(String[] args) {

	}

	static public int solution(int[] bandage, int health, int[][] attacks) {
		int answer = 0;
		int maxAttackTime = 0;
		int maxHealth = health;

		// 어차피 마지막이 max
		for (int i = 0; i < attacks.length; i++) {
			maxAttackTime = Math.max(maxAttackTime, attacks[i][0]);
		}

		int attackIdx = 0;
		int neededHealthSecond = bandage[0];
		int upgageHealthperSecond = bandage[1];
		int plusHealthgage = bandage[2];
		int persisHealthcnt = 0;
		System.out.println("neededHealthSecond: " + neededHealthSecond);

		for (int i = 1; i < maxAttackTime + 1; i++) {

			if (i == attacks[attackIdx][0]) {
				health -= attacks[attackIdx][1];
				attackIdx++;
				persisHealthcnt = 0;
				if (health <= 0) {
					return -1;
				}
				continue;
			}

			if (health < maxHealth) {
				health = health + upgageHealthperSecond < maxHealth ? health + upgageHealthperSecond : maxHealth;
				persisHealthcnt++;
				if (persisHealthcnt == neededHealthSecond) {
					System.out.println("in");
					health = health + plusHealthgage <= maxHealth ? health + plusHealthgage : maxHealth;
					// 초기화 안 돼서 통과 X
					persisHealthcnt=0;
				}
			}

			System.out.println("second: " + i + ", health: " + health);
		}

		return health;
	}

}
