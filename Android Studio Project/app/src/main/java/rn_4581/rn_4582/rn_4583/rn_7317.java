package rn_4581.rn_4582.rn_4583;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_6840.rn_6841.rn_6842.rn_6941;

public class rn_7317 {
	private static int priority(char s) {
		switch (s) {
			case '(':
			case ')':
				return 0;
			case '-':
			case '+':
				return 1;
			case '*':
			case '%':
			case '/':
				return 2;
			default:
				return -1;

		}
	}

	private static double compute(double num1, double num2, char s) {
		switch (s) {
			case '(':
			case ')':
				return 0;
			case '-':
				return num1 - num2;
			case '+':
				return num1 + num2;
			case '%':
				return num1 % num2;
			case '*':
				return num1 * num2;
			case '/':
				return num1 / num2;
			default:
				return 0;

		}
	}

	public static final double rn_7322(double rn_7323) {
		return Math.cos(rn_7323);
	}

	public static final int rn_7328(int rn_7329, int rn_7330) {
		return (int)(Math.random() * (rn_7330 + 1- rn_7329) + rn_7329);
	}

	public static final double rn_7331(double rn_7332, double rn_7333) {
		return (Math.random() * (rn_7333 + 1- rn_7332) + rn_7332);
	}

	public static final double rn_7334(double rn_7335) {
		return Math.sin(rn_7335);
	}

	public static final double rn_7338(double rn_7339) {
		return Math.abs(rn_7339);
	}

	public static final double rn_7356(double rn_7357) {
		return Math.toRadians(rn_7357);
	}

	public static final double rn_7360(double rn_7361, int rn_7362) {
		return new java.math.BigDecimal(String.valueOf(rn_7361)).setScale(rn_7362, 4).doubleValue();
	}
}