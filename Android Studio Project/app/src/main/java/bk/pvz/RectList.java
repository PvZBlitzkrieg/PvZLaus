package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.Rectx;

public class RectList {
	public static Rectx rn_3713(java.util.ArrayList<Rectx> r_obj, int rn_3714) {
		return RectList.rn_3729(r_obj, rn_3714);
	}

	public static void rn_3721(java.util.ArrayList<Rectx> r_obj, Rectx rn_3722) {
		r_obj.add(rn_3722);
	}

	public static Rectx rn_3729(java.util.ArrayList<Rectx> r_obj, int rn_3730) {
		return r_obj.get(rn_3730);
	}

	public static int rn_1225(java.util.ArrayList<Rectx> r_obj) {
		return r_obj.size();
	}
}