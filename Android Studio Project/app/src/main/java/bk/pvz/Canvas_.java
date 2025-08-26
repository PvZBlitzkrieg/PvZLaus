package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_4581.rn_4582.rn_4583.rn_9105;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_6840.rn_6841.rn_6842.rn_3289;
import bk.pvz.Paint_;

public class Canvas_ {
	public static android.graphics.Canvas rn_1696(android.graphics.Bitmap rn_1697) {
		return new android.graphics.Canvas(rn_1697);
	}

	public static void rn_1713(android.graphics.Canvas r_obj, String rn_1714, int rn_1715, int rn_1716, android.graphics.Paint rn_1717) {
		r_obj.drawText(rn_1714,rn_1715,rn_1716,rn_1717);
	}
}