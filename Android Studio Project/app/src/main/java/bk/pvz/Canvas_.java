package bk.pvz;
import bk.pvz.Paint_;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_4413.rn_4414.rn_4415.rn_8937;

public class Canvas_ {
	public static android.graphics.Canvas rn_1559(android.graphics.Bitmap rn_1560) {
		return new android.graphics.Canvas(rn_1560);
	}

	public static void rn_1576(android.graphics.Canvas r_obj, String rn_1577, int rn_1578, int rn_1579, android.graphics.Paint rn_1580) {
		r_obj.drawText(rn_1577,rn_1578,rn_1579,rn_1580);
	}
}