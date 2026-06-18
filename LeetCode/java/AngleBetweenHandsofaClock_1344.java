package LeetCode.java;

// 26-06-18 25min
// https://leetcode.com/problems/angle-between-hands-of-a-clock
public class AngleBetweenHandsofaClock_1344 {

    public double angleClock(int hour, int minutes) {
        // 1hour: 360/12
        double degreePerHour = (360.0 / 12.0) / (60.0 / minutes) + (hour % 12.0) * (360.0 / 12.0);
        double degreePerMinutes = (360.0 / 60.0) * minutes;

        System.out.println(degreePerHour);
        System.out.println(degreePerMinutes);

        double answer = Math.abs(degreePerHour - degreePerMinutes) > 180 ? 360 - Math.abs(
                degreePerHour - degreePerMinutes) : Math.abs(degreePerHour - degreePerMinutes);

        return answer;
    }
}