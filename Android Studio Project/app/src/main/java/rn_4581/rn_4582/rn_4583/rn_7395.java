package rn_4581.rn_4582.rn_4583;
import java.util.*;
import java.util.regex.*;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_6961;
import rn_6840.rn_6841.rn_6842.rn_4301;

public class rn_7395 {
	private static String partTranslate(int amountPart) {
		if ((amountPart < 0) || (amountPart > 10000)) {
			return "";
		}
		String[] chineseDigits = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
		String[] units = { "", "拾", "佰", "仟" };
		int temp = amountPart;
		String amountStr = new Integer(amountPart).toString();
		int amountStrLength = amountStr.length();
		boolean lastIsZero = true;
		String chineseStr = "";
		for (int i = 0; 
		(i < amountStrLength) && (temp != 0); i++) {
			int digit = temp % 10;
			if (digit == 0) {
				if (!lastIsZero) {
					chineseStr = "零" + chineseStr;
				}
				lastIsZero = true;
			} else {
				chineseStr = chineseDigits[digit] + units[i] + chineseStr;
				lastIsZero = false;
			}
			temp /= 10;
		}
		return chineseStr;
	}

	private static int parse(char c) {
		if (c >= 'a') {
			return c - 'a' + 10 & 0xF;
		}
		if (c >= 'A') {
			return c - 'A' + 10 & 0xF;
		}
		return c - '0' & 0xF;
	}

	public static final int rn_7410(byte[] rn_7411) {
		int targets = rn_7411[0] & 0xFF | rn_7411[1] << 8 & 0xFF00 | rn_7411[2] << 24 >>> 8 | rn_7411[3] << 24;
		return targets;
	}
}