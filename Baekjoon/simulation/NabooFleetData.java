package Baekjoon.simulation;

// 24-12-21 5min
public class NabooFleetData {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("SHIP NAME      CLASS          DEPLOYMENT IN SERVICE\n")
			.append("N2 Bomber      Heavy Fighter  Limited    21        \n")
			.append("J-Type 327     Light Combat   Unlimited  1         \n")
			.append("NX Cruiser     Medium Fighter Limited    18        \n")
			.append("N1 Starfighter Medium Fighter Unlimited  25        \n")
			.append("Royal Cruiser  Light Combat   Limited    4         \n");
		System.out.println(sb);
	}
}
