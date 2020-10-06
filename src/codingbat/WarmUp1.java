package codingbat;

public class WarmUp1 {
	public boolean sleepIn(boolean weekday, boolean vacation) {

		return !weekday || vacation;

	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return !(aSmile ^ bSmile);
	}

	public int sumDouble(int a, int b) {
		int sum = a + b;

		sum = (a == b) ? sum * 2 : sum;

		return sum;
	}

	public int diff21(int n) {
		int diff = 21 - n;
		diff = (n > 21) ? diff * 2 : diff;
		diff = (diff < 0) ? -diff : diff;
		return diff;
	}

	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && (hour < 7 || hour > 20);
	}

	public boolean makes10(int a, int b) {
		int sum = a + b;

		return (sum == 10) || (a == 10) || (b == 10);
	}

	public boolean nearHundred(int n) {
		boolean d100 = (n >= 90) && (n <= 110);
		boolean d200 = (n >= 190) && (n <= 210);

		return d100 || d200;
	}

	public boolean posNeg(int a, int b, boolean negative) {
		boolean aneg = a < 0;
		boolean bneg = b < 0;

		return negative ? (aneg && bneg) : (aneg ^ bneg);
	}

	public String notString(String str) {
		int ind = str.indexOf("not");

		if (ind != 0) {
			String res = "not " + str;
			return res;
		}

		return str;
	}

	public String missingChar(String str, int n) {
		String left = str.substring(0, n);
		String right = str.substring(n + 1);

		return left + right;
	}

}
