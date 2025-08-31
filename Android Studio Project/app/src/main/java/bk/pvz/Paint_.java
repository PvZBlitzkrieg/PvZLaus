package bk.pvz;
import rn_6672.rn_6673.rn_6674.rn_6777;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_6672.rn_6673.rn_6674.rn_6760;
import bk.pvz.Typeface_;

public class Paint_ {
	public static android.graphics.Paint rn_1526() {
		return new android.graphics.Paint();
	}

	public static android.graphics.Paint rn_1528(android.graphics.Paint r_obj, android.graphics.Typeface rn_1529) {
		r_obj.setTypeface(rn_1529);
		return r_obj;
	}

	public static android.graphics.Paint rn_1530(android.graphics.Paint r_obj, int rn_1531) {
		r_obj.setTextSize(rn_1531);
		return r_obj;
	}

	public static float rn_1532(android.graphics.Paint r_obj) {
		return r_obj.getTextSize();
	}

	public static android.graphics.Paint rn_1533(android.graphics.Paint r_obj, int rn_1534) {
		r_obj.setColor(rn_1534);
		return r_obj;
	}

	public static float rn_1536(android.graphics.Paint r_obj, String rn_1537) {
		return r_obj.measureText(rn_1537);
	}
}