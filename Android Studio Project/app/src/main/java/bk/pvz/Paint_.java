package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_6945;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_6840.rn_6841.rn_6842.rn_3289;
import bk.pvz.Typeface_;

public class Paint_ {
	public static android.graphics.Paint rn_1663() {
		return new android.graphics.Paint();
	}

	public static android.graphics.Paint rn_1665(android.graphics.Paint r_obj, android.graphics.Typeface rn_1666) {
		r_obj.setTypeface(rn_1666);
		return r_obj;
	}

	public static android.graphics.Paint rn_1667(android.graphics.Paint r_obj, int rn_1668) {
		r_obj.setTextSize(rn_1668);
		return r_obj;
	}

	public static float rn_1669(android.graphics.Paint r_obj) {
		return r_obj.getTextSize();
	}

	public static android.graphics.Paint rn_1670(android.graphics.Paint r_obj, int rn_1671) {
		r_obj.setColor(rn_1671);
		return r_obj;
	}

	public static float rn_1673(android.graphics.Paint r_obj, String rn_1674) {
		return r_obj.measureText(rn_1674);
	}
}