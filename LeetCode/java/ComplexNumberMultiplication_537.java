package LeetCode.java;

// 26-06-05 10min
// https://leetcode.com/problems/complex-number-multiplication/
class ComplexNumberMultiplication_537 {

    public String complexNumberMultiply(String num1, String num2) {

        String[] num1Arr = num1.split("\\+");
        String[] num2Arr = num2.split("\\+");

        int num1Real = Integer.parseInt(num1Arr[0]);
        int num2Real = Integer.parseInt(num2Arr[0]);
        int num1Imaginaryi = Integer.parseInt(num1Arr[1].substring(0, num1Arr[1].length() - 1));
        int num2Imaginaryi = Integer.parseInt(num2Arr[1].substring(0, num2Arr[1].length() - 1));
        int real = num1Real * num2Real - num1Imaginaryi * num2Imaginaryi;
        int imaginaryi = num1Real * num2Imaginaryi + num2Real * num1Imaginaryi;

        return real + "+" + imaginaryi + "i";
    }
}